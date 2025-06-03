//Equal Integers
//Chef has two integers
//X
//X and
//Y
//Y. Chef wants to perform some operations to make
//X
//X and
//Y
//Y equal. In one operation, Chef can either:
//
//set
//        X
//:
//        =
//X
//+
//        1
//X:=X+1
//or set
//Y
//:
//        =
//Y
//+
//        2
//Y:=Y+2
//Find the minimum number of operations required to make
//        X
//X and
//Y
//Y equal.
//
//Input Format
//The first line contains a single integer
//        T
//T — the number of test cases. Then the test cases follow.
//The first and only line of each test case contains two space separated integers
//        X
//X and
//Y
//Y.
//        Output Format
//For each test case, print the minimum number of operations required to make
//        X
//X and
//Y
//Y equal.
//
//Constraints
//1
//        ≤
//T
//≤
//        1
//        0
//        4
//        1≤T≤10
//        4
//
//        1
//        ≤
//X
//,
//Y
//≤
//        1
//        0
//        9
//        1≤X,Y≤10
//        9
//
//Sample 1:
//Input
//        Output
//5
//        3 4
//        5 5
//        7 3
//        5 2
//        7 12
//        1
//        0
//        2
//        3
//        5

package CodeChef_500_1000;

import java.util.Scanner;

public class EqualIntergers {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int x = read.nextInt();
            int y = read.nextInt();

            if (x == y){
                System.out.println("0");
            } else if (x < y){
                System.out.println(y - x);
            } else {
                System.out.println((x - y + 1)/2 + 1 - (x % 2 == y%2 ? 1 : 0));
            }
        }
    }
}
