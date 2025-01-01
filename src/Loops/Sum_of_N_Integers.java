//Sum of N Integers
//Chef was given an integer input N.
//
//He wants to write a code using while loops to output the sum of all integers from 1 to
//        N
//N.
//Help him complete the code by filling in the blanks.
//
//Sample 1:
//Input
//        Output
//5
//        15
//Sample 2:
//Input
//        Output
//10
//        55

package Loops;

import java.util.Scanner;

public class Sum_of_N_Integers {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int sum = 0;
        int i = 1;

        while (i <= num){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
