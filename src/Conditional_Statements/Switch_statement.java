//Task
//Write a program which does the following:
//
//Take input from the user with value between 1 and 7.
//Compute and output to the console the day associated with that number.
//Sample 1:
//Input
//        Output
//4
//Thursday
//Did you like the problem?
//        8 users found this helpful

package Conditional_Statements;
import java.util.Scanner;

public class Switch_statement {
    public static void main (String[] args)
    {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        switch(a) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
