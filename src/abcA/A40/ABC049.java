package abcA.A40;

/*
<<Problem Statement>>
Given a lowercase English letter c, determine whether it is a vowel.
Here, there are five vowels in the English alphabet: a, e, i, o and u.

<<Constraints>>
c is a lowercase English letter.

<<Input>>
c

<<Output>>
If c is a vowel, print vowel. Otherwise, print consonant.
*/

import java.util.Scanner;

public class ABC049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String letter = scanner.next();

        if (letter.equals("A40") ||
                letter.equals("e") ||
                letter.equals("i") ||
                letter.equals("o") ||
                letter.equals("u")) {
            System.out.println("vowel");
        }
        else System.out.println("consonant");
    }
}
