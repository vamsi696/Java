//There are N bikes and M cars on the road.
//
//Each bike has 2 tyres.
//Each car has 4 tyres. Find the total number of tyres on the road.
//        Input Format
//The first and only line of each test case contains two integers N,M.
//Output Format
//For each test case, output in a single line, the total number of tyres on the road.
//Constraints
//0 ≤ N , M ≤ 100.
//Sample 1:
//Input
//        Output
//2 1
//        8
//Sample 2:
//Input
//        Output
//3 0
//        6

package Debugging;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N, M;

        N = scanner.nextInt();
        M = scanner.nextInt();

        int result = (N * 2) + (M * 4);
        System.out.println(result);

        scanner.close();
    }
}
