//Expiring Bread
//Eikooc loves bread. She has
//N
//N loaves of bread, all of which expire after exactly
//        M
//M days. She can eat upto
//K
//K loaves of bread in a day. Can she eat all the loaves of bread before they expire?
//
//Input Format
//The first line contains a single integer
//        T
//T - the number of test cases. Then the test cases follow.
//Each test case consists of a single line containing three integers
//        N
//                N,
//                M
//M and
//K
//K - the number of loaves of bread Eikooc has, the number of days after which all the breads will expire and the number of loaves of bread Eikooc can eat in a day.
//        Output Format
//For each test case, output Yes if it will be possible for Eikooc to eat all the loaves of bread before they expire. Otherwise output No.
//
//You may print each character of Yes and No in uppercase or lowercase (for example, yes, yEs, YES will be considered identical).
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
//,
//M
//,
//K
//≤
//        100
//        1≤N,M,K≤100
//Sample 1:
//Input
//        Output
//3
//        100 100 1
//        9 2 5
//        19 6 3
//Yes
//        Yes
//No
//Explanation:
//Test case 1: Eikooc can eat one loaf of bread per day for
//        100
//        100 days. Thus none of the bread expires.
//
//Test case 2: Eikooc can eat
//5
//        5 loaves of the first day and
//4
//        4 loaves on the second day. Thus none of the bread expires.
//
//Test case 3: There is no way Eikooc can consume all the loaves of bread before it expires.

package CodeChef_500_1000;

import java.util.Scanner;

public class ExpiringBreads {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        for (int i = 0; i < t; i++){
            int n = read.nextInt();
            int m = read.nextInt();
            int k = read.nextInt();

            if (n <= m*k){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
