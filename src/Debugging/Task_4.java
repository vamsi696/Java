//Chef is looking to buy a TV and has shortlisted two models.
//The first one costs A rupees, while the second one costs B rupees.
//Since there is a huge sale coming up on Chefzon, Chef can get a flat discount of C rupees on the first TV, and a flat discount of D rupees on the second one.
//Help Chef determine which of the two TVs would be cheaper to buy during the sale.
//
//Input Format
//The first and only line of each test case contains four space-separated integers A, B, C and D — the marked price (in rupees) of the first TV, the marked price (in rupees) of the second TV, the flat discount (in rupees) of the first TV, and the flat discount (in rupees) of the second TV.
//Output Format
//For each test case, print a single line containing the string First if the first TV is cheaper to buy with discount, or Second if the second TV is cheaper to buy with discount. If both of them cost the same after discount, print Any.
//
//Constraints
//1 ≤ A, B ≤ 100
//        0 ≤ C ≤ A
//0 ≤ D ≤ B
//Sample 1:
//Input
//        Output
//85 75 35 20
//First
//Sample 2:
//Input
//        Output
//100 99 0 0
//Second
//Sample 3:
//Input
//        Output
//30 40 0 10
//Any

package Debugging;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();

        float p = a - c;
        float q = (float) b - d; // Cast b to float to ensure correct division
        if (p < q) {
            System.out.println("First");
        } else if (p > q) {
            System.out.println("Second");
        } else {
            System.out.println("Any");
        }

        // Close the Scanner
        scanner.close();
    }
}
