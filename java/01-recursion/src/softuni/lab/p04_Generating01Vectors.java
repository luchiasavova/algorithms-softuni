package softuni.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p04_Generating01Vectors {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        int[] set = new int[n];

        gen01Vectors(0, set);
    }

    private static void gen01Vectors(int index, int[] set) {
        if (index == set.length) {
            System.out.println(Arrays.toString(set).replaceAll("[\\]\\[, ]", ""));

            return;
        }

        for (int i = 0; i < 2; i++) {
            set[index] = i;

            gen01Vectors(index + 1, set);
        }
    }
}
