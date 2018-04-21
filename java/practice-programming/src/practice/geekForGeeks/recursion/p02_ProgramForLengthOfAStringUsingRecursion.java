package practice.geekForGeeks.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Problem 02: Given a string calculate length of the string using recursion.*/

public class p02_ProgramForLengthOfAStringUsingRecursion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String inputString = bufferedReader.readLine();

        int stringLength = calculateStrLength(inputString);
        System.out.println(stringLength);
    }

    private static int calculateStrLength(String string) {
        if (string.equals("")) {
            return 0;
        }

        return 1 + calculateStrLength(string.substring(1));
    }
}
