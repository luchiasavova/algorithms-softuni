package softuni.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p02_NestedLoops {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        int[] set = new int[n];

        simulateNestedLoops(0, set);
    }

    private static void simulateNestedLoops (int index, int[] set) {
        if (index == set.length){
            print(set);

            return;
        }

        for (int i = 0; i < set.length; i++) {
            set[index] = i + 1;

            simulateNestedLoops(index + 1, set);
        }
    }

    private static void print(int[] set) {
        String result = Arrays.toString(set).replaceAll("[\\]\\[,]", "");

        System.out.println(result);
    }
}
