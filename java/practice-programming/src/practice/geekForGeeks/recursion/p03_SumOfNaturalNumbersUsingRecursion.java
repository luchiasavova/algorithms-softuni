package practice.geekForGeeks.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Problem 03: Given a number n, find sum of first n natural numbers. Use recursion! */

public class p03_SumOfNaturalNumbersUsingRecursion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        int sum = calculateSum(n);

        System.out.println(sum);
    }

    private static int calculateSum(int n) {
        if (n == 0) {
            return 0;
        }

        return n + calculateSum(n - 1);
    }
}
