//Alice and Marks
//Alice has scored
//        X
//X marks in her test and Bob has scored
//        Y
//Y marks in the same test.
//Alice is happy if she scored at least twice the marks of Bob’s score.
//Determine whether she is happy or not.
//
//        Note - this problem does not have multiple test cases. t is not a part of the input
//
//Input Format
//The first and only line of input contains two space-separated integers
//X
//,
//Y
//X,Y — the marks of Alice and Bob respectively.
//        Output Format
//For each testcase, print 'Yes' if Alice is happy and 'No' if she is not, according to the problem statement.
//
//        Sample 1:
//Input
//        Output
//2 1
//Yes
//Explanation:
//Alice has scored
//        X
//        =
//        2
//X=2 marks whereas Bob has scored
//        Y
//        =
//        1
//Y=1 mark. As Alice has scored twice as much as Bob (i.e.
//                                                            X
//≥
//                                                            2
//                                                            Y
//                                                            X≥2Y), the answer is Yes.
//
//Sample 2:
//Input
//        Output
//1 2
//No
//Explanation:
//Alice has scored
//        X
//        =
//        1
//X=1 mark whereas Bob has scored
//        Y
//        =
//        2
//Y=2 marks. As Alice has not scored twice as much as Bob (i.e.X<2Y X<2Y), the answer is No.

package CodeChef_500_1000;

import java.util.Scanner;

public class AliceMarks {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        int y = read.nextInt();

        if (x >= 2 * y){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
