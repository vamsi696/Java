//Police and Thief
//Chef discovered that his secret recipe has been stolen. He immediately informs the police of the theft.
//
//It is known that the policeman and thief move on the number line. You are given that:
//
//The initial location of the policeman on the number line is
//        X
//X and his speed is
//2
//        2 units per second.
//The initial location of the thief on the number line is
//        Y
//Y and his speed is
//1
//        1 unit per second.
//Find the minimum time (in seconds) in which the policeman can catch the thief. Note that, the policeman catches the thief as soon as their locations become equal and the thief will try to evade the policeman for as long as possible.
//
//        Input Format
//The first line of input will contain an integer
//        T
//T — the number of test cases. The description of
//        T
//T test cases follows.
//The first and only line of each test case contains two integers
//        X
//X and
//Y
//Y, as described in the problem statement.
//Output Format
//For each test case, output in a single line the minimum time taken by the policeman to catch the thief.
//
//Constraints
//1
//        ≤
//T
//≤
//        1000
//        1≤T≤1000
//        −
//        1
//        0
//        5
//        ≤
//X
//,
//Y
//≤
//        1
//        0
//        5
//        −10
//        5
//        ≤X,Y≤10
//        5
//
//Sample 1:
//Input
//        Output
//3
//        1 3
//        2 1
//        1 1
//        2
//        1
//        0
//Explanation:
//Test case
//        1
//        1: The initial locations of the policeman and thief are
//1
//        1 and
//3
//        3 respectively. The minimum time taken by the policeman to catch the thief is
//2
//        2 seconds, and this happens when both the policeman and the thief move towards the right.
//
//Test case
//        2
//        2: The initial location of the policeman and thief are
//2
//        2 and
//1
//        1 respectively. The minimum time taken by the policeman to catch the thief is
//1
//        1 second, and this happens when both the policeman and the thief move towards the left.
//
//Test case
//        3
//        3: The initial locations of the policeman and thief are
//1
//        1 and
//1
//        1 respectively. Because the police is already present at the location of thief, the time taken by police to catch the thief is
//0
//        0 seconds.

package CodeChef_500_1000;

import java.util.Scanner;

public class PoliceTheif {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int x = read.nextInt();
            int y = read.nextInt();

            System.out.println(Math.abs(x - y));
        }
    }
}
