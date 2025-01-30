//Total prize money
//The code given in the IDE is incorrect - Try and debug this program!!!
//
//In a coding contest, there are prizes for the top rankers. The prize scheme is as follows:
//
//Top
//10
//        10 participants receive rupees
//        X
//X each.
//Participants with rank
//11
//        11 to
//100
//        100 (both inclusive) receive rupees
//Y
//Y each.
//Find the total prize money over all the participants.
//
//        Input Format
//First line will contain
//T
//T, number of test cases. Then the test cases follow.
//Each test case contains of a single line of input, two integers
//X
//X and
//Y
//Y - the prize for top
//10
//        10 rankers and the prize for ranks
//11
//        11 to
//100
//        100 respectively.
//        Output Format
//For each test case, output the total prize money over all the contestants.
//
//        Sample 1:
//Input
//        Output
//2
//        80 1
//        400 30
//        890
//        6700
//Explanation:
//Test Case
//1
//        1: Top
//10
//        10 participants receive rupees
//80
//        80 and next
//90
//        90 participants receive rupee
//1
//        1 each. So, total prize money
//=
//        10
//        ⋅
//        80
//        +
//        90
//        ⋅
//        1
//        =
//        890
//        =10⋅80+90⋅1=890.
//
//Test Case
//2
//        2: Top
//10
//        10 participants receive rupees
//400
//        400 and next
//90
//        90 participants receive rupees
//30
//        30 each. So, total prize money
//=
//        10
//        ⋅
//        400
//        +
//        90
//        ⋅
//        30
//        =
//        6700
//        =10⋅400+90⋅30=6700.

package CodeChef_500_1000;

import java.util.Scanner;

public class Total_Prize_Money {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int t = read.nextInt();

        while (t-- > 0){
            int x = read.nextInt();
            int y = read.nextInt();

            int prizeForTop_10 = 10 * x;
            int prizeForTop_100 = 90 * y;

            System.out.println(prizeForTop_10 + prizeForTop_100);
        }
    }
}
