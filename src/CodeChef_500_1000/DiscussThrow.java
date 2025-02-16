//Discus Throw
//In discus throw, a player is given
//3
//        3 throws and the throw with the longest distance is regarded as their final score.
//
//You are given the distances for all
//3
//        3 throws of a player. Determine the final score of the player.
//
//Input Format
//First line will contain
//T
//T, number of test cases. Then the test cases follow.
//Each test case contains of a single line of input, three integers
//A
//,
//B
//,
//A,B, and
//        C
//C denoting the distances in each throw.
//Output Format
//For each test case, output the final score of the player.
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
//,
//C
//≤
//        100
//        1≤A,B,C≤100
//Sample 1:
//Input
//        Output
//3
//        10 15 8
//        32 32 32
//        82 45 54
//        15
//        32
//        82
//Explanation:
//Test Case
//1
//        1: The longest distance is achieved in the second throw, which is equal to
//15
//        15 units. Thus, the answer is
//15
//        15.
//
//Test Case
//2
//        2: In all throws, the distance is
//32
//        32 units. Thus, the final score is
//32
//        32.
//
//Test Case
//3
//        3: The longest distance is achieved in the first throw which is equal to
//82
//        82 units. Thus, the answer is
//82
//        82.

package CodeChef_500_1000;

import java.util.Scanner;

public class DiscussThrow {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int a = read.nextInt();
            int b = read.nextInt();
            int c = read.nextInt();

            System.out.println(Math.max(a, Math.max(b, c)));
        }
    }
}
