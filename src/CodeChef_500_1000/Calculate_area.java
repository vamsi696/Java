//Calculate area
//Write a program to compute and print the area of a rectangle. Take length and width as user inputs.
//
//        Sample 1:
//Input
//        Output
//5 8
//        40

package CodeChef_500_1000;

import java.util.Scanner;

public class Calculate_area {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int length = read.nextInt();
        int width = read.nextInt();

        int area = calculateArea(length, width);

        System.out.println(area);
    }

    public static int calculateArea(int length, int width){
        return length * width;
    }
}
