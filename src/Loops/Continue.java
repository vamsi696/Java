//Task
//        Write a program that does the following
//
//        Declare a variable n and set it to a user defined input
//        Output to the console a series of numbers from
//        0
//        0 to
//        12
//        12 with the following condition
//        Skips the number inserted by the user.
//        Sample 1:
//        Input
//        Output
//        5
//        0
//        1
//        2
//        3
//        4
//        6
//        7
//        8
//        9
//        10
//        11
//        12

package Loops;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n = read.nextInt();
        for (int i = 0; i < 10; i++){
            if (i == n){
                continue;
            }
            System.out.println(i);
        }
    }
}
