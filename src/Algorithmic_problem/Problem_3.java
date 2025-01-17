//Test cases with multiple lines of input
//In the previous problem, we had t test cases and each test case had 1 line of input. However, each test case can have multiple lines of input as well.
//
//Task
//Let's write a program in the IDE which performs the following:
//
//The 1st line of input is an integer - T - the count of test cases.
//Each test case consists of 2 lines of input.
//        The 1st line of input has 2 space separated integers - accept them as variables a and b .
//        The 2nd line of input has 3 space separated integers - accept them as variables c, d and e.
//For each test case - output all integers on a single line.
//        Sample 1:
//Input
//        Output
//3
//        1 2
//        3 4 5
//        11 22
//        33 44 55
//        1 23
//        456 789 101112
//        1 2 3 4 5
//        11 22 33 44 55
//        1 23 456 789 101112
//Explanation:
//        2 lines of input in test case 1:
//        1 2
//        3 4 5
//
//Output 1: 1 2 3 4 5 (printing all inputs in single line)
//
//        2 lines of input in test case 2:
//        11 22
//        33 44 55
//
//Output 2: 11 22 33 44 55

package Algorithmic_problem;

import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int t = read.nextInt();

        for (int i = 0; i < t; i++){
            int a = read.nextInt();
            int b = read.nextInt();
            int c = read.nextInt();
            int d = read.nextInt();
            int e = read.nextInt();

            System.out.print(a + " " + b + " " + c + " " + d + " " + e);
        }
    }
}
