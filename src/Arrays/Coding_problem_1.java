//Coding problem - 1
//You are given the following as a user input:
//
//First line contains the integer
//        N
//N.
//The second line contains
//N
//N space separated integers.
//The third line contains an integer
//X
//X.
//You need to insert
//X
//X as the 1st and last element and output the list.
//Your list will now have
//        N
//+
//        2
//N+2 elements.
//Check the sample output for more details.
//
//Sample 1:
//Input
//        Output
//5
//        1 3 5 7 9
//        4
//        4 1 3 5 7 9 4

package Arrays;

import java.util.Scanner;

public class Coding_problem_1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n = read.nextInt();
        int[] arr = new int[n + 2];

        for (int i = 1; i <= n; i++){
            arr[i] = read.nextInt();
        }
        int x = read.nextInt();
        arr[0] = x;
        arr[n + 1] = x;

        for (int i = 0; i < n + 2; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
