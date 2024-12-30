//Write a program which does the following:
//
//Make an auto-reply program that takes input from the user as an integer variable x.
//Compute and output the following to the console:
//Print "Order Confirmed" only if x < 70 .
//        else Print "Order Limit reached".
//In both cases, the program must print "Thank YOU!" on a separate line.
//Sample 1:
//Input
//        Output
//69
//Order Confirmed
//Thank YOU!
//Sample 2:
//Input
//        Output
//70
//Order Limit reached
//Thank YOU!

package Conditional_Statements;
import java.util.Scanner;

public class Order_Confirmation {
    public static void main (String[] args)
    {
        // Complete the code
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();

        if (x < 70){
            System.out.println("Order Confirmed");
        } else {
            System.out.println("Order Limit reached");
        }
        System.out.println("Thank YOU!");

    }
}
