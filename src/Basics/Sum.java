package Basics;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int total = firstNumber + secondNumber;


        System.out.println("Total sum is: " + total);
    }
}
