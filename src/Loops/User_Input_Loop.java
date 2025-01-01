//User input Loop
//Let us change the problem a bit.
//
//        Task
//Write a program which does the following:
//
//Declare a variable num and store a user defined input from the console in it.
//Declare a variable a and initialize it to
//0
//        0.
//Use the syntax above to create a loop, output the following to the console:
//Print a in separate lines as long as it is less than num.
//Increment a by
//1
//        1 in each iteration.

package Loops;
import java.util.Scanner;

public class User_Input_Loop {
    public static void main (String[] args)
    {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int a = 0;
        // Update your code below this line
        while(a < num){
            System.out.println(a);
            a++;
        }
    }
}
