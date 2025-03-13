package Arrays;

import java.util.Scanner;

public class FindUniqueElement {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- > 0){
            int size = read.nextInt();

            if (size <= 0){
                System.out.println("Invalid Input");
                continue;
            }
            int[] arr = new int[size];

            for (int i = 0; i < size; i++){
                arr[i] = read.nextInt();
            }
            uniqueElement(arr);
        }
        read.close();
    }
    private static void uniqueElement(int[]arr){
        int unique = 0;

        for (int num:arr) unique ^= num;
        System.out.println(unique);
    }
}
