//Chef and Contest
//Chef and Chefina are competing against each other in a programming contest. They were both able to solve all the problems in the contest, so the winner between them must be decided by time penalty. Chef solved all the problems in
//X
//X minutes and made
//P
//P wrong submissions, while Chefina solved all the problems in
//Y
//Y minutes and made
//Q
//Q wrong submissions. Who won the competition (or was it a draw)?
//
//Note: The time penalty is calculated as follows:
//
//The base time penalty is the time at which the final problem was solved (so,
//                                                                         X
//                                                                                 X for Chef and
//                                                                                 Y
//                                                                                 Y for Chefina)
//Each wrong submission adds a penalty of
//10
//        10 minutes
//The winner is the person with less penalty time. If they both have the same penalty, it is considered a draw.
//        Input Format
//The first line of input contains a single integer
//        T
//T, denoting the number of test cases. The description of
//        T
//T test cases follows.
//The first and only line of each test case contains four space-separated integers —
//X
//,
//Y
//,
//        P
//                X,Y,P, and
//Q
//Q respectively.
//Output Format
//For each test case, output a single line containing one string — the name of the winner ("Chef" or "Chefina"), or "Draw" if the match was a draw. Print each string without the quotes.
//
//Each character of the answer can be printed in either uppercase or lowercase, i.e, the strings "Chef", "chEf", "cHeF", etc. are treated as equivalent.
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
//,
//Y
//≤
//        100
//        1≤X,Y≤100
//        0
//        ≤
//P
//,
//Q
//≤
//        100
//        0≤P,Q≤100
//Sample 1:
//Input
//        Output
//3
//        10 8 2 3
//        10 10 10 10
//        40 21 2 0
//Chef
//        Draw
//Chefina
//Explanation:
//Test Case
//1
//        1:
//
//Chef solved the problems in
//10
//        10 minutes and made
//2
//        2 wrong submissions, thus his total penalty is
//10
//        +
//        2
//        ⋅
//        10
//        =
//        30
//        10+2⋅10=30 minutes.
//Chefina solved the problems in
//8
//        8 minutes and made
//3
//        3 wrong submissions, thus her total penalty is
//8
//        +
//        3
//        ⋅
//        10
//        =
//        38
//        8+3⋅10=38 minutes.
//Chef took less time, so he is the winner.
//
//Test Case
//2
//        2:
//
//Chef solved the problems in
//10
//        10 minutes and made
//10
//        10 wrong submissions, thus his total penalty is
//10
//        +
//        10
//        ⋅
//        10
//        =
//        110
//        10+10⋅10=110 minutes.
//Chefina solved the problems in
//10
//        10 minutes and made
//3
//        3 wrong submissions, thus her total penalty is
//10
//        +
//        10
//        ⋅
//        10
//        =
//        110
//        10+10⋅10=110 minutes.
//Chef and Chefina took the same time, so the match is a draw.
//
//Test Case
//3
//        3:
//
//Chef solved the problems in
//40
//        40 minutes and made
//2
//        2 wrong submissions, thus his total penalty is
//40
//        +
//        2
//        ⋅
//        10
//        =
//        60
//        40+2⋅10=60 minutes.
//Chefina solved the problems in
//21
//        21 minutes and made
//0
//        0 wrong submissions, thus her total penalty is
//21
//        +
//        0
//        ⋅
//        10
//        =
//        21
//        21+0⋅10=21 minutes.
//Chefina took less time, so she is the winner.

package CodeChef_500_1000;

import java.util.Scanner;

public class ChefAndContest {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int x = read.nextInt();
            int y = read.nextInt();
            int p = read.nextInt();
            int q = read.nextInt();

            int chefTotalPenalities = x + (p * 10);
            int chefinaTotalPenalities = y + (q * 10);

            if (chefTotalPenalities == chefinaTotalPenalities){
                System.out.println("Draw");
            } else if (chefTotalPenalities < chefinaTotalPenalities){
                System.out.println("Chef");
            } else {
                System.out.println("Chefina");
            }
        }
    }
}
