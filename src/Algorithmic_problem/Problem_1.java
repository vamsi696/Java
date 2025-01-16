//Task
//Let's solve a simple problem.
//Write a program in the IDE which does the following:
//
//Accepts 5 inputs given on 5 separate lines. Each input is an integer N.
//For each test cases, prints out the integer N to console on a separate line (our Input mirror problem).
//Sample 1:
//Input
//        Output
//11
//        123
//        34
//        22
//        45
//        11
//        123
//        34
//        22
//        45
//Explanation:
//Since the count of test cases is 5 -> we accept 5 inputs and print 5 outputs.

package Algorithmic_problem;

import java.util.Scanner;

public class Problem_1 {
    public static void main (String[] args)
    {
        Scanner read = new Scanner(System.in);

        String A = read.next();
        String B = read.next();
        String C = read.next();
        String D = read.next();
        String E = read.next();
        // You can use "\n" to add a new line instead of adding multiple print statements
        System.out.print(A + "\n" + B + "\n" + C + "\n" + D + "\n" + E );
    }

}
