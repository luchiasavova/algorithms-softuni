package softuni.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p05_GeneratingCombinations {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = Arrays.stream(bufferedReader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(bufferedReader.readLine());

        int[] set = new int[n];

        genCombinations(0, 0, set, numbers);
    }

    private static void genCombinations(int index, int startIndex, int[] set, int[] numbers) {
        if (index == set.length) {
            System.out.println(Arrays.toString(set).replaceAll("[\\]\\[,]", ""));

            return;
        }

        for (int i = startIndex; i < numbers.length; i++) {
            set[index] = numbers[i];

            genCombinations(index + 1, i + 1, set, numbers);
        }
    }
}
