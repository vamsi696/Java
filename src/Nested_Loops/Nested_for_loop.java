//Nested loops
//We learned about For and While loops.
//
//        Let's discuss Nested loops.
//
//Nested loops are a powerful programming construct where one loop is placed inside another loop.
//
//Let us understand this through an example - by printing a Right Triangle.
//Suppose you want to print a right triangle of height n, where n is the number of rows.
//
//Review the code in the IDE and click on 'Submit' to see the result.
//
//In this example:
//
//The outer loop controls the number of rows.
//The inner loop controls the number of stars printed in each row, forming the right triangle pattern.
//Sample 1:
//Input
//        Output
//4
//        *
//        * *
//        * * *
//        * * * *

package Nested_Loops;

import java.util.Scanner;

public class Nested_for_loop {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n = read.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
