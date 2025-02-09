//(High Accuracy)- Solve the complete problem
//There are
//100
//        100 questions in a paper.
//
//Each question carries +3 marks for correct answer,
//-1 marks for incorrect answer i.e. one mark is deducted for each incorrect answer,
//        0 marks for an unattempted question.
//It is given that Chef received exactly
//        X
//X
//        (
//0
//        ≤
//X
//≤
//        100
//        )
//(0≤X≤100) marks.
//Determine the minimum number of problems Chef marked incorrect.
//
//        Input Format
//First line will contain
//T
//T, number of test cases. Then the test cases follow.
//Each testcase contains of a single integer
//        X
//X, marks that Chef received.
//Output Format
//For each test case, output the minimum number of problems Chef marked incorrect.
//
//        Sample 1:
//Input
//        Output
//4
//        0
//        100
//        32
//        18
//        0
//        2
//        1
//        0
//Explanation:
//Test Case
//1
//        1: It might be possible that Chef didn't attempt any question in which case he didn't get any question incorrect.
//
//        Test Case
//2
//        2: For the case when Chef got
//34
//        34 questions correct and
//2
//        2 questions incorrect, Chef marked minimum incorrect questions.
//
//Test Case
//3
//        3: For the case when Chef got
//11
//        11 questions correct and
//1
//        1 question incorrect, Chef marked minimum incorrect questions.
//
//Test Case
//4
//        4: For the case when Chef got
//6
//        6 questions correct and no question incorrect, Chef marked minimum incorrect questions.

package CodeChef_500_1000;

import java.util.Scanner;

public class HighAccuracy {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int x = read.nextInt();

            if (x%3==0){
                System.out.println("0");
            } else if ((x+1)%3 == 0){
                System.out.println("1");
            } else {
                System.out.println("2");
            }
        }
    }
}
