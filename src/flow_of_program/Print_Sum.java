//Take two numbers and print the sum of both.
// Start -> take two variable -> create one more new variable as sum and assign two variable sum
// Print sum
package flow_of_program;

import java.util.Scanner;

public class Print_Sum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println(sum);
    }
}
