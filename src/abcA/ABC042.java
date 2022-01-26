package abcA;

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
