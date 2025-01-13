package Arrays;

public class Deletion_of_Array {
    public static void main(String[] args) {

        int[] arr = new int[100];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        int size = 5;

        int positionToDelete = 2;

        for (int i = positionToDelete; i <=  size - 1; i++){
            arr[i] = arr[i + 1];
        }

        size--;

        for (int i = 0; i < size; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
