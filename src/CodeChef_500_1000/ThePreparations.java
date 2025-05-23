//The Preparations
//Chef has an exam which will start exactly
//M
//M minutes from now. However, instead of preparing for his exam, Chef started watching Season-
//        1
//        1 of Superchef. Season-
//        1
//        1 has
//        N
//        N episodes, and the duration of each episode is
//K
//K minutes.
//
//Will Chef be able to finish watching Season-
//        1
//        1 strictly before the exam starts?
//
//Note:
//Note: Please read the explanations of the sample test cases carefully.
//
//Input Format
//The first line contains an integer
//T
//T denoting the number of test cases.
//        T
//T test cases then follow.
//The first and only line of each test case contains
//3
//        3 space separated integers
//        M
//M,
//N
//N and
//K
//K.
//        Output Format
//For each test case, output on one line YES if it is possible to finish Season-1 strictly before the exam starts, or NO if it is not possible to do so.
//
//Output is case insensitive, which means that "yes", "Yes", "YEs", "no", "nO" - all such strings will be acceptable.
//
//Constraints
//1
//        ≤
//T
//≤
//        1
//        0
//        4
//        1≤T≤10
//        4
//
//        1
//        ≤
//M
//≤
//        1
//        0
//        9
//        1≤M≤10
//        9
//
//        1
//        ≤
//N
//,
//K
//≤
//        1
//        0
//        4
//        1≤N,K≤10
//        4
//
//Sample 1:
//Input
//        Output
//3
//        10 1 10
//        25 2 10
//        15 2 10
//NO
//        YES
//NO
//Explanation:
//Test Case
//1
//        1: The duration of the only episode is
//10
//        10 minutes, and the exam starts exactly after
//10
//        10 minutes. So, Chef will not be able to finish watching Season-
//        1
//        1 strictly before the exam starts.
//
//        Test Case
//2
//        2: There are two episodes in Season-
//        1
//        1, each of duration
//10
//        10 minutes. Therefore, Chef will require
//10
//        +
//        10
//        =
//        20
//        10+10=20 minutes to finish watching Season-
//        1
//        1. As the exam starts after
//25
//        25 minutes, Chef will be able to finish watching Season-
//        1
//        1 strictly before the exam starts.
//
//        Test Case
//3
//        3: There are two episodes in Season-
//        1
//        1, each of duration
//10
//        10 minutes. Therefore, Chef will require
//10
//        +
//        10
//        =
//        20
//        10+10=20 minutes to finish watchin Season-
//        1
//        1. As the exam starts after
//15
//        15 minutes, Chef will not be able to finish watching Season-
//        1
//        1 strictly before the exam starts.


package CodeChef_500_1000;

import java.util.Scanner;

public class ThePreparations {
public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t>0){
            int m = read.nextInt();
            int n = read.nextInt();
            int k = read.nextInt();

            int episodeDuration = n * k;

            int finishWatching = m - episodeDuration;

            if (finishWatching >= 1){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            t--;
        }
    }
}
