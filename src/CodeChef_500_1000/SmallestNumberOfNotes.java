//Smallest Numbers of Notes
//Consider a currency system in which there are notes of six denominations, namely, Rs. 1, Rs. 2, Rs. 5, Rs. 10, Rs. 50, Rs. 100.
//If the sum of Rs. N is input, write a program to compute smallest number of notes that will combine to give Rs. N.
//
//        Input
//
//The first line contains an integer T, total number of testcases. Then follow T lines, each line contains an integer N.
//
//        Output
//For each test case, display the smallest number of notes that will combine to give N, in a new line.
//
//        Constraints
//1 ≤ T ≤ 1000
//        1 ≤ N ≤ 1000000
//Sample 1:
//Input
//        Output
//3
//        1200
//        500
//        242
//        12
//        5
//        7

package CodeChef_500_1000;

import java.util.Scanner;

public class SmallestNumberOfNotes {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        int[] denominations = {100, 50, 10, 5, 2, 1};

        while (t-- > 0){
            int n = read.nextInt();
            int count = 0;

            for (int denom: denominations){
                count += n/denom;
                n %= denom;
            }
            System.out.println(count);
        }
    }
}
