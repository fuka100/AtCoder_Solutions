package abcA.A40;

/*
<<Problem Statement>>
There are N children in AtCoder Kindergarten.
Mr. Evi will arrange the children in a line, then give 1 candy to the first child in the line,
2 candies to the second child, ..., N candies to the N-th child.
How many candies will be necessary in total?

<<Constraints>>
1 ≦ N ≦ 100

<<Input>>
N

<<Output>>
Print the necessary number of candies in total.
*/

import java.util.Scanner;

public class ABC043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int candy = 0;

        for (int i = 1; i <= n; i++) {
            candy += i;
        }

        System.out.println(candy);
    }
}
