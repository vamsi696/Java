//Cubes and Squares
//Write a program which does the following:
//
//Declare an integer variable a.
//Accept a user input and store it in the variable a.
//        Declare 2 variables square and cube - compute and store the square and cube of a in them.
//Output square and cube to the console on separate lines.
//Note:
//Square of an integer N = N * N.
//Cube of an integer N = N * N * N.

package Taking_UserInput;

import java.util.Scanner;

public class Cubes_and_squares {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        System.out.println((int)Math.pow(num, 2));
        System.out.println((int)Math.pow(num, 3));
    }
}
