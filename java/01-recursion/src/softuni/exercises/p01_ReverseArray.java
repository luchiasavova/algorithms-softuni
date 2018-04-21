package softuni.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p01_ReverseArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = Arrays.stream(bufferedReader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        reverseArray(0, numbers);

        String result = Arrays.toString(numbers).replaceAll("[\\]\\[,]", "");

        System.out.println(result);
    }

    private static void reverseArray(int index, int[] numbers) {
        if (index == numbers.length / 2) {
            return;
        }

        int temp = numbers[index];
        numbers[index] = numbers[numbers.length - 1 - index];
        numbers[numbers.length - 1 - index] = temp;

        reverseArray(index + 1, numbers);
    }
}
