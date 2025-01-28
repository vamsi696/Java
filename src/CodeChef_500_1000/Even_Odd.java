//Even odd
//Write a program that first accepts the number of test cases t. For each test case, read an integer num. Check if num is even using the isEven function. If num is even, output "Even"; otherwise, output "Odd".
//
//Sample 1:
//Input
//        Output
//3
//        2
//        6
//        5
//Even
//        Even
//Odd
package CodeChef_500_1000;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int num = read.nextInt();
            System.out.println(isEven(num) ? "Even" : "Odd");
        }
    }

    public static boolean isEven(int num){
        return num % 2 == 0;
    }
}
