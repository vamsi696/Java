//Area OR Perimeter
//Write a program to obtain length
//        (
//                L
//                )
//(L) and breadth
//        (
//                B
//                )
//(B) of a rectangle and check whether its area is greater or perimeter is greater or both are equal.
//
//Input Format
//First line will contain the length
//        (
//                L
//                )
//(L) of the rectangle.
//Second line will contain the breadth
//        (
//                B
//                )
//(B) of the rectangle.
//        Output Format
//Output 2 lines.
//
//In the first line print "Area" if area is greater otherwise print "Peri" and if they are equal print "Eq".(Without quotes).
//
//In the second line print the calculated area or perimeter (whichever is greater or anyone if it is equal).
//
//Constraints
//1
//        ≤
//L
//≤
//        1000
//        1≤L≤1000
//        1
//        ≤
//B
//≤
//        1000
//        1≤B≤1000
//Sample 1:
//Input
//        Output
//1
//        2
//Peri
//6
//Explanation:
//Area = 1 * 2 = 2
//Peri = 2 * (1 + 2) = 6
//Since Perimeter is greater than Area, hence the output is :
//Peri
//6

package CodeChef_500_1000;

import java.util.Scanner;

public class AreaOrPerimeter {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int l = read.nextInt();
        int b = read.nextInt();

        int totalArea = l * b;
        int totalPerimeter = 2 * (l * b);

        if (totalArea == totalPerimeter){
            System.out.println("EQ");
            System.out.println(totalArea);
        } else if (totalArea < totalPerimeter){
            System.out.println("Peri");
            System.out.println(totalPerimeter);
        } else {
            System.out.println("Area");
            System.out.println(totalArea);
        }
    }
}
