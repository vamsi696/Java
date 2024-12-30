//Chef has a bucket having a capacity of K liters.
//It is already filled with X liters of water.
//Find the maximum amount of extra water in liters that Chef can fill in the bucket without overflowing.
//
//Input Format
//The first and only line of each test case contains two space separated integers K and X - as mentioned in the problem.
//        Output Format
//For each test case, output in a single line, the amount of extra water in liters that Chef can fill in the bucket without overflowing.
//
//Constraints
//1 ≤ X < K ≤ 1000
//Sample 1:
//Input
//        Output
//5 4
//        1
//Explanation:
//The capacity of the bucket is 5 liters but it is already filled with 4 liters of water. Adding 1 more liter of water to the bucket fills it to (4+1)=5 liters. If we try to fill more water, it will overflow.
//
//Sample 2:
//Input
//        Output
//15 6
//        9
//Explanation:
//The capacity of the bucket is 15 liters but it is already filled with 6 liters of water. Adding 9 more liters of water to the bucket fills it to (6+9)=15 liters. If we try to fill more water, it will overflow.

package Debugging;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, k;
        k = scanner.nextInt();
        x = scanner.nextInt();

        int bucket_capacity = k - x;

        System.out.println(bucket_capacity);
        scanner.close();
    }
}
