//Counting Pretty Numbers
//Read problems statements in Mandarin chinese, Russian and Vietnamese as well.
//Vasya likes the number
//239
//        239. Therefore, he considers a number pretty if its last digit is
//2
//        2,
//        3
//        3 or
//9
//        9.
//
//Vasya wants to watch the numbers between
//        L
//L and
//R
//R (both inclusive), so he asked you to determine how many pretty numbers are in this range. Can you help him?
//
//Input
//The first line of the input contains a single integer
//T
//T denoting the number of test cases. The description of
//        T
//T test cases follows.
//The first and only line of each test case contains two space-separated integers
//L
//L and
//R
//R.
//        Output
//For each test case, print a single line containing one integer — the number of pretty numbers between
//L
//L and
//R
//R.
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
//L
//≤
//R
//≤
//        1
//        0
//        5
//        1≤L≤R≤10
//        5
//
//Subtasks
//Subtask #1 (100 points): original constraints
//
//Sample 1:
//Input
//        Output
//2
//        1 10
//        11 33
//        3
//        8
//Explanation:
//Example case 1: The pretty numbers between
//1
//        1 and
//10
//        10 are
//2
//        2,
//        3
//        3 and
//9
//        9.
//
//Example case 2: The pretty numbers between
//11
//        11 and
//33
//        33 are
//12
//        12,
//        13
//        13,
//        19
//        19,
//        22
//        22,
//        23
//        23,
//        29
//        29,
//        32
//        32 and
//33
//        33.

package CodeChef_500_1000;

import java.util.Scanner;

public class CountingPrettyNumbers {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int L = read.nextInt();
            int R = read.nextInt();
            int count = 0;

            for (int i = L; i <= R; i++){
                int digits = i % 10;
                if (i % 10 == 2 || i % 10 == 3 || i % 10 == 9){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
