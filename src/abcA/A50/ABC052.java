package abcA.A50;

/*
<<Problem Statement>>
There are two rectangles.
The lengths of the vertical sides of the first rectangle are A, and the lengths of the horizontal sides of the first rectangle are B.
The lengths of the vertical sides of the second rectangle are C, and the lengths of the horizontal sides of the second rectangle are D.
Print the area of the rectangle with the larger area.
If the two rectangles have equal areas, print that area.

<<Constraints>>
All input values are integers.
- 1 ≤ A ≤ 10^4
- 1 ≤ B ≤ 10^4
- 1 ≤ C ≤ 10^4
- 1 ≤ D ≤ 10^4

<<Input>>
A B C D

<<Output>>
Print the area of the rectangle with the larger area. If the two rectangles have equal areas, print that area.
 */

import java.util.Scanner;

public class ABC052 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int areaAB = a * b;
        int areaCD = c * d;

        if (areaAB > areaCD) {
            System.out.println(areaAB);
        }
       else if (areaCD > areaAB) {
            System.out.println(areaCD);
        }
       else System.out.println(areaAB);
    }
}