//Change Row and Column Both
//There is a
//10
//        ×
//        10
//        10×10 grid with rows numbered
//1
//        1 to
//10
//        10 from top to bottom, and columns
//1
//        1 to
//10
//        10 from left to right. Each cell is identified by a pair
//        (
//                r
//                ,
// 
//                c
//                )
//(r, c) which means that the cell is located at row
//        r
//r and column
//        c
//c.
//
//If Chef's current location is
//        (
//a
//,
//b
//)
//        (a,b), then in one move Chef can go to
//        (
//                c
//                ,
//                d
//                )
//(c,d) if both of the following are satisfied:
//
//a
//≠
//c
//a=c
//        b
//≠
//d
//b=d
//Determine the minimum number of moves required to go from
//        (
//                s
//                        x
//                ,
//                s
//                        y
//        )
//(s
//        x
//​
//        ,s
//        y
//​
//        ) to
//        (
//                e
//                        x
//                ,
//                e
//                        y
//        )
//(e
//        x
//​
//        ,e
//        y
//​
//        ).
//
//Input Format
//The first line contains a single integer
//        T
//T — the number of test cases. Then the test cases follow.
//The first and only line of each test case contains four integer
//        s
//x
//        s
//x
//​
//        ,
//s
//        y
//s
//        y
//​
//        ,
//e
//        x
//e
//        x
//​
//        ,
//e
//        y
//e
//        y
//​
//        — the coordinates of the starting and ending cells.
//Output Format
//For each testcase, output the minimum number of moves required to go from
//        (
//                s
//                        x
//                ,
//                s
//                        y
//        )
//(s
//        x
//​
//        ,s
//        y
//​
//        ) to
//        (
//                e
//                        x
//                ,
//                e
//                        y
//        )
//(e
//        x
//​
//        ,e
//        y
//​
//        ).
//
//Constraints
//1
//        ≤
//T
//≤
//        1000
//        1≤T≤1000
//        1
//        ≤
//        s
//                x
//                ,
//                s
//y
//,
//        e
//                x
//                ,
//                e
//y
//≤
//        10
//        1≤s
//        x
//​
//        ,s
//        y
//​
//        ,e
//        x
//​
//        ,e
//        y
//​
//        ≤10
//        (
//        s
//                x
//                ,
//                s
//y
//)
//        ≠
//        (
//        e
//                x
//                ,
//                e
//y
//)
//        (s
//        x
//​
//        ,s
//        y
//​
//        )=(e
//        x
//​
//        ,e
//        y
//​
//        )
//Sample 1:
//Input
//        Output
//4
//        1 2 9 8
//        5 5 5 7
//        8 6 6 8
//        3 10 8 10
//        1
//        2
//        1
//        2
//Explanation:
//Test case 1: Chef can go from
//        (
//1
//        ,
//        2
//        )
//(1,2) to
//        (
//9
//        ,
//        8
//        )
//(9,8) in one move since
//1
//        ≠
//        9
//        1=9 and
//2
//        ≠
//        8
//        2=8.
//
//Test case 2: Chef will require at least two moves. One such sequence of moves is
//        (
//5
//        ,
//        5
//        )
//→
//        (
//        2
//        ,
//        3
//        )
//        →
//        (
//        5
//        ,
//        7
//        )
//        (5,5)→(2,3)→(5,7).

package CodeChef_500_1000;

import java.util.Scanner;

public class ChangeRow_ColumnBoth {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int a = read.nextInt();
            int b = read.nextInt();
            int c = read.nextInt();
            int d = read.nextInt();

            if (a!=c && b!=d){
                System.out.println("1");
            } else {
                System.out.println("2");
            }
        }
    }
}
