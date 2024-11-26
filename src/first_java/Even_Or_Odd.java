//Write a program to print whether a number is even or odd, also take input from the user.

package first_java;

import java.util.Scanner;

public class Even_Or_Odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
