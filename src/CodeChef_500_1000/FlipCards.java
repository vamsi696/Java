//(Flip cards) - Solve the complete problem
//There are
//N
//N cards on a table, out of which
//        X
//X cards are face-up and the remaining are face-down.
//In one operation, we can do the following:
//
//Select any one card and flip it (i.e. if it was initially face-up, after the operation, it will be face-down and vice versa)
//What is the minimum number of operations we must perform so that all the cards face in the same direction (i.e. either all are face-up or all are face-down)?
//
//Input Format
//The first line contains a single integer
//        T
//T — the number of test cases. Then the test cases follow.
//The first and only line of each test case contains two space-separated integers
//N
//N and
//X
//X — the total number of cards and the number of cards which are initially face-up.
//        Output Format
//For each test case, output the minimum number of cards you must flip so that all the cards face in the same direction.
//
//        Sample 1:
//Input
//        Output
//4
//        5 0
//        4 2
//        3 3
//        10 2
//        0
//        2
//        0
//        2
//Explanation:
//Test Case 1: All the cards are already facing down. Therefore we do not need to perform any operations.
//
//Test Case 2:
//        2
//        2 cards are facing up and
//2
//        2 cards are facing down. Therefore we can flip the
//2
//        2 cards which are initially facing down.
//
//Test Case 3: All the cards are already facing up. Therefore we do not need to perform any operations.
//
//Test Case 4:
//        2
//        2 cards are facing up and
//8
//        8 cards are facing down. Therefore we can flip the
//2
//        2 cards which are initially facing up.

package CodeChef_500_1000;

import java.util.Scanner;

public class FlipCards {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int n = read.nextInt();
            int x = read.nextInt();

            int flipCards = n - x;

            System.out.println(Math.min(flipCards, x));
        }
    }
}
