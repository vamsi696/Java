//Sum of numbers
//Write a program using a for loop to calculate the sum of the first 10 natural numbers.
//
//Sample 1:
//Input
//        Output
//55

package CodeChef_500_1000;

public class Sum_of_Numbers {
    public static void main(String[] args) {
        int num = 10;
        int sum = 0;

        for (int i = 1; i <= num; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
