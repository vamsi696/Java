//Second Largest
//Three numbers A, B and C are the inputs. Write a program to find second largest among them.
//
//        Input Format
//The first line contains an integer T, the total number of testcases. Then T lines follow, each line contains three integers A, B and C.
//
//        Output Format
//For each test case, display the second largest among A, B and C, in a new line.
//
//        Constraints
//1 ≤ T ≤ 1000
//        1 ≤ A,B,C ≤ 1000000
//Sample 1:
//Input
//        Output
//3
//        120 11 400
//        10213 312 10
//        10 3 450
//        120
//        312
//        10

package CodeChef_500_1000;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int a = read.nextInt();
            int b = read.nextInt();
            int c = read.nextInt();
            int secondLargest;

            if ((a > b && a < c) || (a > c && a < b)){
                secondLargest = a;
            } else if ((b > a && b < c) || (b > c && b < a)){
                secondLargest = b;
            } else {
                secondLargest = c;
            }
            System.out.println(secondLargest);
        }
    }
}
