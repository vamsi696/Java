//Determine the Score
//The code given in the IDE is incorrect - Try and debug this program!!!
//
//There is a problem worth
//        X
//X points and it has
//10
//        10 test cases.
//It is known that
//X
//X is a multiple of
//10
//        10.
//It is known that each test case is worth the same number of points.
//        You pass
//N
//N test cases among them. Determine the score that you will get.
//
//        Input Format
//First line will contain
//T
//T, number of test cases. Then the test cases follow.
//Each test case contains of a single line of input, two integers
//X
//X and
//N
//N, the total points for the problem and the number of test cases which pass.
//Output Format
//For each test case, output the points scored by you.
//
//Sample 1:
//Input
//        Output
//2
//        10 3
//        100 10
//        3
//        100
//Explanation:
//Test Case
//1
//        1: The problem is worth
//10
//        10 points and since there are
//10
//        10 test cases, each test case is worth
//1
//        1 point. Since you pass
//3
//        3 test cases, your score will be
//1
//        ⋅
//        3
//        =
//        3
//        1⋅3=3 points.
//
//        Test Case
//2
//        2: The problem is worth
//100
//        100 points and since there are
//10
//        10 test cases, each test case is worth
//10
//        10 points. Since you pass all the
//10
//        10 test cases, your score will be
//10
//        ⋅
//        10
//        =
//        100
//        10⋅10=100 points.

package CodeChef_500_1000;

import java.util.Scanner;

public class Determine_the_Score {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int t = read.nextInt();

        while (t-- > 0){
            int x = read.nextInt();
            int n = read.nextInt();

            double pointsPerTestCase = x / 10;
            double score = pointsPerTestCase * n;

            System.out.println((int)score);
        }
    }
}
