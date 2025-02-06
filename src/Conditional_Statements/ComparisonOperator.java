//Comparison operators
//Usual Comparison operators used within conditional statements are
//
//Equals: a == b
//Not Equals: a != b
//Less than: a < b
//Less than or equal to: a <= b
//Greater than: a > b
//Greater than or equal to: a >= b
//        Task
//Write a program which does the following
//
//Accepts the count of test cases -
//t
//        t
//Each test case has one integer
//        N
//N
//Output the following for each test case on separate lines
//If input is exactly divisible by
//3
//        3, output 'Divisible by 3'. Else output 'Not divisible by 3'.
//If the input is odd, output 'Odd'. Else output 'Even'.
//Sample 1:
//Input
//        Output
//4
//        3
//        4
//        5
//        6
//Divisible by 3
//Odd
//Not divisible by 3
//Even
//Not divisible by 3
//Odd
//Divisible by 3
//Even
//Explanation:
//Test case 1:
//        3
//        3 is divisible by 3 and is odd as well
//Test case 2:
//        4
//        4 is not divisible by 3. However,
//        4
//        4 is even.

package Conditional_Statements;

import java.util.Scanner;

public class ComparisonOperator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int x = read.nextInt();

            if (x%3 == 0){
                System.out.println("Divisible by 3");
            } else {
                System.out.println("Not Divisible by 3");
            }

            if (x%2 != 0){
                System.out.println("Odd");
            } else {
                System.out.println("Even");
            }
        }
    }
}
