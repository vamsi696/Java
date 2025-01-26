//Print Squares
//Write a program that utilizes a while loop to print the squares of numbers from 1 to 5.
//
//Sample 1:
//Input
//        Output
//1 4 9 16 25

package CodeChef_500_1000;

public class Print_Squares {
    public static void main(String[] args) {

        int num = 1;

        while (num <= 5){
            System.out.print(num * num + " ");
            num++;
        }
    }
}
