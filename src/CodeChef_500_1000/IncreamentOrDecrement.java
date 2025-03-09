//Decrement OR Increment
//Write a program to obtain a number
//        N
//N and increment its value by 1 if the number is divisible by 4
//o
//        t
//h
//        e
//r
//        w
//i
//        s
//e
//otherwise decrement its value by 1.
//
//Input Format
//First line will contain a number
//N
//N.
//
//        Output Format
//Output a single line, the new value of the number.
//
//Constraints
//0
//        ≤
//N
//≤
//        1000
//        0≤N≤1000
//Sample 1:
//Input
//        Output
//5
//        4
//Explanation:
//Since 5 is not divisible by 4 hence, its value is decreased by 1.

package CodeChef_500_1000;

import java.util.Scanner;

public class IncreamentOrDecrement {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int n = read.nextInt();

            if (n%4==0){
                System.out.println(n + 1);
            } else {
                System.out.println(n - 1);
            }
        }
    }
}
