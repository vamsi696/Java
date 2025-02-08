//Advance
//The code in the IDE is incorrect - debug the code to solve this problem!
//
//Chef's current rating is
//X
//X, and he wants to improve it.
//It is generally recommended that a person with rating
//        X
//X should solve problems whose difficulty lies in the range
//        [
//X
//,
//X
//+
//        200
//        ]
//        [X,X+200], i.e, problems whose difficulty is at least
//X
//X and at most
//X
//+
//        200
//X+200.
//You find out that Chef is currently solving problems with a difficulty of
//        Y
//Y.
//Is Chef following the recommended practice or not?
//
//Input Format
//The first line of input will contain a single integer
//T
//T, denoting the number of test cases. The description of the test cases follows.
//Each test case consists of a single line of input, containing two space-separated integers
//X
//,
//Y
//X,Y.
//        Output Format
//For each test case, output on a new line 'YES' if Chef is following the recommended practice style, and 'NO' otherwise.
//
//        Sample 1:
//Input
//        Output
//2
//        1300 1500
//        1201 1402
//YES
//        NO
//Explanation:
//Test case
//        1
//        1: Chef's current rating is
//        1300
//        1300, so he should solve problems with difficulty lying in
//[
//        1300
//        ,
//        1500
//        ]
//        [1300,1500]. Since
//1500
//        1500 lies in
//        [
//1300
//        ,
//        1500
//        ]
//        [1300,1500], Chef is doing his practice in a recommended way :)
//
//Test case
//        2
//        2: Chef's current rating is
//        1201
//        1201, so he should solve problems with difficulty lying in
//[
//        1201
//        ,
//        1401
//        ]
//        [1201,1401]. Since
//1402
//        1402 does not lie in
//        [
//1201
//        ,
//        1401
//        ]
//        [1201,1401], Chef is not doing his practice in a recommended way :(

package CodeChef_500_1000;

import java.util.Scanner;

public class Advance {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        for (int i = 0; i<t; i++){
            int x = read.nextInt();
            int y = read.nextInt();

            if (y>=x && y<=(x + 200)){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
