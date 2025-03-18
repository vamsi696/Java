//Minimum number of Flips
//Chef has an array
//A
//A of length
//        N
//N consisting of
//1
//        1 and
//−
//        1
//        −1 only.
//
//In one operation, Chef can choose any index
//        i
//i
//        (
//1
//        ≤
//i
//≤
//        N
//        )
//(1≤i≤N) and multiply the element
//A
//        i
//A
//        i
//​
//by
//−
//        1
//        −1.
//
//Find the minimum number of operations required to make the sum of the array equal to
//0
//        0. Output -1 if the sum of the array cannot be made
//0
//        0.
//
//Input Format
//First line will contain
//T
//T, number of test cases. Then the test cases follow.
//First line of each test case consists of a single integer
//        N
//N denoting the length of the array.
//Second line of each test case contains
//        N
//N space-separated integers
//A
//1
//        ,
//A
//2
//        ,
//        …
//        ,
//A
//        N
//A
//1
//        ​
//        ,A
//2
//        ​
//        ,…,A
//        N
//​
//denoting the array
//        A
//A.
//        Output Format
//For each test case, output the minimum number of operations to make the sum of the array equal to
//0
//        0. Output -1 if it is not possible to make the sum equal to
//0
//        0.
//
//Constraints
//1
//        ≤
//T
//≤
//        100
//        1≤T≤100
//        2
//        ≤
//N
//≤
//        1000
//        2≤N≤1000
//A
//        i
//        =
//        1
//A
//        i
//​
//        =1 or
//        A
//i
//=
//        −
//        1
//A
//        i
//​
//        =−1
//Sample 1:
//Input
//        Output
//4
//        4
//        1 1 1 1
//        5
//        1 -1 1 -1 1
//        6
//        1 -1 -1 1 1 1
//        2
//        1 -1
//        2
//        -1
//        1
//        0
//Explanation:
//Test case
//        1
//        1: The minimum number of operations required is
//2
//        2. In the first operation, change
//A
//3
//A
//3
//        ​
//from
//1
//        1 to
//−
//        1
//        −1. Similarly, in the second operation, change
//A
//4
//A
//4
//        ​
//from
//1
//        1 to
//−
//        1
//        −1. Thus, the sum of the final array is
//1
//        +
//        1
//        −
//        1
//        −
//        1
//        =
//        0
//        1+1−1−1=0.
//
//Test case
//        2
//        2: It can be proven that the sum of the array cannot be made equal to zero by making any number of operations.
//
//Test case
//        3
//        3: We can change
//        A
//1
//A
//1
//        ​
//from
//1
//        1 to
//−
//        1
//        −1 in one operation. Thus, the sum of the array becomes
//−
//        1
//        −
//        1
//        −
//        1
//        +
//        1
//        +
//        1
//        +
//        1
//        =
//        0
//        −1−1−1+1+1+1=0.
//
//Test case
//        4
//        4: The sum of the array is already zero. Thus we do not need to make any operations.

package CodeChef_500_1000;

import java.util.Scanner;

public class MinimumNumberOfFlips {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int n = read.nextInt();

            if (n < 1) {
                System.out.println("Invalid Input");
                continue;
            }

            int[] arr = new int[n];
            int totalSum = 0;

            for (int i = 0; i < n; i++){
                arr[i] = read.nextInt();
                totalSum += arr[i];
            }

            if (totalSum%2 != 0){
                System.out.println("-1");
            } else {
                int absSum = Math.abs(totalSum);
                System.out.println(absSum/2);
            }
        }
    }
}
