//Chef needs to park her car while she watches a movie. The parking charges at the theater are as follows:
//
//Rs.
//        X
//X for the first 1 hour
//Rs.
//        Y
//Y for every extra hour after the first hour
//If Chef parks her car for
//H
//        H hours, what is the total parking charges that she should pay?

package CodeChef_500_1000;

import java.util.Scanner;

public class Parking_fee {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        int y = read.nextInt();
        int h = read.nextInt();

        int charges = x + y * (h - 1);

        System.out.println(charges);
    }
}
