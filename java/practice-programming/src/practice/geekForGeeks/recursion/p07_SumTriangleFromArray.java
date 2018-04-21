/*Problem 07: Given an array of integers, print a sum triangle from it such that the first level has all array elements.
From then, at each level number of elements is one less than the previous level and elements at the level is be the Sum
of consecutive two elements in the previous level.
Example:

Input : A = {1, 2, 3, 4, 5}
Output : [48]
         [20, 28]
         [8, 12, 16]
         [3, 5, 7, 9]
         [1, 2, 3, 4, 5]
*/

package practice.geekForGeeks.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p07_SumTriangleFromArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] inputNumbers = Arrays.stream(bufferedReader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        printSumTriangle(inputNumbers);
    }

    private static void printSumTriangle(int[] inputNumbers) {
        if (inputNumbers.length == 0) {
            return;
        }

        int[] tempArray = new int[inputNumbers.length - 1];

        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = inputNumbers[i] + inputNumbers[i + 1];
        }

        printSumTriangle(tempArray);

        System.out.println(Arrays.toString(inputNumbers));
    }
}
