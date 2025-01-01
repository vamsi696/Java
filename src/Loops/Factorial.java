//Factorial
//Chef's coding journey continues.
//Chef was given an integer input
//N
//N.
//
//He wrote a code using WHILE loops to output the factorial of N.
//But he wasn't able to complete some parts of the code.
//Help him complete his code.
//
//        Note: The factorial of a number
//        N
//N is the product of each number from 1 to
//        N
//N.
//        N
//!
//N!(N factorial)
//        =
//        1
//        ×
//        2
//        ×
//        3
//        ×
//        .
//        .
//        .
//        .
//        .
//N
//=1×2×3×.....N
//
//Sample 1:
//Input
//        Output
//5
//        120
//Sample 2:
//Input
//        Output
//8
//        40320


package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int factorial = 1;
        int sum = 1;

        while (sum <= num){
            factorial *= sum;
            sum++;
        }
        System.out.println(factorial);
    }
}
