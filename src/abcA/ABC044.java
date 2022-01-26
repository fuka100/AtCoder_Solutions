package abcA;

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
