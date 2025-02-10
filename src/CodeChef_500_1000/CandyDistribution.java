//Candy Distribution
//Chef has
//N
//N candies. He has to distribute them to exactly
//        M
//M of his friends such that each friend gets equal number of candies and each friend gets even number of candies. Determine whether it is possible to do so.
//
//        NOTE: Chef will not take any candies himself and will distribute all the candies.
//
//        Input Format
//First line will contain
//T
//T, number of test cases. Then the test cases follow.
//Each test case contains of a single line of input, two integers
//N
//N and
//M
//M, the number of candies and the number of friends.
//        Output Format
//For each test case, the output will consist of a single line containing Yes if Chef can distribute the candies as per the conditions and No otherwise.
//
//You may print each character of the string in uppercase or lowercase (for example, the strings yes, Yes, yEs, and YES will all be treated as identical).
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
//≤
//        1000
//        1≤N,M≤1000
//Sample 1:
//Input
//        Output
//4
//        9 3
//        4 1
//        4 2
//        8 3
//No
//        Yes
//Yes
//        No
//Explanation:
//Test case
//        1
//        1: Since Chef has
//9
//        9 candies and
//3
//        3 friends, each friend will get
//9
//        3
//        =
//        3
//        3
//        9
//        ​
//        =3 candies. Since
//3
//        3 is not even, Chef doesn't satisfy the conditions.
//
//Test case
//        2
//        2: Since Chef has
//4
//        4 candies and
//1
//        1 friend, each friend will get
//4
//        1
//        =
//        4
//        1
//        4
//        ​
//        =4 candies. Since
//4
//        4 is even, Chef satisfies all the conditions.
//
//Test case
//        3
//        3: Since Chef has
//4
//        4 candies and
//2
//        2 friends, each friend will get
//4
//        2
//        =
//        2
//        2
//        4
//        ​
//        =2 candies. Since
//2
//        2 is even, Chef satisfies all the conditions.
//
//Test case
//        4
//        4: Since Chef has
//8
//        8 candies and
//3
//        3 friends. Since Chef won't be able to distribute all the candies equally, Chef does not satisfy all the conditions.

package CodeChef_500_1000;

import java.util.Scanner;

public class CandyDistribution {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int n = read.nextInt();
            int m = read.nextInt();

            if (n%m == 0){
                int numofCandies = n/m;
                if (numofCandies%2 == 0){
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("No");
            }
        }
    }
}
