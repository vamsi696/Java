//Group Assignment
//Chef's professor is planning to give his class a group assignment. There are
//        2
//N
//2N students in the class, with distinct roll numbers ranging from
//1
//        1 to
//2
//N
//2N. Chef's roll number is
//X
//X.
//
//The professor decided to create
//        N
//N groups of
//2
//        2 students each. The groups were created as follows: the first group consists of roll numbers
//1
//        1 and
//2
//N
//2N, the second group of roll numbers
//2
//        2 and
//2
//N
//−
//        1
//        2N−1, and so on, with the final group consisting of roll numbers
//        N
//N and
//N
//+
//        1
//N+1.
//
//Chef wonders who his partner will be. Can you help Chef by telling him the roll number of his partner?
//
//Input Format
//The first line of input will contain an integer
//        T
//T — the number of test cases. The description of
//        T
//T test cases follows.
//The first and only line of each test case contains two integers
//        N
//N and
//X
//X, denoting the number of groups that will be formed, and Chef's roll number.
//Output Format
//For each test case, output the roll number of the student that will be Chef's partner.
//
//Constraints
//1
//        ≤
//T
//≤
//        1
//        0
//        3
//        1≤T≤10
//        3
//
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
//        1
//        ≤
//X
//≤
//        2
//N
//1≤X≤2N
//Sample 1:
//Input
//        Output
//3
//        2 2
//        3 1
//        3 4
//        3
//        6
//        3
//Explanation:
//Test case
//        1
//        1: The groups will be
//{
//        (
//        1
//        ,
//        4
//        )
//        ,
//        (
//        2
//        ,
//        3
//        )
//        }
//        {(1,4),(2,3)}. Chef's roll number is
//        2
//        2, so his partner's roll number will be
//        3
//        3.
//
//Test case
//        2
//        2: The groups will be
//{
//        (
//        1
//        ,
//        6
//        )
//        ,
//        (
//        2
//        ,
//        5
//        )
//        ,
//        (
//        3
//        ,
//        4
//        )
//        }
//        {(1,6),(2,5),(3,4)}. Chef's roll number is
//        1
//        1, so his partner's roll number will be
//        6
//        6.
//
//Test case
//        3
//        3: The groups will be
//{
//        (
//        1
//        ,
//        6
//        )
//        ,
//        (
//        2
//        ,
//        5
//        )
//        ,
//        (
//        3
//        ,
//        4
//        )
//        }
//        {(1,6),(2,5),(3,4)}. Chef's roll number is
//        4
//        4, so his partner's roll number will be
//        3
//        3.

package CodeChef_500_1000;

import java.util.Scanner;

public class GroupAssessment {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int n = read.nextInt();
            int x =  read.nextInt();

            int chefPartner = 2 * n + 1 - x;

            System.out.println(chefPartner);
        }
    }
}
