//String mirror - Double strings
//Write a program in the IDE which does the following
//
//Accepts the count of test cases - t - in the 1st line
//First line of each test case consists of a string S
//You need to perform the following operation
//Create a variable X which contains the string S concatenated with the string S
//Output X for each test case
//Sample 1:
//Input
//        Output
//3
//ab
//        bc
//cd
//        abab
//bcbc
//        cdcd

package Algorithmic_problem;

import java.util.Scanner;

public class Mirror_Double_string {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int t = read.nextInt();

        for (int i = 0; i < t; i++){
            String s = read.next();

            String x = s + s;
            System.out.println(x);
        }

    }
}
