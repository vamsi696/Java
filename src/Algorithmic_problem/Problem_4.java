//Test cases with multiple types of input
//In the previous problem, each testcase had 2 lines of input - each consisting of integers.
//Test cases can also contain a combination of integers and strings.
//
//        Task
//Lets write a program in the IDE which performs the following:
//
//The 1st line of input contains t - the count of testcases.
//Each testcase consists of the following 2 lines of input.
//        The 1st line of the testcase contains 2 integers - accept them as variables a and b.
//        The 2nd line of the testcase contains 1 string - accept it as a variable s.
//For each test case, output on one line the 2 integers followed by the string .
//        Sample 1:
//Input
//        Output
//2
//        1 2
//abcde
//34 567
//A1B2C3
//1 2 abcde
//34 567 A1B2C3
//Explanation:
//Test case 1:
//        1 2
//abcde
//
//Output for test case 1: 1 2 abcde
//
//Test case 2:
//        34 567
//A1B2C3
//
//Output for test case 2: 34 567 A1B2C3

package Algorithmic_problem;

import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int t = read.nextInt();

        for (int i = 0; i < t; i++){
            int a = read.nextInt();
            int b = read.nextInt();

            String s = read.next();

            System.out.println(a + " " + b + " " + s);
        }
    }
}
