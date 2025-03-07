//Small factorials
//You are asked to calculate factorials of some small positive integers.
//
//        Input
//An integer t, 1<=t<=100, denoting the number of testcases, followed by t lines, each containing a single integer n, 1 <= n <= 100
//
//Output
//For each integer n given at input, display a line with the value of n!
//
//Note: For larger numbers, their factorial can overflows any available numeric data type in C.
//
//        Sample 1:
//Input
//        Output
//4
//        1
//        2
//        5
//        3
//        1
//        2
//        120
//        6

package CodeChef_500_1000;

import java.math.BigInteger;
import java.util.Scanner;

public class SmallFactorials {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int n = read.nextInt();
            BigInteger fact = BigInteger.ONE;

            for (int i = 1; i <= n; i++){
                fact = fact.multiply(BigInteger.valueOf(i));
            }
            System.out.println(fact);
        }
    }

}
