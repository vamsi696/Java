//Division with integer and decimal output
//Lets focus a bit more on division to clarify the concept
//
//Division can return an integer value or decimal value, it all depends on which datatype you declare the variables as.
//To get an integer output you need to declare the variables as int:
//
//int a = 3;
//int b = 2;
//int c = a/b;
//System.out.println(c);
//
//// Output: 1
//To get a decimal output you need to declare the variables as double:
//
//double a = 3;
//double b = 2;
//double c = a/b;
//System.out.println(c);
//
//// Output: 1.5
//Task
//In this problem you need to write a program which does the following
//
//Accepts the number of inputs / test cases as 't'
//Each line of test case contains 2 integers - declare them as variables
//A
//A and
//B
//        B
//For each test case, you need to perform the following operations
//Create a variable -
//X
//X - the division of
//        A
//A and
//B
//B which returns a decimal value
//Output the integer
//        X
//X
//Sample 1:
//Input
//        Output
//2
//        10 5
//        10 6
//        2.0
//        1.6666666666666667
//Explanation:
//Test case 1: The 2 integers are
//10
//        10 and
//5
//        5 and we output
//2.0
//        2.0 as the value of
//X
//        X
//
//Test case 2: The 2 integers are
//10
//        10 and
//6
//        6 and we output
//1.6666666666666667
//        1.6666666666666667 as the value of
//X
//        X

package Taking_UserInput;

import java.util.Scanner;

public class Division {
    public static void main (String[] args)
    {
        Scanner read = new Scanner(System.in);

        int t = read.nextInt();
        for(int i=0; i<t; i++)
        {
            double a = read.nextDouble();
            double b = read.nextDouble();

            // Division of A by B decimal result
            double x = a/b;
            System.out.println(x);
        }
    }
}
