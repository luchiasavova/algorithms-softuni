package practice.geekForGeeks.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Problem 06: Given a number n, check whether it’s prime number or not using recursion.

public class p06_RecursiveProgramForPrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(bufferedReader.readLine());

        String result;
        if (number < 2) {
            result = "no";
        } else {
            result = isPrime(2, number) ? "yes" : "no";
        }

        System.out.println(result);
    }

    private static boolean isPrime(int i, int number) {
        if (number == 2){
            return true;
        }

        if (number % i == 0) {
            return false;
        }

        if (i * i > number) {
            return true;
        }

        return isPrime(i + 1, number);
    }
}
