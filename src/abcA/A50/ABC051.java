package abcA.A50;

/*
<<Problem Statement>>
As a New Year's gift, Dolphin received a string s of length 19.
The string s has the following format: [five lowercase English letters],[seven lowercase English letters],[five lowercase English letters].
Dolphin wants to convert the comma-separated string s into a space-separated string.
Write a program to perform the conversion for him.

<<Constraints>>
- The length of s is 19
- The sixth and fourteenth characters in s are ,
- The other characters in s are lowercase English letters

<<Input>>
s

<<Output>>
Print the string after the conversion.
 */

import java.util.Scanner;

public class ABC051 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        String newS = "";

        for (int i = 0; i < s.length(); i++) {
            if (i == 5 || i == 13) {
                newS += " ";
            }
            else newS += s.charAt(i);
        }

        System.out.println(newS);
    }
}