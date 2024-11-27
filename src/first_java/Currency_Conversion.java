//Input currency in rupees and output in USD.

package first_java;

import java.util.Scanner;

public class Currency_Conversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float rupees = in.nextFloat();
        float dollar = in.nextFloat();

        float conversion = rupees/dollar;

        System.out.println("Thus we receive the USD of: " + conversion + " Out of " + rupees + " rupees");
    }
}
