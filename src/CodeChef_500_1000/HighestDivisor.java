//Highest Divisor
//Read problem statements in Hindi, Bengali, Mandarin Chinese, Russian, and Vietnamese as well.
//You are given an integer
//        N
//N. Find the largest integer between
//1
//        1 and
//10
//        10 (inclusive) which divides
//N
//N.
//
//        Input
//The first and only line of the input contains a single integer
//N
//N.
//
//        Output
//Print a single line containing one integer ― the largest divisor of
//N
//N between
//1
//        1 and
//10
//        10.
//
//Constraints
//2
//        ≤
//N
//≤
//        1
//        ,
//        000
//        2≤N≤1,000
//Subtasks
//Subtask #1 (100 points): original constraints
//
//Sample 1:
//Input
//        Output
//91
//        7
//Explanation:
//The divisors of
//91
//        91 are
//1
//        ,
//        7
//        ,
//        13
//        ,
//        91
//        1,7,13,91, out of which only
//1
//        1 and
//7
//        7 are in the range
//        [
//1
//        ,
//        10
//        ]
//        [1,10]. Therefore, the answer is
//        max
//⁡
//        (
//        1
//        ,
//        7
//        )
//        =
//        7
//max(1,7)=7.
//
//Sample 2:
//Input
//        Output
//24
//        8
//Explanation:
//The divisors of
//24
//        24 are
//1
//        ,
//        2
//        ,
//        3
//        ,
//        4
//        ,
//        6
//        ,
//        8
//        ,
//        12
//        ,
//        24
//        1,2,3,4,6,8,12,24, out of which
//1
//        ,
//        2
//        ,
//        3
//        ,
//        4
//        ,
//        6
//        ,
//        8
//        1,2,3,4,6,8 are in the range
//        [
//1
//        ,
//        10
//        ]
//        [1,10]. Therefore, the answer is
//        max
//⁡
//        (
//        1
//        ,
//        2
//        ,
//        3
//        ,
//        4
//        ,
//        6
//        ,
//        8
//        )
//        =
//        8
//max(1,2,3,4,6,8)=8.

package CodeChef_500_1000;

import java.util.Scanner;

public class HighestDivisor {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int largestNumber = 1;

        for (int i = 10;i >= 1; i--){
            if (n%i==0){
                largestNumber = i;
                break;
            }
        }

        if (largestNumber != -1){
            System.out.println(largestNumber);
        } else {
            System.out.println("No largest divisor between 1 to 10");
        }
    }
}
