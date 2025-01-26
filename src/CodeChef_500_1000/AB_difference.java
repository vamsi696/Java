//AB Difference
//Chef is taking his baby steps into the world of programming.
//
//The very first program he's tasked to write is as follows:
//        "Given two integers
//A
//A and
//        B
//                B, print
//A
//+
//B
//A+B."
//
//Unfortunately, Chef makes a typo: his program outputs
//        A
//×
//B
//A×B instead of
//        A
//+
//B
//A+B.
//
//Given the values of
//A
//A and
//B
//B, can you help Chef find the absolute difference between the correct answer and the value his program prints?
//
//Input Format
//The only line of input will contain two space-separated integers,
//        A
//A and
//B
//B.
//
//        Output Format
//Print a single integer: the difference between the correct answer and Chef's output.
//
//Constraints
//1
//        ≤
//A
//,
//B
//≤
//        10
//        1≤A,B≤10
//
//Sample 1:
//Input
//        Output
//4 7
//        17
//Explanation:
//The correct answer is
//4
//        +
//        7
//        =
//        11
//        4+7=11, but Chef's program prints
//        4
//        ×
//        7
//        =
//        28
//        4×7=28.
//The difference between them is
//∣
//        28
//        −
//        11
//        ∣
//        =
//        17
//        ∣28−11∣=17.
//
//Sample 2:
//Input
//        Output
//1 6
//        1
//Explanation:
//The correct answer is
//1
//        +
//        6
//        =
//        7
//        1+6=7, but Chef's program prints
//        1
//        ×
//        6
//        =
//        6
//        1×6=6.
//The difference between these values is
//1
//        1.

package CodeChef_500_1000;

import java.util.Scanner;

public class AB_difference {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int x = read.nextInt();
        int y = read.nextInt();

        int sum = x + y;
        int mul = x * y;

        int diff = sum - mul;

        System.out.println(Math.abs(diff));
    }
}
