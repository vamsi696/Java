//Increase or Decrease
//Write a program that takes three numbers as input and prints "Increasing" if the numbers are in strictly increasing order, "Decreasing" if they are in strictly decreasing order, and "Neither" otherwise.
//
//        Sample 1:
//Input
//        Output
//20 30 41
//Increasing

package Taking_UserInput;

import java.util.Scanner;

public class Increase_Or_Decrease {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        int y = read.nextInt();
        int z = read.nextInt();

        if (x < y && y < z){
            System.out.println("Increasing");
        } else if (x > y && y > z){
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither");
        }
    }
}
