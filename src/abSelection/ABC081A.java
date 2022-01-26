package abSelection;

import java.util.Scanner;

public class ABC081A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        int counter = 0;

        if (s.charAt(0) == '1') counter++;
        if (s.charAt(1) == '1') counter++;
        if (s.charAt(2) == '1') counter++;

        System.out.println(counter);
    }
}
