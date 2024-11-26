//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

package first_java;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int principle = in.nextInt();
        double rate = in.nextDouble();
        int time = in.nextInt();

        double simple_Interest = (principle * rate * time)/100;
        System.out.println(simple_Interest);
    }
}
