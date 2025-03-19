//Best of Two
//Alice and Bob are playing a game. Each player rolls a standard six-sided die three times. The score of a player is calculated as the sum of the two highest rolls. The player with the higher score wins. If both players have the same score, the game ends in a tie.
//
//Determine the winner of the game or if it is a tie.
//
//Input Format
//The first line of input will contain a single integer
//T
//T, denoting the number of test cases.
//Each test case contains six space-separated integers
//A
//1
//A
//1
//        ​
//        ,
//A
//2
//A
//2
//        ​
//        ,
//A
//3
//A
//3
//        ​
//        ,
//B
//1
//B
//1
//        ​
//        ,
//B
//2
//B
//2
//        ​
//and
//        B
//3
//B
//3
//        ​
//        — the values Alice gets in her
//3
//        3 dice rolls, followed by the values which Bob gets in his
//3
//        3 dice rolls.
//Output Format
//For each test case, output on a new line Alice if Alice wins, Bob if Bob wins and Tie in case of a tie.
//
//Note that you may print each character in uppercase or lowercase. For example, the strings tie, TIE, Tie, and tIe are considered identical.
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
//A
//1
//        ,
//A
//2
//        ,
//A
//3
//        ,
//B
//1
//        ,
//B
//2
//        ,
//B
//3
//        ≤
//        6
//        1≤A
//1
//        ​
//        ,A
//2
//        ​
//        ,A
//3
//        ​
//        ,B
//1
//        ​
//        ,B
//2
//        ​
//        ,B
//3
//        ​
//        ≤6
//Sample 1:
//Input
//        Output
//3
//        3 2 5 6 1 1
//        4 4 5 6 4 1
//        6 6 6 6 6 1
//Alice
//        Bob
//Tie
//Explanation:
//Test Case
//1
//        1: Alice's score is
//        8
//        =
//        (
//        3
//        +
//        5
//        )
//        8=(3+5) which is greater than Bob's score
//        7
//        =
//        (
//        6
//        +
//        1
//        )
//        7=(6+1).
//
//Test Case
//2
//        2: Alice's score is
//        9
//        =
//        (
//        5
//        +
//        4
//        )
//        9=(5+4) which is less than Bob's score
//        10
//        =
//        (
//        6
//        +
//        4
//        )
//        10=(6+4).
//
//Test Case
//3
//        3: Alice's score is
//        12
//        =
//        (
//        6
//        +
//        6
//        )
//        12=(6+6) which is same as Bob's score
//        12
//        =
//        (
//        6
//        +
//        6
//        )
//        12=(6+6).

package CodeChef_500_1000;

import java.util.Scanner;

public class BestOfTwo {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int a1 = read.nextInt();
            int a2 = read.nextInt();
            int a3 = read.nextInt();
            int b1 = read.nextInt();
            int b2 = read.nextInt();
            int b3 = read.nextInt();

            int aliceScore = calculateScore(a1, a2, a3);
            int bobScore = calculateScore(b1, b2, b3);

            if (aliceScore > bobScore){
                System.out.println("Alice");
            } else if (aliceScore < bobScore){
                System.out.println("Bob");
            } else {
                System.out.println("Tie");
            }
        }
    }

    public static int calculateScore(int x, int y, int z){
        int sum = x + y + z;
        int minVal = Math.min(x, Math.min(y, z));

        return sum - minVal;
    }
}
