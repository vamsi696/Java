//If Statement
//The else statement is optional.
//
//Here is an example
//
//grade = 95;
//        if (grade >= 90) {
//        System.out.println("You got an A");
//}
//
//// Output
//// You got an A
//In the above program, if the condition is True, then the System.out.println() statement is executed.

package Conditional_Statements;
import java.util.Scanner;

public class if_condition {
    public static void main (String[] args)
    {
        // 	Your code goes here
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();

        if (a >= b){
            System.out.println("Coding is Fun!");
        }
    }
}
