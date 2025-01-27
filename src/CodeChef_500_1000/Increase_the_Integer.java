//Increase the integer
//Write a program that takes t test cases as input, then for each test case, reads an integer N, and prints N + 1.
//
//Sample 1:
//Input
//        Output
//3
//        4
//        2
//        -1
//        5
//        3
//        0

package CodeChef_500_1000;

import java.util.Scanner;

public class Increase_the_Integer {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int t = read.nextInt();

        while (t-- > 0){
            int n = read.nextInt();
            System.out.println(n + 1);
        }
    }
}
