//Task
//Write a program which does the following:
//
//Initialise a variable n and accept a user defined input from the console.
//        Output "Java" to the console n number of times.
//        Sample 1:
//Input
//        Output
//4
//Java
//        Java
//Java
//        Java

package Loops;

import java.util.Scanner;

public class For_loop {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Java");
        }
    }
}
