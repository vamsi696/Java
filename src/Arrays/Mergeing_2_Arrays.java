//Task
//You are given a template code in the IDE.
//Update the code to merge the 2 arrays based on the process defined above.

package Arrays;

public class Mergeing_2_Arrays {
    public static void main(String[] args) {

        int[] firstArray = new int[100];
        firstArray[0] = 1;
        firstArray[1] = 3;
        firstArray[2] = 5;
        int size1 = 3;

        int[] secondArray = new int[100];
        secondArray[0] = 2;
        secondArray[1] = 4;
        secondArray[2] = 6;
        secondArray[3] = 8;
        int size2 = 4;

        int[] thirdArray = new int[size1 + size2];

        for (int i = 0; i < size1; i++){
            thirdArray[i] = firstArray[i];
        }
        for (int j = 0; j < size2; j++){
            thirdArray[j + size1] = secondArray[j];
        }

        for (int i = 0; i < size1 + size2; i++){
            System.out.print(thirdArray[i]+ " ");
        }
    }
}
