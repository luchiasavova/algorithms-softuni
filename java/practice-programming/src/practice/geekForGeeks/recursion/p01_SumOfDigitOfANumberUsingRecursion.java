package practice.geekForGeeks.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Problem 1: Given a number, we need to find sum of its digits using recursion.*/

public class p01_SumOfDigitOfANumberUsingRecursion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String inputNumber = bufferedReader.readLine();

        long sum = recursiveSum(0, inputNumber);

        System.out.println(sum);
    }

    private static long recursiveSum(int index, String inputNumber) {
        if (index == inputNumber.length()) {
            return 0;
        }

        int currentDigit = inputNumber.charAt(index) - '0';

        return currentDigit + recursiveSum(index + 1, inputNumber);
    }
}
