//Hello user
//Write a program which does the following:
//
//Declare a string variable x.
//Accept a text user input - the name of the user - and store it in the variable x.
//Output and print to the console "Hello" before the user defined name.
//Remember to add a space between "Hello" and x.

package Taking_UserInput;
import java.util.Scanner;

public class Hello_User {
    public static void main (String[] args)
    {
        // Update the blank in the code below
        Scanner read = new Scanner(System.in);
        String x = read.nextLine();
        System.out.println("Hello " + x);
    }
}
