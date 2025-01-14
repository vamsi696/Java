//Coding problem - 2
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
//You need to delete all occurrences of
//        X
//X from the list and output the new list.
//Check the sample output for more details.

package Arrays;

import java.util.Scanner;

public class Coding_problem_2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n = read.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = read.nextInt();
        }

        int x = read.nextInt();

        int newSize = 0;

        for (int i = 0; i < n; i++){
            if (arr[i] != x){
                arr[newSize] = arr[i];
                newSize++;
            }
        }

        for (int i = 0; i < newSize; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
