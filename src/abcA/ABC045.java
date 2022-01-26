package abcA;

import java.util.Scanner;

public class ABC045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();  // Upper
        int b = scanner.nextInt();  // Lower
        int h = scanner.nextInt();  // Height

        int area = (a+b) * h / 2;

        System.out.println(area);
    }
}
