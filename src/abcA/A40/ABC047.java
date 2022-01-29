package abcA.A40;

/*
<<Problem Statement>>
Two students of AtCoder Kindergarten are fighting over candy packs.
There are three candy packs, each of which contains a, b, and c candies, respectively.
Teacher Evi is trying to distribute the packs between the two students so that each student gets the same number of candies.
Determine whether it is possible.
Note that Evi cannot take candies out of the packs, and the whole contents of each pack must be given to one of the students.

<<Constraints>>
1 ≦ a, b, c ≦ 100

<<Input>>
a b c

<<Output>>
If it is possible to distribute the packs so that each student gets the same number of candies, print Yes. Otherwise, print No.
*/

import java.util.Scanner;

public class ABC047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();;
        int c = scanner.nextInt();

        if (a+b == c || b+c == a || a+c == b) {
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}

