package practice.geekForGeeks.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*Problem 06: Given a set of characters and a positive integer k,
 print all possible strings of length k that can be formed from the given set.*/

public class p05_PrintAllPossibleStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        char[] characters = bufferedReader.readLine().toCharArray();
        int k = Integer.parseInt(bufferedReader.readLine());

        char[] set = new char[k];

        printVariations(0, set, characters);
    }

    private static void printVariations(int index, char[] set, char[] charaters) {
        if (index == set.length) {
            printCurrentSet(set);

            return;
        }

        for (int i = 0; i < charaters.length; i++) {
            set[index] = charaters[i];

            printVariations(index + 1, set, charaters);
        }
    }

    private static void printCurrentSet(char[] set) {
        String result = Arrays.toString(set).replaceAll("[\\[\\], ]", "");

        System.out.println(result);
    }
}
