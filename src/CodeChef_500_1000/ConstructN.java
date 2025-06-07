//Construct N
//You are given an integer
//        N
//N. Find if it is possible to represent
//        N
//N as the sum of several(possibly zero)
//2
//        2's and several(possibly zero)
//        7
//        7's.
//
//Formally, find if there exist two integers
//X
//,
//Y
//
//        (
//                X
//                ,
//                Y
//≥
//                        0
//        )
//X,Y (X,Y≥0) such that
//2
//        ⋅
//X
//+
//        7
//        ⋅
//Y
//=
//N
//2⋅X+7⋅Y=N.
//
//        Input Format
//The first line of input will contain a single integer
//T
//T, denoting the number of test cases.
//Each test case consists of a single line containing an integer
//N
//N.
//        Output Format
//For each test case, print on a new line YES if it is possible to represent
//        N
//N as the sum of several(possibly zero)
//2
//        2's and several(possibly zero)
//        7
//        7's and NO otherwise.
//
//You may print each character of the string in either uppercase or lowercase (for example, the strings yEs, yes, Yes, and YES will all be treated as identical).
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
//N
//≤
//        1
//        0
//        8
//        1≤N≤10
//        8
//
//Sample 1:
//Input
//        Output
//4
//        2
//        5
//        7
//        11
//YES
//        NO
//YES
//        YES
//Explanation:
//Test case
//        1
//        1:
//        2
//        ⋅
//        1
//        +
//        7
//        ⋅
//        0
//        =
//        2
//        2⋅1+7⋅0=2.
//
//Test case
//        2
//        2: It is impossible to express
//5
//        5 as a sum of several
//2
//        2's and
//        7
//        7's.
//
//Test case
//        3
//        3:
//        2
//        ⋅
//        0
//        +
//        7
//        ⋅
//        1
//        =
//        7
//        2⋅0+7⋅1=7.
//
//Test case
//        4
//        4:
//        2
//        ⋅
//        2
//        +
//        7
//        ⋅
//        1
//        =
//        11
//        2⋅2+7⋅1=11.

package CodeChef_500_1000;

import java.util.Scanner;

public class ConstructN {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int n = read.nextInt();
            boolean possible = false;

            for (int y = 0; y <= n/7;y++){
                int remaining = (n - 7 * y);
                if (remaining % 2 == 0){
                    possible = true;
                    break;
                }
            }
            System.out.println(possible?"Yes":"No");
        }
    }
}
