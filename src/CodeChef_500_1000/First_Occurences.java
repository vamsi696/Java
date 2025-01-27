//First occurrence
//Write a program using a for loop to find and print the index of the first occurrence of the number 8 in the array {2, 4, 8, 12, 8}.
//
//Sample 1:
//Input
//        Output
//2

package CodeChef_500_1000;

public class First_Occurences {
    public static void main(String[] args) {

        int[] num = {2, 4, 6, 8, 10, 8};

        for (int i = 0; i < num.length;i++){

            if (num[i] == 8){
                System.out.println(i);
                break;
            }
        }
    }
}
