//Coding problem - 2
//Given
//        n
//n (
//        n
//                n is even), determine the number of black cells in an
//n
//×
//n
//n×n chessboard.
//Update the method given in the IDE to solve the problem.
//
//        Input Format
//The only line of the input contains a single integer
//n
//n.
//
//        Output Format
//Output the number of black cells in an
//n
//×
//n
//n×n chessboard.
//
//Constraints
//2
//        ≤
//n
//≤
//        100
//        2≤n≤100
//n
//n is even
//Sample 1:
//Input
//        Output
//8
//        32

package Methods;

import java.util.Scanner;

public class Coding_Problem_2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n = read.nextInt();
        int result1 = square(n);
        int result2 = half(result1);
        System.out.println(result2);
    }

    public static int square(int t){
      return t * t;
    }

    public static int half(int i){
        int value = i / 2;
        return value;
    }
}
