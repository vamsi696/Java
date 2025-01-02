//Power of a Number
//You are given 2 space separated integers
//        N
//N and
//m
//m.
//
//You need to output the value
//N
//        m
//N
//        m
// .
//Check the sample output given below.
//
//Sample 1:
//Input
//        Output
//5 3
//        125
//Sample 2:
//Input
//        Output
//8 4
//        4096

package Loops;

import java.util.Scanner;

public class Power_of_number {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int N = read.nextInt();
        int M = read.nextInt();

        System.out.println((int)Math.pow(N, M));
    }
}
