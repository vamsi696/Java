//Count the ACs
//There are
//10
//        10 problems in a contest. You know that the score of each problem is either
//1
//        1 or
//100
//        100 points.
//
//Chef came to know the total score of a participant and he is wondering how many problems were actually solved by that participant.
//
//Given the total score
//P
//P of the participant, determine the number of problems solved by the participant. Print
//−
//        1
//        −1 in case the score is invalid.
//
//Input Format
//First line will contain
//T
//T, number of test cases. Then the test cases follow.
//Each test case contains of a single line containing a single integer
//        P
//P - denoting the number of points scored by the participant.
//        Output Format
//For each testcase, output the number of problems solved by the participant or
//−
//        1
//        −1 if the score is invalid.
//
//Constraints
//1
//        ≤
//T
//≤
//        1000
//        1≤T≤1000
//        0
//        ≤
//P
//≤
//        1000
//        0≤P≤1000
//Sample 1:
//Input
//        Output
//5
//        103
//        0
//        6
//        142
//        1000
//        4
//        0
//        6
//        -1
//        10
//Explanation:
//Test Case
//1
//        1: The participant has solved
//4
//        4 problems out of which
//3
//        3 problems are worth
//1
//        1 point each while
//        1
//        1 problem is worth
//100
//        100 points.
//
//        Test Case
//2
//        2: Since participant's score is
//        0
//        0, he solved
//0
//        0 problems.
//
//        Test Case
//3
//        3: The participant has solved
//6
//        6 problems out of which all the problems are worth
//1
//        1 point.
//
//        Test Case
//4
//        4: It is not possible to get a score of
//142
//        142.
//
//Test Case
//5
//        5: The participant solved all the
//10
//        10 problems and score of all the problems is
//100
//        100.

package CodeChef_500_1000;

import java.util.Scanner;

public class CountACs {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int x = read.nextInt();

            int problemSolved = x%100;
            int totalProblems = problemSolved + x/100;

            if (totalProblems > 10){
                System.out.println("-1");
            } else {
                System.out.println(totalProblems);
            }
        }
    }
}
