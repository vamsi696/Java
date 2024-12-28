//Find the Area of any rectangle
//Let us revisit our favourite rectangle and its area problem.
//
//Write a program which does the following:
//
//Declare 2 integer variables length and width.
//        In this problem - accept 2 user defined inputs from the console and initialise these values length and width.
//Create another integer variable area - compute the area of the rectangle and store it as area.
//Output area to the console.

package Taking_UserInput;

import java.util.Scanner;


public class Find_area_of_rectangle {
    public static void main (String[] args)
    {
        // Update the blank in code below
        Scanner read = new Scanner(System.in);
        int length = read.nextInt();
        int width = read.nextInt();

        int area = length * width;

        System.out.println("Area of the rectangle is: " + area);
    }

}
