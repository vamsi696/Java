//Mile to Kilometer Convertor
//Write a program which does the following:
//
//Create a Convertor that converts miles into kilometers.(1 Mile = 1.60 KM).
//Declare an integer variable mile.
//Accept user input and store it in mile.
//Declare a double variable km.
//Compute and output distance in kilometers console.

package Taking_UserInput;

import java.util.Scanner;

public class Mile_to_kilometer_converter {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int mile = read.nextInt();
        double km = 1.60 * mile;
        System.out.println(km);
    }
}
