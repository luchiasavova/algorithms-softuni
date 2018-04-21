/*Problem 12: Given an array, write functions to find minimum and maximum elements in it using recursion. */

package practice.geekForGeeks.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p12_MinAndMaxElement {
    private static int minElement;
    private static int maxElement;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = Arrays.stream(bufferedReader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        minAndMaxElement(0, numbers);

        System.out.println("Min = " + minElement);
        System.out.println("Max = " + maxElement);
    }

    private static void minAndMaxElement(int index, int[] numbers) {
        if (index == numbers.length) {
            return;
        }

        int currentElement = numbers[index];
        if (minElement > currentElement) {
            minElement = currentElement;
        }

        if (maxElement < currentElement) {
            maxElement = currentElement;
        }

        minAndMaxElement(index + 1, numbers);
    }
}
