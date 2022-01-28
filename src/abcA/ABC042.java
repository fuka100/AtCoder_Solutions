package abcA;

/*
<<Problem Statement>>
Iroha loves Haiku. Haiku is a short form of Japanese poetry.
A Haiku consists of three phrases with 5, 7 and 5 syllables, in this order.

To create a Haiku, Iroha has come up with three different phrases.
These phrases have A, B and C syllables, respectively.
Determine whether she can construct a Haiku by using each of the phrases once, in some order.

<<Constraints>>
1 ≦ A, B, C ≦ 10

<<Input>>
A B C

<<Output>>
If it is possible to construct a Haiku by using each of the phrases once, print YES (case-sensitive). Otherwise, print NO.
*/

import java.util.Scanner;

public class ABC042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        String abc = "" + a + b + c;

        int count5 = 0;
        int count7 = 0;

        for (int i = 0; i < abc.length(); i++) {
            if (abc.charAt(i) == '5') {
                count5++;
            }
            else if (abc.charAt(i) == '7') {
                count7++;
            }
        }

        if (count5 == 2 && count7 == 1) {
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
