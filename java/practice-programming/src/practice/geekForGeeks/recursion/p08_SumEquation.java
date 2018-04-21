/*Problem 08: Number of non-negative integral solutions of sum equation

Given a number n (number of variables) and val (sum of the variables),
find out how many such non negative integral solutions are possible.

Examples:

Input : n = 5, val = 1
Output : 5
Explanation:
x1 + x2 + x3 + x4 + x5 = 1
Number of possible solution are :
(0 0 0 0 1), (0 0 0 1 0), (0 0 1 0 0),
(0 1 0 0 0), (1 0 0 0 0)
Total number of possible solutions are 5

Input : n = 5, val = 4
Output : 70
Explanation:
x1 + x2 + x3 + x4 + x5 = 4
Number of possible solution are:
(1 1 1 1 0), (1 0 1 1 1), (0 1 1 1 1),
(2 1 0 0 1), (2 2 0 0 0)........ so on......
Total numbers of possible solutions are 70
*/

package practice.geekForGeeks.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p08_SumEquation {
    private static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        int targetSum = Integer.parseInt(bufferedReader.readLine());

        int[] set = new int[n];
        cnt = 0;

        generateSum(0, set, targetSum);

        System.out.println(cnt);
    }

    private static void generateSum(int index, int[] set, int targetSum) {
        if (index == set.length) {
            int setSum = Arrays.stream(set).sum();

            if (targetSum == setSum) {
                cnt++;
            }
            return;
        }

        for (int i = 0; i < 10; i++) {
            set[index] = i;

            generateSum(index + 1, set, targetSum);
        }
    }
}
