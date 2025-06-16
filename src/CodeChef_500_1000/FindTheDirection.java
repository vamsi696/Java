//Find the Direction
//Chef is currently facing the north direction. Each second he rotates exactly
//90
//        90 degrees in clockwise direction. Find the direction in which Chef is facing after exactly
//X
//X seconds.
//
//Note
//:
//Note: There are only 4 directions: North, East, South, West (in clockwise order).
//
//Input Format
//First line will contain
//T
//T, number of testcases. Then the testcases follow.
//Each testcase contains of a single integer
//        X
//X.
//        Output Format
//For each testcase, output the direction in which Chef is facing after exactly
//X
//X seconds.
//
//Constraints
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
//        1000
//        1≤X≤1000
//Sample 1:
//Input
//        Output
//3
//        1
//        3
//        6
//East
//        West
//South
//Explanation:
//Chef is facing North in the starting.
//
//        Test Case
//1
//        1: After
//1
//        1 second he turns
//90
//        90 degrees clockwise and now faces the east direction.
//
//Test Case
//2
//        2: Direction after
//1
//        1 second- east
//
//Direction after
//2
//        2 seconds- south
//
//Direction after
//3
//        3 seconds- west

package CodeChef_500_1000;

import java.util.Scanner;

public class FindTheDirection {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int x = read.nextInt();

            if (x % 4 == 0){
                System.out.println("North");
            } else if (x % 4 == 1){
                System.out.println("East");
            } else if (x % 4 == 2){
                System.out.println("South");
            } else {
                System.out.println("West");
            }
        }
    }
}
