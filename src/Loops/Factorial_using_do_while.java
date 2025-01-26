package Loops;

import java.util.Scanner;

public class Factorial_using_do_while {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int fact = 1;

        do {
            fact = fact * num;
            System.out.print(num + " ");
            num--;
        } while (num > 0);
        System.out.println();
        System.out.println(fact);
    }
}
