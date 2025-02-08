//Football Cup
//The code in the IDE is incorrect - debug the code to solve this problem!
//
//Chef likes a football match if
//
//The match ends in a draw, and,
//At least one goal has been scored by either team.
//Given the goals scored by both the teams as
//        X
//X and
//Y
//        Y respectively, determine whether Chef will like the match or not.
//
//Input Format
//The first line of input will contain a single integer
//T
//T, denoting the number of test cases. The description of
//        T
//T test cases follows.
//Each test case consists of a single line of input containing two space-separated integers
//X
//X and
//Y
//Y — the goals scored by each team.
//Output Format
//For each test case, output
//        YES
//YES if Chef will like the match, else output
//        NO
//NO.
//
//        Sample 1:
//Input
//        Output
//2
//        1 1
//        0 1
//YES
//        NO
//Explanation:
//Test case
//        1
//        1: It is a draw in which both teams have scored a goal, Chef will like this match.
//
//        Test case
//        2
//        2: The game is not a draw. Hence, Chef will not like this match.

package CodeChef_500_1000;

import java.util.Scanner;

public class Football_Cup {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int x = read.nextInt();
            int y = read.nextInt();

            if (x == y && x != 0 && y != 0){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
