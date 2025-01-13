package Arrays;

public class Insertion_Array {
    public static void main(String[] args) {

        int[] array = new int[100];

        array[0] = 2;
        array[1] = 1;
        array[2] = 5;
        array[3] = 6;
        array[4] = 7;
        int size = 5;

        int newPosistion = 2;
        int newElement = 8;

        for (int i = size - 1; i >= newPosistion; i--){
            array[i + 1] = array[i];
        }

        array[newPosistion] = newElement;
        size++;

        for (int i = 0; i < size; i++){
            System.out.println(array[i] + " ");
        }
    }
}
