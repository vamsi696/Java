//Minimum number of coins
//Chef has infinite coins in denominations of rupees
//5
//        5 and rupees
//10
//        10.
//
//Find the minimum number of coins Chef needs, to pay exactly
//X
//X rupees. If it is impossible to pay
//X
//X rupees in denominations of rupees
//5
//        5 and
//10
//        10 only, print
//−
//        1
//        −1.
//
//Input Format
//First line will contain
//T
//T, number of test cases. Then the test cases follow.
//Each test case contains of a single integer
//        X
//X.
//        Output Format
//For each test case, print a single integer - the minimum number of coins Chef needs, to pay exactly
//        X
//X rupees. If it is impossible to pay
//X
//X rupees in denominations of rupees
//5
//        5 and
//10
//        10 only, print
//−
//        1
//        −1.
//
//Constraints
//1
//        ≤
//T
//≤
//        1000
//        1≤T≤1000
//        1
//        ≤
//X
//≤
//        1000
//        1≤X≤1000
//Subtasks
//Subtask 1 (100 points): Original constraints.
//Sample 1:
//Input
//        Output
//3
//        50
//        15
//        8
//        5
//        2
//        -1
//Explanation:
//Test Case
//1
//        1: Chef would require at least
//5
//        5 coins to pay
//50
//        50 rupees. All these coins would be of rupees
//10
//        10.
//
//Test Case
//2
//        2: Chef would require at least
//2
//        2 coins to pay
//15
//        15 rupees. Out of these,
//        1
//        1 coin would be of rupees
//10
//        10 and
//1
//        1 coin would be of rupees
//5
//        5.
//
//Test Case
//3
//        3: Chef cannot pay exactly
//8
//        8 rupees in denominations of rupees
//5
//        5 and
//10
//        10 only.

package CodeChef_500_1000;

import java.util.Scanner;

public class MinimumNumberOfCoins {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int x = read.nextInt();
            if (x%10 == 0){
                System.out.println(x/10);
            } else if (x%5 == 0){
                System.out.println((x/10)+1);
            } else {
                System.out.println("-1");
            }
        }
    }
}
