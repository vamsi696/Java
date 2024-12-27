//Write a program to calculate the area of a circle using the formula:
//Area = pi x 2r
//pi = 22 / 7
//Output the area as a float.

package operator_precedence;

public class Area_of_circle {
    public static void main(String[] args) {
        int r = 3;
        int rSquared = r * r; // Calculate the square of the radius
        // Complete the code
        float area = (float) 22/7 * rSquared;
        System.out.println(area);
    }
}
