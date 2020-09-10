import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int len = str.length();
        int num = 0;
        for (int i = 0; i < len; i++) {
            char letter = str.charAt(i);
            if (letter == 'a' || letter == 'b' || letter == 'c') {
                num += 1;
            }
        }
        return num;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        int len = str.length();
        int contain = 0;
        for (int i = 0; i < (len-2); i++) {
            String check = str.substring(i, i+3);
            if (check.equals("the") || check.equals("The")) {
                contain += 1;
            }
        }
        boolean result = (contain >= 1);
        return result;
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        int len = str.length();
        int re = 0;
        for (int i = 0; i < (len/2-1); i++) {
            char len1 = str.charAt(i);
            char len2 = str.charAt(len - i - 1);
            if (len1 != len2) {
                re += 1;
            }
        }
        boolean result = (re == 0);
        return result;
    }
    
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String input = scan.nextLine();
        int x = countABC(input);
        Boolean y = containsThe(input);
        Boolean z = isPalindrome(input);

        System.out.println("Your string contains " + x + " a's, b's, or c's.");
        if (y == true) {
            System.out.println("Your string DOES contain the.");
        }
        else {
            System.out.println("Your string DOES NOT contain the.");
        }
        if (z == true) {
            System.out.println("Your string IS a palindrome.");
        }
        else {
            System.out.println("Your string IS NOT a palindrome.");
        }

        scan.close();
    }
}
