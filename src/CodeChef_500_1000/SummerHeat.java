//Summer Heat
//Read problem statements in Vietnamese,
//Bengali, Mandarin Chinese, and Russian as well.
//
//        Chefland has
//2
//        2 different types of coconut, type
//A
//A and type
//        B
//B. Type
//        A
//A contains only
//        x
//a
//        x
//a
//​
//milliliters of coconut water and type
//B
//B contains only
//        x
//b
//        x
//b
//​
//grams of coconut pulp. Chef's nutritionist has advised him to consume
//X
//        a
//X
//        a
//​
//milliliters of coconut water and
//        X
//b
//        X
//b
//​
//grams of coconut pulp every week in the summer. Find the total number of coconuts (type
//                                                                                           A
//A + type
//                                                                                           B
//                                                                                           B) that Chef should buy each week to keep himself active in the hot weather.
//
//Input Format
//The first line contains an integer
//T
//T, the number of test cases. Then the test cases follow.
//Each test case contains a single line of input, four integers
//        x
//a
//        x
//a
//​
//        ,
//x
//        b
//x
//        b
//​
//        ,
//X
//        a
//X
//        a
//​
//        ,
//X
//        b
//X
//        b
//​
//        .
//Output Format
//For each test case, output in a single line the answer to the problem.
//
//Constraints
//1
//        ≤
//T
//≤
//        15000
//        1≤T≤15000
//        100
//        ≤
//x
//        a
//≤
//        200
//        100≤x
//        a
//​
//        ≤200
//        400
//        ≤
//x
//        b
//≤
//        500
//        400≤x
//        b
//​
//        ≤500
//        1000
//        ≤
//X
//        a
//≤
//        1200
//        1000≤X
//        a
//​
//        ≤1200
//        1000
//        ≤
//X
//        b
//≤
//        1500
//        1000≤X
//        b
//​
//        ≤1500
//x
//        a
//x
//        a
//​
//divides
//        X
//a
//        X
//a
//​
//        .
//x
//        b
//x
//        b
//​
//divides
//        X
//b
//        X
//b
//​
//        .
//Subtasks
//Subtask #1 (100 points): original constraints
//
//Sample 1:
//Input
//        Output
//3
//        100 400 1000 1200
//        100 450 1000 1350
//        150 400 1200 1200
//        13
//        13
//        11
//Explanation:
//TestCase
//1
//        1: Number of coconuts of Type
//        A
//A required =
//        1000
//100
//        =
//        10
//        100
//        1000
//        ​
//        =10 and number of coconuts of Type
//B
//B required =
//        1200
//400
//        =
//        3
//        400
//        1200
//        ​
//        =3. So the total number of coconuts required is
//10
//        +
//        3
//        =
//        13
//        10+3=13.
//
//TestCase
//2
//        2: Number of coconuts of Type
//        A
//A required =
//        1000
//100
//        =
//        10
//        100
//        1000
//        ​
//        =10 and number of coconuts of Type
//B
//B required =
//        1350
//450
//        =
//        3
//        450
//        1350
//        ​
//        =3. So the total number of coconuts required is
//10
//        +
//        3
//        =
//        13
//        10+3=13.
//
//TestCase
//3
//        3: Number of coconuts of Type
//        A
//A required =
//        1200
//150
//        =
//        8
//        150
//        1200
//        ​
//        =8 and number of coconuts of Type
//B
//B required =
//        1200
//400
//        =
//        3
//        400
//        1200
//        ​
//        =3. So the total number of coconuts required is
//8
//        +
//        3
//        =
//        11
//        8+3=11.

package CodeChef_500_1000;

import java.util.Scanner;

public class SummerHeat {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0) {
            int x1 = read.nextInt();
            int x2 = read.nextInt();
            int y1 = read.nextInt();
            int y2 = read.nextInt();

            int typeA = y1/x1;
            int typeB = y2/x2;

            int totalCount = typeA + typeB;

            System.out.println(totalCount);
        }
    }
}
