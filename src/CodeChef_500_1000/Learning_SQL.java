//Learning SQL
//Chef has recently started learning from the new CodeChef SQL course.
//
//He has a table which initially has
//        R
//R rows and
//        C
//C columns. He then adds
//        E
//E extra rows to it. How many total cells does he have finally?
//
//Input Format
//The only line in the input contains three space-separated integers
//        R
//                R,
//                C
//C, and
//        E
//E — the number of initial rows, the number of columns, and the number of extra rows added, respectively.
//
//Output Format
//Output on a new line, a single integer, which should be the final total number of cells in the table.
//
//        Constraints
//1
//        ≤
//R
//≤
//        100
//        1≤R≤100
//        1
//        ≤
//C
//≤
//        100
//        1≤C≤100
//        1
//        ≤
//E
//≤
//        100
//        1≤E≤100
//Sample 1:
//Input
//        Output
//5 2 1
//        12
//Explanation:
//There are initially
//5
//        5 rows, and
//2
//        2 columns. So the initial number of cells was
//5
//        ∗
//        2
//        =
//        10
//        5∗2=10. Then,
//        1
//        1 extra row was added. So now the table has
//6
//        6 rows, and
//2
//        2 columns. So the total number of cells is now
//6
//        ∗
//        2
//        =
//        12
//        6∗2=12, which is the answer.
//
//Sample 2:
//Input
//        Output
//6 10 3
//        90
//Explanation:
//There are initially
//6
//        6 rows, and
//10
//        10 columns. So the initial number of cells was
//6
//        ∗
//        10
//        =
//        60
//        6∗10=60. Then,
//        3
//        3 extra rows were added. So now the table has
//9
//        9 rows, and
//10
//        10 columns. So the total number of cells is now
//9
//        ∗
//        10
//        =
//        90
//        9∗10=90, which is the answer.
//
//Sample 3:
//Input
//        Output
//1 1 1
//        2
//Explanation:
//There are initially
//1
//        1 rows, and
//1
//        1 columns. So the initial number of cells was
//1
//        ∗
//        1
//        =
//        1
//        1∗1=1. Then,
//        1
//        1 extra row was added. So now the table has
//2
//        2 rows, and
//1
//        1 columns. So the total number of cells is now
//2
//        ∗
//        1
//        =
//        2
//        2∗1=2, which is the answer.
//
//Sample 4:
//Input
//        Output
//100 100 100
//        20000
//Explanation:
//There are initially
//100
//        100 rows, and
//100
//        100 columns. So the initial number of cells was
//100
//        ∗
//        100
//        =
//        10000
//        100∗100=10000. Then,
//        100
//        100 extra rows were added. So now the table has
//200
//        200 rows, and
//100
//        100 columns. So the total number of cells is now
//200
//        ∗
//        100
//        =
//        20000
//        200∗100=20000, which is the answer.

package CodeChef_500_1000;

import java.util.Scanner;

public class Learning_SQL {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int rows = read.nextInt();
        int columns = read.nextInt();
        int extra_rows = read.nextInt();

        int total_Rows = rows + extra_rows;
        int total_Cells = columns + total_Rows;

        System.out.println(total_Rows);

    }
}
