//Task
//Given a program to check a number is greater than 5 or not:
//
//Run the code it will give wrong answer.
//find the wrong condition and correct it.
//        Sample 1:
//Input
//        Output
//5
//the number is smaller than or equal to 5
//Sample 2:
//Input
//        Output
//6
//the number is greater than 5

package Debugging;
import java.util.Scanner;

public class Incorrect_conditons_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 5) {             // correct the incorrect if codition
            System.out.println("the number is smaller than or equal to 5");
        } else {
            System.out.println("the number is greater than 5");
        }

        scanner.close();
    }
}
