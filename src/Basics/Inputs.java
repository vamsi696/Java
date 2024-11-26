package Basics;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter some Input: ");
//        int roll_Num = input.nextInt();
//        System.out.println("My Roll Number is: " + roll_Num);

//        String name = input.next(); // next - is picks up the first word and prints it
//        System.out.println("My Name is: " + name);

        String fullName = input.nextLine(); // nextLine - prints complete sentence
        System.out.println("My Full Name is: "+ fullName);

        float marks = input.nextFloat(); // float - it doesn't work properly cause it round of the values
        System.out.println("Total Marks is: " + marks);


    }
}
