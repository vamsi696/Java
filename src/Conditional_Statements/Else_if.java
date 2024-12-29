//Task
//Write a program which does the following
//
//Declare two integers variables b and r and initialize them with some values.
//        Print "Rob scored higher marks than Bob", if r is greater than b
//Print "Bob & Rob both scored the same", if both b and r are equal

package Conditional_Statements;

public class Else_if {
    public static void main (String[] args)
    {
        // Update the blank in the code given below
        int b = 23;
        int r = 45;
        if(r > b){
            System.out.println("Rob scored higher marks than Bob.");
        }
        else if(r == b){
            System.out.println("Bob & Rob both scored the same");
        }

        b = 15;
        r = 15;
        if(r > b){
            System.out.println("Rob scored higher marks than Bob.");
        }
        else if(r == b){
            System.out.println("Bob & Rob both scored the same");
        }

    }
}
