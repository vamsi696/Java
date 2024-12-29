//Write a program which does the following:
//
//Take input from the console for integer variables a, b and c.
//Do the above for 2 separate input tuples.
//        a = 25, b = 21, c = 52
//a = 34, b = 23, c = 34
//Compute and output the following for each tuple a, b and c:
//        "Bravo!" if a is greater than or equal to both b and c.
//Otherwise print "Try again" in every other case.


package Conditional_Statements;
import  java.util.Scanner;

public class Task_1 {
    public static void main (String[] args)
    {
        // Update the blank in the code given below
        Scanner read = new Scanner(System.in);

        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();
        if (a >= b && a >= c) {
            System.out.println("Bravo!");
        } else {
            System.out.println("Try Again");
        }

        a = read.nextInt();
        b = read.nextInt();
        c = read.nextInt();
        if (a >= b && a >= c) {
            System.out.println("Bravo!");
        } else {
            System.out.println("Try Again");
        }
    }
}
