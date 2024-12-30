//Or Statement
//'||' can be used to insert the 'or' condition in a java code.
//
//        Task
//Write a program which does the following:
//
//Take input from the console for integer variables z, x and c.
//Do the above for 2 separate input tuples:
//z = 5, x = 3, c = 2.
//z = 3, x = 5, c = 8.
//Compute and output the following for each tuple z, x and c:
//        "PASS" if c is greater than either x or z.
//Otherwise print "FAIL" in every other case.
//Sample 1:
//Input
//        Output
//5 3 2
//        3 5 8
//FAIL
//        PASS

package Conditional_Statements;
import java.util.Scanner;

public class OR_Problem {
    public static void main (String[] args)
    {
        // Update the blanks in the code given below
        Scanner read = new Scanner(System.in);

        int z;
        int x;
        int c;
        z = read.nextInt();
        x = read.nextInt();
        c = read.nextInt();
        if (c > x || c > z) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }

        z = read.nextInt();
        x = read.nextInt();
        c = read.nextInt();
        if (c > x || c > z) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }
    }
}
