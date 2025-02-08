//Logical operators & conditional statements
//We reviewed basic conditional operators in the previous module.
//In this module - we will cover logical operators in conditional statements.
//
//        AND "&&" and OR "||" statements help check multiple conditions
//        A single statement can have multiple conditions clubbed together using "&&" and "||". These can be used in if / else conditions.
//        Task
//        You are given 3 integers
//        N
//        N,
//        A
//        A and
//        B
//        B.
//        You need to compute and output the following for each test case
//
//        If
//        N
//        N is divisible by both
//        A
//        A and
//        B
//        B - then output 'N is divisible by A and B'
//        Else if
//        N
//        N is divisible by
//        A
//        A and not
//        B
//        B - then output 'N is divisible by only A'
//        Else if
//        N
//        N is divisible by
//        B
//        B and not
//        A
//        A - then output 'N is divisible by only B'
//        Else if
//        N
//        N is divisible by neither
//        A
//        A nor
//        B
//        B - then output 'N is divisible by neither A nor B'
//        Solve this problem in the IDE.
//
//        Sample 1:
//        Input
//        Output
//        4
//        10 5 2
//        10 3 2
//        12 3 5
//        10 4 3
//        N is divisible by A and B
//        N is divisible by only B
//        N is divisible by only A
//        N is divisible by neither A nor B

package Conditional_Statements;

import java.util.Scanner;

public class Logical_ConditionalStatements {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int N = read.nextInt();
            int A = read.nextInt();
            int B = read.nextInt();

            if (N%A == 0 && N%B == 0){
                System.out.println("N is divisible by A and B");
            } else if (N%A == 0){
                System.out.println("N is divisible by A");
            } else if (N%B == 0){
                System.out.println("N is divisible by B");
            } else {
                System.out.println("N is neither divisible by A nor B");
            }
        }
    }
}
