//
//Absolute function
//Chef and Chefina both love chocolates.
//Chef's parents gave chef
//A
//A chocolates out of a total of
//        N
//N chocolates.
//The remaining chocolates were given to Chefina.
//What was the difference between the count of chocolates received by Chef and Chefina?
//
//Input Format
//The first line of input will contain a single integer
//T
//T, denoting the number of test cases.
//Each test case contains 2 space separated integers -
//N
//N and
//A
//        A
//Output Format
//For each test case, output on a new line the the difference between the count of chocolates received by Chef and Chefina.
//
//Sample 1:
//Input
//        Output
//2
//        100 90
//        40 10
//        80
//        20
//Explanation:
//Test case 1: Chef received 90 Chocolates. Chefina will get 10 chocolates.
//Hence the difference of the chocolates received is 80.
//
//Test case 2: Chef received 10 Chocolates. Chefina will get 30 chocolates.
//Hence the difference of the chocolates received is 20.

package CodeChef_500_1000;

import java.util.Scanner;

public class Chocolate_Problem {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        for (int i = 0 ; i < t; i++){
            int n = read.nextInt();
            int a = read.nextInt();

            int chefChocolates = a;
            int chefinaChocolates = n - chefChocolates;

            int diff = Math.abs(chefinaChocolates - chefChocolates);

            System.out.println(diff);
        }
    }
}
