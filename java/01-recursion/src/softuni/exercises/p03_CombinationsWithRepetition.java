package softuni.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p03_CombinationsWithRepetition {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        int k = Integer.parseInt(bufferedReader.readLine());

        int[] set = new int[k];

        genCombWithRepetition(0, 0, set, n);
    }

    private static void genCombWithRepetition(int index, int start, int[] set, int n) {
        if (index == set.length) {
            print(set);

            return;
        }

        for (int i = start; i < n; i++) {
            set[index] = i + 1;

            genCombWithRepetition(index + 1, i, set, n);
        }
    }

    private static void print(int[] set) {
        String result = Arrays.toString(set).replaceAll("[\\]\\[,]", "");

        System.out.println(result);
    }
}
