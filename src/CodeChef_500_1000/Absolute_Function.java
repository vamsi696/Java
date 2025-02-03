//Abs() - Absolute function
//Let us check the
//a
//        b
//s
//abs function in a bit more detail
//
//        Task
//There are multiple test cases denoted by the integer
//        T
//T.
//You are given 2 integers -
//A
//A and
//B
//B.
//For each test case, you need to output the following 4 space separated integers on a single line
//
//        A
//−
//B
//A−B
//        B
//−
//A
//B−A
//        M
//a
//        t
//h
//        .
//        a
//        b
//s
//        (
//                A
//−
//        B
//        )
//Math.abs(A−B)
//M
//        a
//t
//        h
//.
//a
//        b
//s
//        (
//                B
//−
//        A
//        )
//Math.abs(B−A)
//What do you observe in the results?
//Go ahead and code out the solution in the IDE.
//
//Sample 1:
//Input
//        Output
//3
//        10 5
//        5 10
//        3 11
//        5 -5 5 5
//        -5 5 5 5
//        -8 8 8 8


package CodeChef_500_1000;

import java.util.Scanner;

public class Absolute_Function {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int a = read.nextInt();
            int b = read.nextInt();

            System.out.print(a - b + " ");
            System.out.print(b - a + " ");
            System.out.print(Math.abs(a - b) + " ");
            System.out.println(Math.abs(b - a) + " ");
        }
    }
}
