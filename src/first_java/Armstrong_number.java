//To find Armstrong Number between two given number.

package first_java;

import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter lower bound value is: ");
        int lowerbound = input.nextInt();
        System.out.print("Enter Higher bound value is: ");
        int higherbound = input.nextInt();

        System.out.println("The Armstrong numbers between " + lowerbound + " and " + higherbound + " are: ");

        for (int num = lowerbound; num<=higherbound; num++){
            if (isArmstrong(num)){
                System.out.println(num);
            }
        }
    }
    public static boolean isArmstrong(int number){
        int originNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();
        while (number > 0){
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }
        return  sum == originNumber;
    }
}
