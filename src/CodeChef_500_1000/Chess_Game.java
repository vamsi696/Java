//Modulo function
//Chef has recently started playing chess.
//He completes a game of chess in 30 minutes.
//Chef has a total of
//        N
//N minutes of available time
//
//He will utilise the maximum possible time to play
//He will not plan incomplete games - if there is insufficient time remaining to play a game, he will not play the game
//How many complete games with Chef be able to play and how much spare time will remain?
//Go ahead and code out the solution in the IDE.
//
//Input Format
//The first line of input will contain a single integer
//T
//T, denoting the number of test cases.
//Each test case consists of the integer
//N
//        N
//Output Format
//For each test case, output on a new line
//2
//        2 space separated integers
//
//Total games played by Chef
//Total spare time in minutes
//Sample 1:
//Input
//        Output
//2
//        100
//        90
//        3 10
//        3 0

package CodeChef_500_1000;

import java.util.Scanner;

public class Chess_Game {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int t = read.nextInt();

        while (t-- > 0){
            int n = read.nextInt();

            int totalGames = n / 30;
            int totalSpareTime = n % 30;

            System.out.print(totalGames + " ");
            System.out.println(totalSpareTime + " ");
        }
    }
}
