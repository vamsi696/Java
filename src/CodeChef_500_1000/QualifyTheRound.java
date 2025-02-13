//Qualify the round
//In a coding contest, there are two types of problems:
//
//        Easy problems, which are worth
//1
//        1 point each
//        Hard problems, which are worth
//2
//        2 points each
//To qualify for the next round, a contestant must score at least
//X
//X points. Chef solved
//A
//A Easy problems and
//B
//B Hard problems. Will Chef qualify or not?
//
//Input Format
//The first line of input contains a single integer
//        T
//T, denoting the number of test cases. The description of
//        T
//T test cases follows.
//Each test case consists of a single line of input containing three space-separated integers —
//X
//,
//        A
//                X,A, and
//B
//B.
//        Output Format
//For each test case, output a new line containing the answer — Qualify if Chef qualifies for the next round, and NotQualify otherwise.
//
//Each character of the answer may be printed in either uppercase or lowercase. For example, if the answer is Qualify, outputs such as qualify, quALiFy, QUALIFY and QuAlIfY will also be accepted as correct.
//
//        Constraints
//1
//        ≤
//T
//≤
//        100
//        1≤T≤100
//        1
//        ≤
//X
//≤
//        100
//        1≤X≤100
//        0
//        ≤
//A
//,
//B
//≤
//        100
//        0≤A,B≤100
//Sample 1:
//Input
//        Output
//3
//        15 9 3
//        5 3 0
//        6 2 8
//Qualify
//        NotQualify
//Qualify
//Explanation:
//Test Case
//1
//        1: Chef solved
//9
//        9 easy problems and
//3
//        3 hard problems, making his total score
//9
//        ⋅
//        1
//        +
//        3
//        ⋅
//        2
//        =
//        15
//        9⋅1+3⋅2=15. He needs at least
//15
//        15 points to qualify, which he has and hence he qualifies.
//
//        Test Case
//2
//        2: Chef solved
//3
//        3 easy problems and
//0
//        0 hard problems, making his total score
//3
//        ⋅
//        1
//        +
//        0
//        ⋅
//        2
//        =
//        3
//        3⋅1+0⋅2=3. He needs at least
//5
//        5 points to qualify, which he doesn't have and hence doesn't qualify.
//
//Test Case
//3
//        3: Chef solved
//2
//        2 easy problems and
//8
//        8 hard problems, making his total score
//2
//        ⋅
//        1
//        +
//        8
//        ⋅
//        2
//        =
//        18
//        2⋅1+8⋅2=18. He needs at least
//6
//        6 points to qualify, which he has and hence he qualifies.

package CodeChef_500_1000;

import java.util.Scanner;

public class QualifyTheRound {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int x = read.nextInt();
            int a = read. nextInt();
            int b = read.nextInt();

            int easyPoints = a * 1;
            int hardPoints = b * 2;

            int totalPoints = easyPoints + hardPoints;

            if (totalPoints >= x){
                System.out.println("Qualify");
            } else {
                System.out.println("NotQualify");
            }
        }
    }
}
