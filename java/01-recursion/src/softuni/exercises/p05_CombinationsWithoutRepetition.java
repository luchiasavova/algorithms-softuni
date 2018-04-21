package softuni.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p05_CombinationsWithoutRepetition {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        int k = Integer.parseInt(bufferedReader.readLine());

        int[] set = new int[k];

        genCombWithoutRepetition(0, 0, set, n);
    }

    private static void genCombWithoutRepetition(int index, int start, int[] set, int n) {
        if (index == set.length) {
            print(set);

            return;
        }

        for (int i = start; i < n; i++) {
            set[index] = i + 1;

            genCombWithoutRepetition(index + 1, i + 1, set, n);
        }
    }

    private static void print(int[] set) {
        String result = Arrays.toString(set).replaceAll("[\\]\\[,]", "");

        System.out.println(result);
    }
}
