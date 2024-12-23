package variables;

import java.util.Scanner;

public class Area_Of_Rectange {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int length = sr.nextInt();
        int width = sr.nextInt();
        int area = length * width;
        System.out.println("The Area of the given rectangle is: " + area +"m");
    }
}
