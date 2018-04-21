package practice.hackerrank.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02_RecursiveDigitSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] tokens = bufferedReader.readLine().split("\\s+");

        String givenNumber = tokens[0];
        int repetitions = Integer.parseInt(tokens[1]);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repetitions; i++) {
            sb.append(givenNumber);
        }

        String number = sb.toString();

        int result = 0;

        while (true) {
            result = findSuperDigit(0, number);

            number = String.format("%d", result);

            if (result < 10) {
                break;
            }
        }

        System.out.println(result);
    }

    private static int findSuperDigit(int index, String number) {
        if (index == number.length()) {
            return 0;
        }

        int num = number.charAt(index) - '0';

        return num + findSuperDigit(index + 1, number);
    }
}
