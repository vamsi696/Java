//What are test cases
//In the previous problem - we wrote the program to accept 5 inputs on 5 separate lines.
//
//What will we do if we expect 100 inputs or test cases?
//What about 100,000 inputs or test cases?
//Task
//Let's solve a simple problem.
//Write a program in the IDE which does the following:
//
//Accepts the count of test cases - T - as an integer input given in the 1st line.
//This is followed by T lines - Each line contains an integer N.
//For each test cases, prints out the integer N to console on a separate line (our Input mirror problem).
//Sample 1:
//Input
//        Output
//3
//        1
//        22
//        33
//        1
//        22
//        33

package Algorithmic_problem;

import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int t = read.nextInt();

        for (int i = 0; i < t; i++){
            int n = read.nextInt();
            System.out.println(n);
        }

    }
}
