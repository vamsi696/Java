//Practice problem - Age Limit
//Best way to learn - practice and solve problems based on the concept!!!
//
//Task
//Chef wants to appear in a competitive exam. To take the exam, there are following requirements:
//
//Minimum age limit is
//X
//X (i.e. Age should be greater than or equal to
//        X
//        X).
//Age should be strictly less than
//Y
//Y.
//        Chef's current Age is
//A
//A. Find whether he is currently eligible to take the exam or not.
//
//Input Format
//First line will contain
//T
//T, number of test cases. Then the test cases follow.
//Each test case consists of a single line of input, containing three integers
//        X
//        ,
//        Y
//        ,
//        X,Y, and
//A
//A as mentioned in the statement.
//Output Format
//For each test case, output YES if Chef is eligible to give the exam, NO otherwise.
//Sample 1:
//Input
//        Output
//2
//        21 34 30
//        25 31 31
//YES
//        NO
//Explanation:
//Test case
//        1
//        1: The age of Chef is
//30
//        30. His age satisfies the minimum age limit as
//30
//        ≥
//        21
//        30≥21. Also, it is less than the upper limit as
//30
//<
//34
//        30<34. Thus, Chef is eligible to take the exam.
//
//        Test case
//        2
//        2: The age of Chef is
//31
//        31. His age satisfies the minimum age limit as
//31
//        ≥
//        25
//        31≥25. But, it is not less than the upper limit as
//31
//        ≮
//        31
//        31≮31. Thus, Chef is not eligible to take the exam.

package Conditional_Statements;

import java.util.Scanner;

public class ageLimit {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0) {
            int x = read.nextInt();
            int y = read.nextInt();
            int a = read.nextInt();

            if (a >= x && a < y){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
