package Taking_UserInput;

import java.util.Scanner;

public class Area_of_circle {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int radius = read.nextInt();
        double area_of_circle = 3.14 * radius * radius;

        System.out.println(area_of_circle);
    }
}
