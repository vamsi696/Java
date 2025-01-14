//Coding Problem - 3
//You are given the following as a user input:
//
//First line contains the integer
//        N
//N and
//X
//X.
//The second line contains
//N
//N space separated integers (List 1).
//The third line contains
//X
//X space separated integers (List 2).
//You need to merge the lists such that your output is a single list - List 1 + List 2 + List 1.
//Check the sample output below.

package Arrays;

import java.util.Scanner;

public class Coding_problem_3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int x = read.nextInt();

        int[] arr = new int[n + x + n];

        for (int i = 0; i < n; i++){
            arr[i] = read.nextInt();
        }
        for (int i = n; i < n + x; i++){
            arr[i] = read.nextInt();
        }
        for (int i = n + x; i < (n + x + n); i++){
            arr[i] = arr[i - n - x];
        }

        for (int i = 0; i < (2 * n)+ x; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
