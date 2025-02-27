//Valentine is Coming
//Valentine's Day is approaching and thus Chef wants to buy some chocolates for someone special.
//
//Chef has a total of
//        X
//X rupees and one chocolate costs
//Y
//Y rupees. What is the maximum number of chocolates Chef can buy?
//
//Input Format
//First line will contain
//T
//T, the number of test cases. Then the test cases follow.
//Each test case contains a single line of input, two integers
//        X
//        ,
//        Y
//X,Y - the amount Chef has and the cost of one chocolate respectively.
//        Output Format
//For each test case, output the maximum number of chocolates Chef can buy.
//
//        Constraints
//1
//        ≤
//T
//≤
//        1000
//        1≤T≤1000
//        1
//        ≤
//X
//,
//Y
//≤
//        100
//        1≤X,Y≤100
//Sample 1:
//Input
//        Output
//4
//        5 10
//        16 5
//        35 7
//        100 1
//        0
//        3
//        5
//        100
//Explanation:
//Test case-1: Chef has
//5
//        5 rupees but the cost of one chocolate is
//10
//        10 rupees. Therefore Chef can not buy any chocolates.
//
//        Test case-2: Chef has
//16
//        16 rupees and the cost of one chocolate is
//5
//        5 rupees. Therefore Chef can buy at max
//3
//        3 chocolates since buying
//4
//        4 chocolates would cost
//20
//        20 rupees.
//
//        Test case-3: Chef has
//35
//        35 rupees and the cost of one chocolate is
//7
//        7 rupees. Therefore Chef can buy at max
//5
//        5 chocolates for
//        35
//        35 rupees.
//
//        Test case-4: Chef has
//100
//        100 rupees and the cost of one chocolate is
//1
//        1 rupee. Therefore Chef can buy at max
//100
//        100 chocolates for
//        100
//        100 rupees.

package CodeChef_500_1000;

import java.util.Scanner;

public class ValentineIsComing {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int x = read.nextInt();
            int y = read.nextInt();

            if (x < y){
                System.out.println("0");
            } else {
                System.out.println(x/y);
            }
        }
    }
}
