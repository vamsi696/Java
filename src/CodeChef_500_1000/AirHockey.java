//Air Hockey
//Alice is playing Air Hockey with Bob. The first person to earn seven points wins the match. Currently, Alice's score is
//A
//A and Bob's score is
//B
//B.
//
//Charlie is eagerly waiting for his turn. Help Charlie by calculating the minimum number of points that will be further scored in the match before it ends.
//
//Input Format
//The first line of input will contain an integer
//        T
//T — the number of test cases. The description of
//        T
//T test cases follows.
//The first and only line of each test case contains two space-separated integers
//A
//A and
//B
//B, as described in the problem statement.
//Output Format
//For each test case, output on a new line the minimum number of points that will be further scored in the match before it ends.
//
//        Constraints
//1
//        ≤
//T
//≤
//        50
//        1≤T≤50
//        0
//        ≤
//A
//,
//B
//≤
//        6
//        0≤A,B≤6
//Sample 1:
//Input
//        Output
//4
//        0 0
//        2 5
//        5 2
//        4 3
//        7
//        2
//        2
//        3
//Explanation:
//Test case
//        1
//        1: The current score is
//0
//        −
//        0
//        0−0. If either Alice or Bob scores
//7
//        7 consecutive points, then the score will become
//7
//        −
//        0
//        7−0 or
//0
//        −
//        7
//        0−7 respectively, and the game will end. It can be proven that at least
//7
//        7 points will be further scored in the match before it ends.
//
//        Test case
//        2
//        2: The current score is
//2
//        −
//        5
//        2−5. If Bob scores
//2
//        2 consecutive points, then the score will become
//2
//        −
//        7
//        2−7 and the game will end. It can be proven that at least
//2
//        2 points will be further scored in the match before it ends.
//
//        Test case
//        3
//        3: The current score is
//5
//        −
//        2
//        5−2. If Alice scores
//2
//        2 consecutive points, then the score will become
//7
//        −
//        2
//        7−2 and the game will end. It can be proven that at least
//2
//        2 points will be further scored in the match before it ends.
//
//        Test case
//        4
//        4: The current score is
//4
//        −
//        3
//        4−3. If Alice scores
//3
//        3 consecutive points, then the score will become
//7
//        −
//        3
//        7−3 and the game will end. It can be proven that at least
//3
//        3 points will be further scored in the match before it ends.

package CodeChef_500_1000;

import java.util.Scanner;

public class AirHockey {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int alice = read.nextInt();
            int bob = read.nextInt();

            int Maximum = 7 - alice;
            int minimum = 7 - bob;

            System.out.println(Math.min(Maximum, minimum));
        }
    }
}
