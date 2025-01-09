package Nested_Loops;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n = read.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--){
            for (int j = n - i; j >= 1; j--){
                System.out.print(" ");
            }
            for (int j = 2 * i - 1; j >= 1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
