package Nested_Loops;

import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n = read.nextInt();

        for (int i = n; i >= 1; i--){
            for (int j = n - i; j >= 1; j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}