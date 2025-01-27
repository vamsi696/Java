//Calculate power
//Write a function named calculatePower that takes two integer, base and exponent respectively, and returns the result of raising base to the power of exponent
//
//Sample 1:
//Input
//        Output
//2 3
//        8

package CodeChef_500_1000;

import java.util.Scanner;

public class Calculate_Power {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int base = read.nextInt();
        int exponent = read.nextInt();

        int result = calculatePower(base, exponent);
        System.out.println(result);
    }
    public static int calculatePower(int base, int exponent){
        return ((int)Math.pow(base, exponent));
    }
}
