//Max minus Min
//Given 3 integers -
//        A
//                A,
//                B
//B and
//C
//C - you need to find the difference between the highest and the lowest of the given 3 integers.
//
//        Input Format
//The first line of input will contain a single integer
//T
//T, denoting the number of test cases.
//Each test case consists of
//3
//        3 integers
//        A
//        ,
//        B
//        ,
//        C
//A,B,C.
//        Output Format
//For each test case, output on a new line the difference between the highest and the lowest of the given 3 integers.
//
//        Sample 1:
//Input
//        Output
//2
//        1 3 10
//        5 6 7
//        9
//        2
//Explanation:
//Test case
//        1
//        1: Here,
//m
//        a
//x
//        (
//1
//        ,
//        3
//        ,
//        10
//        )
//=
//        10
//max(1,3,10)=10 and
//        m
//i
//n
//        (
//1
//        ,
//        3
//        ,
//        10
//        )
//=
//        1
//min(1,3,10)=1. Thus, the difference is
//9
//        9.
//
//Test case
//        2
//        2: Here,
//m
//        a
//x
//        (
//5
//        ,
//        6
//        ,
//        7
//        )
//=
//        7
//max(5,6,7)=7 and
//        m
//i
//n
//        (
//5
//        ,
//        6
//        ,
//        7
//        )
//=
//        5
//min(5,6,7)=5. Thus, the difference is
//2
//        2.

package CodeChef_500_1000;

import java.util.Scanner;

public class MaxMinusMin {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int a = read.nextInt();
            int b = read.nextInt();
            int c = read.nextInt();

            int maximum = Math.max(a, Math.max(b, c));
            int minimum = Math.min(a, Math.min(b, c));

            int difference = maximum - minimum;
            System.out.println(difference);
        }
    }
}
