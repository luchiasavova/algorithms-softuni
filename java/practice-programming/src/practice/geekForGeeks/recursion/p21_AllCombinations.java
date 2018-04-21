/*Problem 21: Print all increasing sequences of length k from first n natural numbers
Given two positive integers n and k, print all increasing sequences of length k
such that the elements in every sequence are from first n natural numbers.

Examples:

Input: k = 2, n = 3
Output: 1 2
        1 3
        2 3

Input: k = 5, n = 5
Output: 1 2 3 4 5

Input: k = 3, n = 5
Output: 1 2 3
        1 2 4
        1 2 5
        1 3 4
        1 3 5
        1 4 5
        2 3 4
        2 3 5
        2 4 5
        3 4 5*/

package practice.geekForGeeks.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p21_AllCombinations {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(bufferedReader.readLine());
        int n = Integer.parseInt(bufferedReader.readLine());

        int[] set = new int[k];

        genCombinations(0, 0, set, n);
    }

    private static void genCombinations(int index, int start, int[] set, int n) {
        if (index == set.length) {
            System.out.println(Arrays.toString(set).replaceAll("[\\[\\],]", ""));
            return;
        }

        for (int i = start; i < n; i++) {
            set[index] = i + 1;
            genCombinations(index + 1, i + 1, set, n);
        }
    }
}
