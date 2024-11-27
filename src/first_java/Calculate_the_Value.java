//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

package first_java;

import java.util.Scanner;

public class Calculate_the_Value {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int num1 = sr.nextInt();
        int num2 = sr.nextInt();
        int result = num1 * num2;

        if (result == 6){
            System.out.println("Addition");
        } else if (result == 2){
            System.out.println("Subtraction");
        } else if (result == 8){
            System.out.println("Multiplication");
        } else {
            System.out.println("Division");
        }
    }
}
