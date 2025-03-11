package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int size = read.nextInt();
            int [] arrayList = new int[size];

            if (size < 1){
                System.out.println("No valid Input");
                continue;
            }

            for (int i = 0; i < size; i++){
                arrayList[i] = read.nextInt();
            }
            sortArray(arrayList);
            System.out.println(arrayList[size - 1]);
        }
    }

    private static void sortArray(int[]array){
        Arrays.sort(array);
    }
}
