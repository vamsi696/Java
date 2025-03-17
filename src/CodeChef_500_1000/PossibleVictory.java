//Possible Victory
//Chef is playing in a T20 cricket match. In a match, Team A plays for 20 overs. In a single over, the team gets to play 6 times, and in each of these 6 tries, they can score a maximum of 6 runs. After Team A's 20 overs are finished, Team B similarly plays for 20 overs and tries to get a higher total score than the first team. The team with the higher total score at the end wins the match.
//
//Chef is in Team B. Team A has already played their 20 overs, and have gotten a score of
//R
//R. Chef's Team B has started playing, and have already scored
//C
//C runs in the first
//        O
//O overs. In the remaining
//20
//        −
//O
//20−O overs, find whether it is possible for Chef's Team B to get a score high enough to win the game. That is, can their final score be strictly larger than
//R
//R?
//
//Input Format
//There is a single line of input, with three integers,
//R
//,
//O
//,
//C
//R,O,C.
//        Output Format
//Output in a single line, the answer, which should be "YES" if it's possible for Chef's Team B to win the match and "NO" if not.
//
//You may print each character of the string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).
//
//Constraints
//0
//        ≤
//C
//≤
//R
//≤
//        720
//        0≤C≤R≤720
//        1
//        ≤
//O
//≤
//        19
//        1≤O≤19
//        0
//        ≤
//C
//≤
//        36
//        ∗
//O
//0≤C≤36∗O
//Sample 1:
//Input
//        Output
//719 18 648
//YES
//Explanation:
//In the remaining
//20
//        −
//O
//=
//        2
//        20−O=2 overs, Team B gets to play
//2
//        ∗
//        6
//        =
//        12
//        2∗6=12 times, and in each try, they can get a maximum of 6 score. Which means that the maximum score that they can acheieve in these 2 overs is
//12
//        ∗
//        6
//        =
//        72
//        12∗6=72. Thus, the maximum total score that Team B can achieve is
//C
//+
//        72
//        =
//        720
//C+72=720.
//        720
//        720 is strictly more than Team A's score of
//        719
//        719, and hence Chef's Team B can win this match.
//
//Sample 2:
//Input
//        Output
//720 18 648
//NO
//Explanation:
//Similar to the previous explanation, the maximum total score that Team B can achieve is
//720
//        720, which isn't strictly greater than Team A's
//720
//        720.Hence Chef's Team B can't win this match.

package CodeChef_500_1000;

import java.util.Scanner;

public class PossibleVictory {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int R = read.nextInt();
            int O = read.nextInt();
            int C = read.nextInt();

            int remainingOvers = 20 - O;
            int OversLeft = remainingOvers * 6;
            int maximumScore = OversLeft * 6;

            int maxScoreByTeamB = maximumScore + C;

            if (R < maxScoreByTeamB){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
