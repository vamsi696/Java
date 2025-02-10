//Weights
//Chef is playing with weights. He has an object weighing
//        W
//W units. He also has three weights each of
//        X
//        ,
//        Y
//        ,
//        X,Y, and
//Z
//Z units respectively. Help him determine whether he can measure the exact weight of the object with one or more of these weights.
//
//If it is possible to measure the weight of object with one or more of these weights, print YES, otherwise print NO.
//
//Input Format
//The first line of input will contain a single integer
//T
//T, denoting the number of test cases.
//Each test case consists of single line containing a four positive integers
//        W
//        ,
//        X
//        ,
//        Y
//        ,
//        W,X,Y, and
//Z
//Z.
//        Output Format
//For each test case, output on a new line YES if it is possible to measure the weight of object with one or more of these weights, otherwise print NO.
//
//You may print each character of the string in either uppercase or lowercase (for example, the strings yes, YES, Yes, and yeS will all be treated as identical).
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
//W
//,
//X
//,
//Y
//,
//Z
//≤
//        1
//        0
//        5
//        1≤W,X,Y,Z≤10
//        5
//
//Sample 1:
//Input
//        Output
//4
//        5 2 1 6
//        7 9 7 2
//        20 8 10 12
//        20 10 11 12
//NO
//        YES
//YES
//        NO
//Explanation:
//Test Case
//1
//        1: It is not possible to measure
//5
//        5 units using any combination of given weights.
//
//        Test Case
//2
//        2: Chef can use the second weight of
//7
//        7 units to measure the object exactly.
//
//Test Case
//3
//        3: Chef can use combination of first and third weights to measure
//8
//        +
//        12
//        =
//        20
//        8+12=20 units.
//
//        Test Case
//4
//        4: Chef cannot measure
//20
//        20 units of weight using any combination of given weights.

package CodeChef_500_1000;

import java.util.Scanner;

public class Weights {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int w = read.nextInt();
            int x = read.nextInt();
            int y = read.nextInt();
            int z = read.nextInt();

            if (w == y || w == x || w == z) {
                System.out.println("yes");
            } else if (w == (x + y) || w == (y + z) || w == (z + x)){
                System.out.println("Yes");
            } else if (w == (x + y + z)){
                System.out.println("yes");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
