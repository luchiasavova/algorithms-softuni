/* Problem 11: Generate all binary strings without consecutive 1’s
Given a integer K. Task is Print All binary string of size K (Given number).

Examples:

Input : K = 3
Output : 000, 001, 010, 100, 101

Input : K  = 4
Output :0000, 0001, 0010, 0100, 0101, 1000, 1001, 1010*/

package practice.geekForGeeks.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p11_GenerateBinaryStrWithoutConsecutive {
    private static StringBuilder result;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        int[] set = new int[n];
        result = new StringBuilder();

        gen01Vectors(0, set);

        System.out.println(result.substring(0, result.length() - 2));
    }

    private static void gen01Vectors(int index, int[] set) {
        if (index == set.length) {
            result.append(Arrays.toString(set).replaceAll("[\\[\\], ]", "") + ", ");

            return;
        }


        for (int i = 0; i < 2; i++) {
            set[index] = i;

            if (index != 0 && set[index - 1] == 1 && set[index] == set[index - 1]) {
                continue;
            }

            gen01Vectors(index + 1, set);
        }
    }
}
