package practice.geekForGeeks.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class p22_SplitNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String inputNumber = bufferedReader.readLine();

        char[] splitSymbols = {' ', 0};
        char[] set = new char[inputNumber.length()];

        LinkedHashSet<String> resultList = new LinkedHashSet<>();

        splitNumber(0, set, splitSymbols, inputNumber, resultList);

        for (String string : resultList) {
            System.out.println(string);
        }
    }

    private static void splitNumber(int index, char[] set, char[] splitSymbols, String inputNumber, LinkedHashSet<String> resultList) {
        if (index == set.length) {
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < set.length; i++) {
                if (set[i] == ' ') {
                    result.append(set[i]).append(inputNumber.charAt(i));
                } else {
                    result.append(inputNumber.charAt(i));
                }
            }

            resultList.add(result.toString().trim());
            return;
        }

        for (int i = 0; i < splitSymbols.length; i++) {
            set[index] = splitSymbols[i];

            splitNumber(index + 1, set, splitSymbols, inputNumber, resultList);
        }
    }
}
