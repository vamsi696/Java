//Table of any number
//Write a program which does the following:
//
//Create a variable n and store the user defined input from console in n.
//Output to the console the multiplication table for n up to 10:
//In the previous module we manually entered each row of the table.
//In this problem - use loops to generate the table.
//Sample 1:
//Input
//        Output
//5
//        5 x 1 = 5
//        5 x 2 = 10
//        5 x 3 = 15
//        5 x 4 = 20
//        5 x 5 = 25
//        5 x 6 = 30
//        5 x 7 = 35
//        5 x 8 = 40
//        5 x 9 = 45
//        5 x 10 = 50

package Loops;

import java.util.Scanner;

public class Table_of_any_number {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }

}
