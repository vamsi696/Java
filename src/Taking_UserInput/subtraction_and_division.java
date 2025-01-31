//Subtraction and division of numbers
//While sum and addition of
//2
//        2 numbers did not require any specific precautions, we need to be careful during subtraction and division operations
//
//Subtraction can return a positive or negative value depending on which number is larger
//Division can return an integer or float
//        Task
//Write a program that does the following
//
//Accepts the number of inputs / test cases as 't'
//The only line of each test case contains 2 integers - declare them as variables
//A
//A and
//B
//        B
//For each test case, you need to perform the following operations
//Create a variable -
//D
//D - what you get after subtracting
//        B
//B from
//A
//A.
//Create a variable -
//Q
//Q - the quotient when
//        A
//A is divided by
//B
//        B
//Output 2 space separated integers -
//D
//D and
//Q
//Q in a single line
//Note: The inputs have been created such that
//
//        A
//A is necessarily greater than or equal to
//B
//        B
//A
//A is necessarily exactly divisible by
//B
//        B
//Sample 1:
//Input
//        Output
//2
//        10 5
//        16 4
//        5 2
//        12 4
//Explanation:
//Test case 1: The 2 integers are
//10
//        10 and
//5
//        5 and we output
//5
//        5 as their difference and
//2
//        2 as the quotient of their division
//
//Test case 2: The 2 integers are
//16
//        16 and
//4
//        4 - we output
//12
//        12 as their difference and
//4
//        4 as the quotient of their division

package Taking_UserInput;

import java.util.Scanner;

public class subtraction_and_division {
    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int t = read.nextInt();

		for(int i=0; i<t; i++) {
            int a = read.nextInt();
            int b = read.nextInt();

            // Difference of inputs
            int d = a - b;

            // Division of inputs.
            int q = a / b;

            // print the desired output for each test case
            System.out.println(d + " " + q);
        }
    }
}
