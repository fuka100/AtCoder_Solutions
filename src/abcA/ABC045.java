package abcA;

/*
<<Problem Statement>>
You are given a trapezoid. The lengths of its upper base, lower base, and height are a, b, and h, respectively.
Find the area of this trapezoid.

<<Constraints>>
- 1 ≦ a ≦ 100
- 1 ≦ b ≦ 100
- 1 ≦ h ≦ 100
- All input values are integers
- h is even

<<Input>>
a, b, h

<<Output>>
Print the area of the given trapezoid. It is guaranteed that the area is an integer.
*/

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
