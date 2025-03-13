//Search an element in an array
//You are given an array
//        A
//A of size
//        N
//N and an element
//X
//X. Your task is to find whether the array
//A
//A contains the element
//X
//X or not.
//
//        Input Format
//The first line contains two space-separated integers
//N
//N and
//X
//X — the size of array and the element to be searched.
//The second line contains all the elements of array
//        A
//A
//Output Format
//Output "YES" if the element
//X
//X is present in
//A
//A, otherwise output "NO".
//
//Constraints
//1
//        ≤
//N
//≤
//        1
//        0
//        5
//        1≤N≤10
//        5
//
//        1
//        ≤
//A
//        i
//≤
//        1
//        0
//        5
//        1≤A
//        i
//​
//        ≤10
//        5
//
//Sample 1:
//Input
//        Output
//5 3
//        7 3 5 2 1
//YES
//Sample 2:
//Input
//        Output
//5 10
//        7 3 5 2 1
//NO

package Arrays;

import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int n = read.nextInt();
            int x = read.nextInt();
            boolean found = false;

            if (n < 1){
                System.out.println("Invalid Input");
                return;
            }

            int[] arr = new int[n];

            for (int i = 0; i < n; i++){
                arr[i] = read.nextInt();
                if (arr[i] == x){
                    found = true;
                }
            }

            if (found){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        read.close();
    }
}
