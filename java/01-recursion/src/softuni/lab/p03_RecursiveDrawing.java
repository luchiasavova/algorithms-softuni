package softuni.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p03_RecursiveDrawing {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        printFigure(n);
    }

    private static void printFigure(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(newString(n, '*'));

        printFigure(n - 1);

        System.out.println(newString(n, '#'));

    }

    private static String newString(int n, char character) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(character);
        }

        return result.toString();
    }
}
