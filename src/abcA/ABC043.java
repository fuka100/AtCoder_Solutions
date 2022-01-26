package abcA;

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
