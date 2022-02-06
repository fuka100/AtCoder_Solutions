package abcA.A50;

/*
<<Problem Statement>>
Smeke has decided to participate in AtCoder Beginner Contest (ABC) if his current rating is less than 1200,
and participate in AtCoder Regular Contest (ARC) otherwise.
You are given Smeke's current rating, x.
Print ABC if Smeke will participate in ABC, and print ARC otherwise.

<<Constraints>>
- 1 ≦ x ≦ 3,000
- x is an integer

<<Input>>
x

<<Output>>
Print the answer.
 */

import java.util.Scanner;

public class ABC053 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        if (x < 1200) System.out.println("ABC");
        else System.out.println("ARC");
    }
}
