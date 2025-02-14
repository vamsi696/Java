//Minimum Cars required
//A single car can accommodate at most
//4
//        4 people.
//
//        N
//N friends want to go to a restaurant for a party. Find the minimum number of cars required to accommodate all the friends.
//
//Input Format
//The first line contains a single integer
//        T
//T - the number of test cases. Then the test cases follow.
//The first and only line of each test case contains an integer
//        N
//N - denoting the number of friends.
//        Output Format
//For each test case, output the minimum number of cars required to accommodate all the friends.
//
//Constraints
//1
//        ≤
//T
//≤
//        1000
//        1≤T≤1000
//        2
//        ≤
//N
//≤
//        1000
//        2≤N≤1000
//Sample 1:
//Input
//        Output
//4
//        4
//        2
//        7
//        98
//        1
//        1
//        2
//        25
//Explanation:
//Test Case
//1
//        1: There are only
//4
//        4 friends and a single car can accommodate
//4
//        4 people. Thus, only
//1
//        1 car is required.
//
//        Test Case
//2
//        2: There are only
//2
//        2 friends and a single car can accommodate
//4
//        4 people. Thus, only
//1
//        1 car is required
//
//Test Case
//3
//        3: There are
//7
//        7 friends and
//2
//        2 cars can accommodate
//8
//        8 people. Thus,
//        2
//        2 cars are required.

package CodeChef_500_1000;

import java.util.Scanner;

public class MaximumCarsRequired {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int n = read.nextInt();
            int cars = (n+3)/4;

            System.out.println(cars);
        }
    }
}
