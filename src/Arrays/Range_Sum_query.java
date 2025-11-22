//Range Sum Query (Static Array)
//Problem: Given an array and multiple queries, where each query has indices L and R, find the sum of elements between L and R (inclusive).
//Example: Input: arr = [1,2,3,4,5], Queries = [(1,3), (0,4)] Output: 9, 15
//Hint: Use prefix array: sum(L, R) = prefix[R] - prefix[L-1]

package Arrays;

import java.util.Scanner;

public class Range_Sum_query {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < arr.length; i++){
                arr[i] = sc.nextInt();
            }

            for (int i = 1 ; i < arr.length; i++){
                arr[i] = arr[i] + arr[i - 1];
            }

            int l = sc.nextInt();
            int r = sc.nextInt();

            int sum;

            if (l == 0){
                sum = arr[r];
            } else {
                sum = arr[r] - arr[l - 1];
            }

            System.out.print(sum + " ");
        }
    }
}
