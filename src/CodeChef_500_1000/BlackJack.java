//Blackjack
//Chef is playing a variant of Blackjack, where
//3
//        3 numbers are drawn and each number lies between
//1
//        1 and
//10
//        10 (with both
//1
//        1 and
//10
//        10 inclusive). Chef wins the game when the sum of these
//3
//        3 numbers is exactly
//21
//        21.
//
//Given the first two numbers
//        A
//A and
//B
//B, that have been drawn by Chef, what should be
//3
//        3-rd number that should be drawn by the Chef in order to win the game?
//
//Note that it is possible that Chef cannot win the game, no matter what is the
//3
//        3-rd number. In such cases, report
//−
//        1
//        −1 as the answer.
//
//        Input Format
//The first line will contain an integer
//        T
//T - number of test cases. Then the test cases follow.
//The first and only line of each test case contains two integers
//        A
//A and
//B
//B - the first and second number drawn by the Chef.
//        Output Format
//For each testcase, output the
//3
//        3-rd number that should be drawn by the Chef in order to win the game. Output
//−
//        1
//        −1 if it is not possible for the Chef to win the game.
//
//Constraints
//1
//        ≤
//T
//≤
//        100
//        1≤T≤100
//        1
//        ≤
//A
//,
//B
//≤
//        10
//        1≤A,B≤10
//Sample 1:
//Input
//        Output
//3
//        1 10
//        1 5
//        4 9
//        10
//        -1
//        8
//Explanation:
//Test case
//        1
//        1: The first two numbers are
//1
//        1 and
//10
//        10. If the third number will be
//10
//        10, the resulting sum will be
//1
//        +
//        10
//        +
//        10
//        =
//        21
//        1+10+10=21. So Chef will win the game if the third number is
//10
//        10.
//
//Test case
//        2
//        2: The first two numbers are
//1
//        1 and
//5
//        5. There is no number between
//1
//        1 and
//10
//        10, that can make the resulting sum
//21
//        21. Hence, the answer will be
//−
//        1
//        −1 in this test case.

package CodeChef_500_1000;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int a = read.nextInt();
            int b = read.nextInt();

            int sum = a + b;
            int thirdNumber = 21 - sum;

            if (thirdNumber <= 10){
                System.out.println(thirdNumber);
            } else {
                System.out.println("-1");
            }
        }
    }
}
