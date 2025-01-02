//Fibonacci Series
//You are given an integer
//        N
//N.
//
//You need to output the first
//N
//N numbers of the Fibonacci Series.
//Check the sample output given below.
//
//Note: A Fibonacci number is a series of numbers in which each number is obtained by adding the two preceding numbers.
//
//F1 = 0, F2 = 1
//FN = FN-2 + FN-1
//
//Sample 1:
//Input
//        Output
//5
//        0 1 1 2 3
//Sample 2:
//Input
//        Output
//8
//        0 1 1 2 3 5 8 13

package Loops;

import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int prev = 0, current = 1;
        System.out.print(prev +" "+current);

        for (int i = 3; i <= num; i++){
            int next = prev + current;
            System.out.print(" "+next);
            prev = current;
            current = next;
        }
    }
}
