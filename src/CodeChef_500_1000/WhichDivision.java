//Which Division
//Read problems statements in Mandarin Chinese, Russian, and Bengali as well.
//
//Given the rating
//        R
//R of a person, tell which division he belongs to. The rating range for each division are given below:
//
//Division
//1
//        1:
//        2000
//        ≤
//        2000≤ Rating.
//
//        Division
//2
//        2:
//        1600
//        ≤
//        1600≤ Rating
//        <
//2000
//<2000.
//
//Division
//3
//        3: Rating
//        <
//1600
//<1600.
//
//Input Format
//The first line of the input contains
//        T
//T - the number of test cases. Then the test cases follow.
//Each testcase contains a single line of input, which contains a single integer
//R
//R.
//        Output Format
//For each test case, output on a single line the answer:
//        1
//        1 if the person belongs to Division
//1
//        1,
//        2
//        2 if the person belongs to Division
//2
//        2, and
//3
//        3 if the person belongs to Division
//3
//        3.
//
//Constraints
//1
//        ≤
//T
//≤
//        1000
//        1≤T≤1000
//        1000
//        ≤
//R
//≤
//        4500
//        1000≤R≤4500
//Sample 1:
//Input
//        Output
//3
//        1500
//        4000
//        1900
//        3
//        1
//        2
//Explanation:
//Test case
//        1
//        1: Since the rating of the person lies in the range
//        [
//1000
//        ,
//        1600
//        )
//        [1000,1600), he belongs to Division
//3
//        3.
//
//Test case
//        2
//        2: Since the rating of the person lies in the range
//        [
//2000
//        ,
//        4500
//        ]
//        [2000,4500], he belongs to Division
//1
//        1.
//
//Test case
//        3
//        3: Since the rating of the person lies in the range
//        [
//1600
//        ,
//        2000
//        )
//        [1600,2000), he belongs to Division
//2
//        2.

package CodeChef_500_1000;

import java.util.Scanner;

public class WhichDivision {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int rating = read.nextInt();

            if (rating >= 2000){
                System.out.println("1");
            } else if (rating < 2000 && rating >= 1600){
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }
    }
}
