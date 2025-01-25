//Black cells in a chessboard
//Read problem statements in Mandarin Chinese and Bengali.
//Given
//        n
//n (
//        n
//                n is even), determine the number of black cells in an
//n
//×
//n
//n×n chessboard.
//
//Input Format
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
//Explanation:
//
//There are
//32
//        32 black cells and
//32
//        32 white cells in an
//8
//        ×
//        8
//        8×8 chessboard. So the answer is
//32
//        32.

package CodeChef_500_1000;

import java.util.Scanner;

public class Black_Cells_Chess_Board {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int x = read.nextInt();

        int total_Cells = x * x;
        int total_BlackCells = total_Cells / 2;

        System.out.println(total_BlackCells);
    }
}
