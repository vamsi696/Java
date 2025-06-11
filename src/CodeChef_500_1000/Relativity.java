//Relativity
//Read problem statements in Bengali, Mandarin Chinese, Russian, and Vietnamese as well.
//        In Chefland, the speed of light is
//c
//
//        m
///
//s
//c m/s, and acceleration due to gravity is
//g
//
//        m
///
//s
//2
//g m/s
//2
//        .
//
//Find the smallest height (in meters) from which Chef should jump such that during his journey down only under the effect of gravity and independent of any air resistance, he achieves the speed of light and verifies Einstein's theory of special relativity.
//
//Assume he jumps at zero velocity and at any time, his velocity (
//        v
//                v) and depth of descent (
//H
//H) are related as
//        v
//2
//        =
//        2
//        ⋅
//g
//⋅
//H
//        .
//        v
//2
//        =2⋅g⋅H.
//
//        Input
//The first line contains an integer
//T
//T, the number of test cases. Then the test cases follow.
//Each test case contains a single line of input, two integers
//        g
//g,
//c
//c.
//        Output
//For each test case, output in a single line the answer to the problem. We can show that under the constraints, the answer is an integer.
//
//        Constraints
//1
//        ≤
//T
//≤
//        5
//        ⋅
//        1
//        0
//        3
//        1≤T≤5⋅10
//        3
//
//
//        1
//        ≤
//g
//≤
//        10
//        1≤g≤10
//        1000
//        ≤
//c
//≤
//        3000
//        1000≤c≤3000
//        2
//        ⋅
//g
//2⋅g divides
//c
//2
//c
//2
//        .
//Subtasks
//Subtask #1 (100 points): Original constraints
//
//Sample 1:
//Input
//        Output
//3
//        7 1400
//        5 1000
//        10 1000
//        140000
//        100000
//        50000
//Explanation:
//Test Case
//1
//        1: For Chef to achieve the speed of light, the minimum height required is
//c
//2
//        2
//        ⋅
//g
//2⋅g
//        c
//2
//
//        ​
//        =
//        1400
//        ⋅
//        1400
//        14
//        14
//        1400⋅1400
//        ​
//        =
//        140000
//        140000 meters.
//
//        Test Case
//3
//        3: For Chef to achieve the speed of light, the minimum height required is
//c
//2
//        2
//        ⋅
//g
//2⋅g
//        c
//2
//
//        ​
//        =
//        1000
//        ⋅
//        1000
//        20
//        20
//        1000⋅1000
//        ​
//        =
//        50000
//        50000 meters.

package CodeChef_500_1000;

import java.util.Scanner;

public class Relativity {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int g = read.nextInt();
            int c = read.nextInt();

            int minimumHeight = (c * c)/(2 * g);

            System.out.println(minimumHeight);
        }
    }
}
