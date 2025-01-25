//Arithmetic operation
//Write a program that takes two numbers and an operator (+, -, *, /) as input. Use a switch statement to perform the corresponding arithmetic operation and print the result.
//
//        Sample 1:
//Input
//        Output
//5 2 +
//        7

package Conditional_Statements;

import java.util.Scanner;

public class Arthimetic_Operation {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int num1 = read.nextInt();
        int num2 = read.nextInt();
        char op = read.next().charAt(0);

        switch (op){
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
