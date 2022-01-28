package abcA;

/*
<<Problem Statement>>
There is a hotel with the following accommodation fee:

- X yen (the currency of Japan) per night, for the first K nights
- Y yen per night, for the (K+1)-th and subsequent nights

Tak is staying at this hotel for N consecutive nights. Find his total accommodation fee.

<<Constraints>>
- 1 ≤ N, K ≤ 10000
- 1 ≤ Y < X ≤ 10000
- N, K, X, Y are integers

<<Input>>
N, K, X, Y

<<Output>>
Print Tak's total accommodation fee.
*/

import java.util.Scanner;

public class ABC044 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int untilK = 0;   // Total price until Kth night (K nights)
        int afterK = 0;   // Total price after Kth night (rest)

        for (int i = 1; i <= n; i++) {
            if (i <= k) {
                untilK += x;
            }
            else {
                if (k < n) {
                    afterK += y;
                }
            }
        }

        // Total
        int total = untilK + afterK;

        System.out.println(total);
    }
}
