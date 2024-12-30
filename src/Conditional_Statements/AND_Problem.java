//Task
//Write a program which does the following:
//
//Declare a variable a and initialize it to the values
//15
//        15.
//Compute if a is completely divisible by both 7 and 5.
//Depending on the result above - output the following to the console:
//The number is divisible by both 5 & 7
//The number is not divisible by both 5 & 7
//Re-assign a with number 35, and check for above again.

package Conditional_Statements;

public class AND_Problem {
    public static void main (String[] args)
    {
        // Update the blank in the code given below
        int a = 15;

        if (a % 7 == 0 && a % 5 == 0) {
            System.out.println("The number is divisible by both 5 & 7");
        }
        else {
            System.out.println("The number is not divisible by both 5 & 7");
        }

        a = 35;

        if (a % 7 == 0 && a % 5 == 0) {
            System.out.println("The number is divisible by both 5 & 7");
        }
        else {
            System.out.println("The number is not divisible by both 5 & 7");
        }
    }
}
