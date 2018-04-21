package softuni.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02_RecursiveFactorial {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        long fact = factorial(n);

        System.out.println(fact);
    }

    private static long factorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
