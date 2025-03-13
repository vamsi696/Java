//Small Factorial
//Write a program to find the factorial value of any number entered by the user.
//
//        Input Format
//The first line contains an integer T, the total number of testcases. Then T lines follow, each line contains an integer N.
//
//        Output Format
//For each test case, display the factorial of the given number N in a new line.
//
//        Constraints
//1 ≤ T ≤ 1000
//        0 ≤ N ≤ 20
//Sample 1:
//Input
//        Output
//3
//        3
//        4
//        5
//        6
//        24
//        120

package CodeChef_500_1000;

import java.util.Scanner;

public class SmallFactorial {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int n = read.nextInt();
            long fact = 1;
            int i = 1;
            while (i <= n){
                fact *= i;
                i++;
            }

            System.out.println(fact);
        }
    }
}
