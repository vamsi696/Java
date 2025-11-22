//Compute Prefix Sum Array
//Problem: Given an array of integers, construct its prefix sum array. E
//xample: Input: [2, 4, 6, 8, 10] Output: [2, 6, 12, 20, 30]
//Hint: prefix[i] = prefix[i-1] + arr[i]

package Arrays;

import java.util.Scanner;

public class Prefix_Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < arr.length; i++){
                arr[i] = sc.nextInt(); // where we are going to enter a new value to read input
            }

            for (int i = 1; i < arr.length; i++){
                arr[i] = arr[i] + arr[i - 1]; // Performing prefix sum
            }

            for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }

            System.out.println();
        }
    }
}
