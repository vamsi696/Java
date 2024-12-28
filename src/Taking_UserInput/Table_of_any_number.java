//Table of Any Number
//Write a program to print the multiplication table of any number given by a user upto 10.

package Taking_UserInput;
import java.util.Scanner;

public class Table_of_any_number {
    public static void main (String[] args)
    {
        // Update the blank in the code given below
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();

        System.out.println(num + " x 1 = " + (num * 1));
        System.out.println(num + " x 2 = " + (num * 2));
        System.out.println(num + " x 3 = " + (num * 3));
        System.out.println(num + " x 4 = " + (num * 4));
        System.out.println(num + " x 5 = " + (num * 5));
        System.out.println(num + " x 6 = " + (num * 6));
        System.out.println(num + " x 7 = " + (num * 7));
        System.out.println(num + " x 8 = " + (num * 8));
        System.out.println(num + " x 9 = " + (num * 9));
        System.out.println(num + " x 10 = " + (num * 10));

    }
}
