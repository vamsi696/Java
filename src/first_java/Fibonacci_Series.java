//To calculate Fibonacci Series up to n numbers.

package first_java;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int num1 = sr.nextInt();
        int num2 = sr.nextInt();
        System.out.print(num1+" "+num2);

        int t = sr.nextInt();
        int i = 1;
        while (i <= t){
            int num3 = num1 + num2;
            System.out.print(" "+num3);
            num1 = num2;
            num2 = num3;
            t--;
        }

    }
}
