//Task
//Write a program for the following:
//
//Declare an integer variable num.
//Read the value from the user.
//Print it's square.
//Sample 1:
//Input
//        Output
//4
//        16

package Taking_UserInput;

import java.util.Scanner;

public class Math_pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println((int)Math.pow(num, 2));
    }
}
