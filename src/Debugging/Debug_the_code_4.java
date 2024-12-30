//Write a program which does the following:
//
//Declare two integer variables length and width.
//Accept two user inputs from the console and store these values in length and width respectively.
//Create another integer variable area - compute the area of the rectangle and store it in area.
//Output area to the console.
//        Sample 1:
//Input
//        Output
//10
//        23
//Area of the rectangle is: 230

package Debugging;
import java.util.Scanner;

public class Debug_the_code_4 {
    public static void main (String[] args) throws java.lang.Exception
    {
        int length, width;
        int area;
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
        width = scanner.nextInt();

        area = length * width;
        System.out.println("Area of the rectangle is: "+ area);
    }
}
