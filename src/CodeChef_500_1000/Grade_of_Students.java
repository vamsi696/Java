//Grades of Student
//Write a program to print the grades of 3 students based on the marks they have obtained provided as input. The student is graded A if marks are greater than 90, B if marks are greater than 70, C if greater than or equal to 40, else F.
//
//[Note: You need to take inputs for all 3 students.]
//
//Sample 1:
//Input
//        Output
//95
//        40
//        20
//A
//        C
//F
package CodeChef_500_1000;

import java.util.Scanner;

public class Grade_of_Students {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            int marks = read.nextInt();

            if (marks > 90){
                System.out.println("A");
            } else if (marks > 70){
                System.out.println("B");
            } else if (marks >= 40){
                System.out.println("C");
            } else {
                System.out.println("F");
            }
        }
    }
}
