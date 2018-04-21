/*Problem 09: Decimal to binary number using recursion
Given a decimal number as input, we need to write a program to convert the given decimal number into equivalent binary number.
Examples:

Input : 7
Output :111

Input :10
Output :1010  */

package practice.geekForGeeks.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p09_DecimalToBinaryNumberUsingRecursion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int decimalNumber = Integer.parseInt(bufferedReader.readLine());

        System.out.println(binaryNumber(decimalNumber));
    }

    private static int binaryNumber(int decimalNumber) {
        if (decimalNumber == 0){
            return 0;
        }

        int reminder  = decimalNumber % 2;
        return  reminder + 10 * binaryNumber(decimalNumber / 2);
    }
}
