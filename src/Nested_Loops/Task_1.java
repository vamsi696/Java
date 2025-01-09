package Nested_Loops;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n = read.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
