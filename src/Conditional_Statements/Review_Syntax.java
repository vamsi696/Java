//Review syntax usage
//Let us cover the 'conditional statements' syntax required for solving beginner's programming problems.
//
//Task
//Write a program which does the following
//
//Accepts the count of test cases -
//t
//        t
//Each test case has one integer
//        N
//N
//Output the following for each test case
//If input is less than or equal to
//100
//        100, output 'Good'
//If input is greater than 100 but less than or equal to
//200
//        200, output 'Better'
//If the input is greater than 200, output 'Best'
//Sample 1:
//Input
//        Output
//3
//        100
//        200
//        201
//Good
//        Better
//Best

package Conditional_Statements;

import java.util.Scanner;

public class Review_Syntax {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int t = read.nextInt();

        while (t-- > 0){
            int n = read.nextInt();

            if (n <= 100){
                System.out.println("Good");
            } else if (n > 100 && n <= 200){
                System.out.println("Better");
            } else {
                System.out.println("Greater");
            }
        }
    }
}
