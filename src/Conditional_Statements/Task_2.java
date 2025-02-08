//Task
//You are given 2 integers
//        A
//A and
//B
//B.
//You need to compute and output the following for each test case
//
//If
//        A
//A is not equal to
//        B
//B and
//A
//A and
//B
//B are both odd - then output 'A and B are different and are odd'
//Else if
//A
//A is not equal to
//        B
//B and
//A
//A and
//B
//B are both even - then output 'A and B are different and are even'
//For every other value of
//        A
//A and
//B
//B, output 'Doesn't matter'
//Solve this problem in the IDE.
//
//Sample 1:
//Input
//        Output
//4
//        -9 5
//        3 3
//        -10 10
//        2 1
//A and B are different and are odd
//Doesn't matter
//A and B are different and are even
//Doesn't matter

package Conditional_Statements;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        for (int i = 0; i < t; i++){
            int a = read.nextInt();
            int b = read.nextInt();

            if (a != b && (a%2 != 0 && b%2 != 0)){
                System.out.println("A and B are different and are odd");
            } else if (a != b && (a%2 == 0 && b%2 == 0)){
                System.out.println("A and B are different and are even");
            } else {
                System.out.println("Doesn't Matter");
            }
        }
    }
}
