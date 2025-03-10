package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int size = read.nextInt();

            int[] arrayList = new int[size];
            for (int i = 0; i < size; i++){
                arrayList[i] = read.nextInt();
            }
            sortArray(arrayList);
            System.out.println(arrayList[size - 2]);
        }
    }
    private static void sortArray(int[] array){
        Arrays.sort(array);
    }
}
