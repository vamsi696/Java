//Pass the Exam
//The code in the IDE is incorrect - debug the code to solve this problem!
//
//Chef appeared for an exam consisting of
//3
//        3 sections. Each section is worth
//100
//        100 marks.
//        Chef scored
//A
//A marks in Section
//1
//        1,
//B
//B marks in section
//2
//        2, and
//        C
//C marks in section
//3
//        3.
//Chef passes the exam if both of the following conditions satisfy:
//
//Total score of Chef is
//≥
//        100
//        ≥100;
//Score of each section
//≥
//        10
//        ≥10.
//Determine whether Chef passes the exam or not.
//
//Input Format
//The first line of input will contain a single integer
//T
//T, denoting the number of test cases.
//Each test case consists of a single line containing
//3
//        3 space-separated numbers
//A
//,
//B
//,
//C
//A,B,C - Chef's score in each of the sections.
//Output Format
//For each test case, output 'PASS' if Chef passes the exam, 'FAIL' otherwise.
//
//        Sample 1:
//Input
//        Output
//2
//        9 100 100
//        30 40 50
//FAIL
//        PASS
//Explanation:
//Test Case
//1
//        1: Although Chef's total score is
//        209
//        ≥
//        100
//        209≥100, still Chef fails the exam since his score in section
//1
//        1 is
//        <
//10
//<10.
//
//Test Case
//2
//        2: Chef cleared each section's cutoff as well his total score
//        =
//        120
//        ≥
//        100
//        =120≥100.

package CodeChef_500_1000;

import java.util.Scanner;

public class PassTheExam {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        for (int i = 0 ; i < t; i++){
            int a = read.nextInt();
            int b = read.nextInt();
            int c = read.nextInt();

            int totalScore = a+b+c;
            int minimumScore = Math.min(a, Math.min(b, c));

            if (totalScore >= 100 && minimumScore >= 10){
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        }
    }
}
