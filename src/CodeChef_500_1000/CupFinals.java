//Cup Finals
//It is the World Cup Finals. Chef only finds a match interesting if the skill difference of the competing teams is less than or equal to
//        D
//D.
//
//Given that the skills of the teams competing in the final are
//        X
//X and
//Y
//        Y respectively, determine whether Chef will find the game interesting or not.
//
//        Input Format
//The first line of input will contain a single integer
//T
//T, denoting the number of testcases. The description of
//        T
//T testcases follows.
//Each testcase consists of a single line of input containing three space-separated integers
//        X
//                X,
//                Y
//Y, and
//        D
//D — the skill levels of the teams and the maximum skill difference.
//        Output Format
//For each testcase, output "YES" if Chef will find the game interesting, else output "NO" (without the quotes). The checker is case-insensitive, so "YeS" and "nO" etc. are also acceptable.
//
//        Constraints
//1
//        ≤
//T
//≤
//        2000
//        1≤T≤2000
//        1
//        ≤
//X
//,
//Y
//≤
//        100
//        1≤X,Y≤100
//        0
//        ≤
//D
//≤
//        100
//        0≤D≤100
//Sample 1:
//Input
//        Output
//3
//        5 3 4
//        5 3 1
//        5 5 0
//YES
//        NO
//YES
//Explanation:
//Test case
//        1
//        1: The skill difference between the teams is
//2
//        2, which is less than the maximum allowed difference of
//4
//        4.
//
//Test case
//        2
//        2: The skill difference between the teams is
//2
//        2, which is more than the maximum allowed difference of
//1
//        1.

package CodeChef_500_1000;

import java.util.Scanner;

public class CupFinals {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int x = read.nextInt();
            int y = read.nextInt();
            int d = read.nextInt();

            int skillDifference = Math.abs(x - y);

            if (skillDifference <= d){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
