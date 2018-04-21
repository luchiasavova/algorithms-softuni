package softuni.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p01_RecursiveArraySum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = Arrays.stream(bufferedReader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        long sum = recursiveSum(0, numbers);

        System.out.println(sum);
    }

    private static long recursiveSum(int index, int[] numbers) {
        if (index == numbers.length) {
            return 0;
        }

        return numbers[index] + recursiveSum(index + 1, numbers);
    }
}
