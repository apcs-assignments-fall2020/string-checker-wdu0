import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTests {

    @Test
    public void testCountABC() {
        assertEquals(3, MyMain.countABC("aaa"), "The string \"aaa\" should contain the following number of a's, b's, or c's: 3");
        assertEquals(3, MyMain.countABC("bbb"), "The string \"bbb\" should contain the following number of a's, b's, or c's: 3");
        assertEquals(3, MyMain.countABC("ccc"), "The string \"ccc\" should contain the following number of a's, b's, or c's: 3");
        assertEquals(3, MyMain.countABC("abc"), "The string \"abc\" should contain the following number of a's, b's, or c's: 3");
        assertEquals(3, MyMain.countABC("abc"), "The string \"cab\" should contain the following number of a's, b's, or c's: 3");
        assertEquals(0, MyMain.countABC("xyz"), "The string \"xyz\" should contain the following number of a's, b's, or c's: 0");
        assertEquals(4, MyMain.countABC("racecar"), "The string \"racecar\" should contain the following number of a's, b's, or c's: 4");
        assertEquals(11, MyMain.countABC("amanaplanacanalpanama"), "The string \"amanaplanacanalpanama\" should contain the following number of a's, b's, or c's: 11");
    }

    @Test
    public void testContainsThe() {
        assertEquals(false, MyMain.containsThe("aaa"), "Whether the string \"aaa\" contains \"the\" should return: false");
        assertEquals(true, MyMain.containsThe("athenian"), "Whether the string \"athenian\" contains \"the\" should return: true");
        assertEquals(true, MyMain.containsThe("the school"), "Whether the string \"the school\" contains \"the\" should return: true");
        assertEquals(true, MyMain.containsThe("The pineapple"), "Whether the string \"The pineapple\" contains \"the\" should return: true");
        assertEquals(false, MyMain.containsThe("racecar"), "Whether the string \"racecar\" contains \"the\" should return: false");
        assertEquals(false, MyMain.containsThe("xyz"), "Whether the string \"xyz\" contains \"the\" should return: false");
        assertEquals(false, MyMain.containsThe("amanaplanacanalpanama"), "Whether the string \"amanaplanacanalpanama\" contains \"the\" should return: false");
    
    }

    @Test
    public void testIsPalindrome() {
        assertEquals(true, MyMain.isPalindrome("aaa"), "Whether the string \"aaa\" is a palindrome should return: true");
        assertEquals(true, MyMain.isPalindrome("abba"), "Whether the string \"abba\" is a palindrome should return: true");
        assertEquals(true, MyMain.isPalindrome("abccba"), "Whether the string \"abccba\" is a palindrome should return: true");
        assertEquals(false, MyMain.isPalindrome("xyz"), "Whether the string \"xyz\" is a palindrome should return: false");
        assertEquals(false, MyMain.isPalindrome("athenian"), "Whether the string \"athenian\" is a palindrome should return: false");
        assertEquals(true, MyMain.isPalindrome("racecar"), "Whether the string \"racecar\" is a palindrome should return: true");
        assertEquals(true, MyMain.isPalindrome("amanaplanacanalpanama"), "Whether the string \"amanaplanacanalpanama\" is a palindrome should return: true");
    }


}
