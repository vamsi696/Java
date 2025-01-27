//Square of numbers
//Write a program that uses a for-each loop to print the square of each element in an array, but skips elements greater than 10. The elements of the array are {2, 10, 12, 6, 15}.
//
//Sample 1:
//Input
//        Output
//4 100 36

package CodeChef_500_1000;

public class Square_of_numbers {
    public static void main(String[] args) {
        int[] values = {2, 10, 12, 6, 15};

        for (int num : values){
            if (num <= 10){
                System.out.print(num * num + " ");
            }
        }
    }
}
