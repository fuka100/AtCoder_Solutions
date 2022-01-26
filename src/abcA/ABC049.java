package abcA;

import java.util.Scanner;

public class ABC049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String letter = scanner.next();

        if (letter.equals("a") ||
                letter.equals("e") ||
                letter.equals("i") ||
                letter.equals("o") ||
                letter.equals("u")) {
            System.out.println("vowel");
        }
        else System.out.println("consonant");
    }
}
