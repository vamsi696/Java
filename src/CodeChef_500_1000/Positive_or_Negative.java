//Positive and Negative
//Write a program to check whether the three given numbers as input are Positive, Negative, or Zero.
//
//        Sample 1:
//Input
//        Output
//20
//        0
//        -95
//Positive
//        Zero
//Negative

package CodeChef_500_1000;

import java.util.Scanner;

public class Positive_or_Negative {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();

        if (n > 0){
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else{
            System.out.println("Zero");
        }

        n = read.nextInt();
        if (n > 0){
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else{
            System.out.println("Zero");
        }

        n = read.nextInt();
        if (n > 0){
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else{
            System.out.println("Zero");
        }
    }
}
