package practice.geekForGeeks.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Problem 04: Given an integer, write a function that returns true if the given number is palindrome, else false.
 For example, 12321 is palindrome, but 1451 is not palindrome. */

public class p04_CheckIfANumberIsPalindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String number = bufferedReader.readLine();

        String result = isPalindrome(number) ? "yes" : "no";

        System.out.println(result);
    }

    private static boolean isPalindrome(String number) {
        if (number.length() <= 1){
            return true;
        }

        char firstSymbol = number.charAt(0);
        char lastSymbol = number.charAt(number.length() - 1);

        if (firstSymbol == lastSymbol){
            return isPalindrome(number.substring(1, number.length() - 1));
        } else {
            return false;
        }
    }
}
