//Task
//Run the code given in the IDE - it will cause a run-time error.
//Uncomment the if condition to make the code work - i.e. print infinity whenever b = 0.
//
//Sample 1:
//Input
//        Output
//5 3
//        1
//Sample 2:
//Input
//        Output
//3 0
//infinity

package Debugging;
import java.util.Scanner;

public class Runtime_error_task {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        if (b == 0) {
            System.out.println("infinity");   // uncomment the if condition
            return;
        }

        System.out.println(a / b);
    }
}
