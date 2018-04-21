package practice.hackerrank.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p04_PasswordCracker {
    private static StringBuilder result;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(bufferedReader.readLine());

        result = new StringBuilder();

        for (int i = 0; i < testCases; i++) {
            bufferedReader.readLine();
            String[] passwords = bufferedReader.readLine().split("\\s+");
            String loginAttempt = bufferedReader.readLine();

            String message = crackPassword(loginAttempt, passwords);

            if (message.contains("WRONG PASSWORD")){
                message = "WRONG PASSWORD";
            }
            System.out.println(message);
        }
    }

    private static String crackPassword(String loginAttempt, String[] passwords) {
        if (loginAttempt.length() == 0) {
            return "";
        }

        for (String password : passwords) {
            if (loginAttempt.startsWith(password)) {
                loginAttempt = loginAttempt.substring(password.length());
                result.append(password).append(" ");

                return password + " " + crackPassword(loginAttempt, passwords);
            }
        }

        return "WRONG PASSWORD";
    }
}
