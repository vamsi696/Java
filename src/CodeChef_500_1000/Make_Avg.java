//Problem (Make Avg) - Read the problem statement
//You are given 2 integers -
//A
//A and
//C
//C.
//You need to find if there exists any
//        i
//n
//        t
//e
//        g
//e
//        r
//integer
//        B
//B which meets the following condition
//
//B
//B must be an integer
//        B
//B is the average of
//        A
//A and
//C
//C.
//For each test case, output
//        B
//B. If no such integer exists, output
//−
//        1
//        −1.
//
//Sample 1:
//Input
//        Output
//3
//        3 5
//        6 6
//        2 7
//        4
//        6
//        -1
//Explanation:
//Test case
//        1
//        1: Considering
//        B
//        =
//        4
//B=4,
//B
//B is the average of
//3
//        3 and
//5
//        5.
//Test case
//        2
//        2: Considering
//        B
//        =
//        6
//B=6,
//B
//B is the average of
//6
//        6 and
//6
//        6.
//Test case
//        3
//        3: There exists no integer
//B
//B such that
//        B
//B can be the average of
//2
//        2 and
//7
//        7.
//Average of
//2
//        2 and
//7
//        7 is
//4.5
//        4.5 which is not an integer.

package CodeChef_500_1000;

import java.util.Scanner;

public class Make_Avg {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0) {
            int a = read.nextInt();
            int b = read.nextInt();

            int avg = a + b;

            if (avg%2 == 0) {
                System.out.println(avg/2);
            } else {
                System.out.println("-1");
            }
        }
    }
}
