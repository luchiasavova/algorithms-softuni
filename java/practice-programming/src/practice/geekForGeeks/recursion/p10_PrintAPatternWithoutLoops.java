/*Problem 10: Print a pattern without using any loop
Given a number n, print following pattern without using any loop.

Input: n = 16
Output: 16, 11, 6, 1, -4, 1, 6, 11, 16

Input: n = 10
Output: 10, 5, 0, 5, 10

We basically first reduce 5 one by one until we reach a negative or 0.
After we reach 0 or negative, we one add 5 until we reach n.
*/

package practice.geekForGeeks.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10_PrintAPatternWithoutLoops {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        printPattern(n);
    }

    private static void printPattern(int n){
        if (n <= 0){
            System.out.print(n + " ");
            return;
        }

        printLine(n);

        printPattern(n - 5);

        printLine(n);
    }

    private static void printLine(int n){
        System.out.print(n + " ");
    }
}
