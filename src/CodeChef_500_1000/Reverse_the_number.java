//
//Reverse The Number
//        Given an Integer N, write a program to reverse it.
//
//        Input
//        The first line contains an integer T, total number of testcases. Then follow T lines, each line contains an integer N.
//
//        Output
//        For each test case, display the reverse of the given number N, in a new line.
//
//        Constraints
//        1 ≤ T ≤ 1000
//        1 ≤ N ≤ 1000000
//        Sample 1:
//        Input
//        Output
//        4
//        12345
//        31203
//        2123
//        2300
//        54321
//        30213
//        3212
//        32
package CodeChef_500_1000;

import java.util.Scanner;

public class Reverse_the_number {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int t = read.nextInt();

        while (t-- > 0){
            int n = read.nextInt();
            int reversed = 0;
            while (n != 0){
                int digits = n % 10;
                reversed = reversed * 10 + digits;
                n /= 10;
            }
            System.out.println(reversed);
        }
    }
}
