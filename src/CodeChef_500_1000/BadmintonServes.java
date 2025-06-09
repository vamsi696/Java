//Badminton Serves
//Chef is playing badminton today. The service rules of this singles game of badminton are as follows:
//
//The player who starts the game serves from the right side of their court.
//Whenever a player wins a point, they serve next.
//If the server has won an even number of points during a game, then they will serve from the right side of the service court for the subsequent point.
//Chef will be the player who begins the game.
//
//Given the number of points
//        P
//P obtained by Chef at the end of the game, please determine how many times Chef served from the right side of the court.
//
//Please see the sample cases below for explained examples.
//
//Input Format
//The first line of input contains a single integer
//        T
//T, denoting the number of test cases. The description of
//        T
//T test cases follows.
//Each test case consists of a single line containing one integer
//P
//P, the points obtained by Chef.
//        Output Format
//For each test case, output in a single line the number of times Chef served from the right side of the court.
//
//Constraints
//1
//        ≤
//T
//≤
//        1
//        0
//        3
//        1≤T≤10
//        3
//
//        0
//        ≤
//P
//≤
//        1
//        0
//        9
//        0≤P≤10
//        9
//
//Sample 1:
//Input
//        Output
//4
//        2
//        9
//        53
//        746
//        2
//        5
//        27
//        374
//Explanation:
//Test case
//        1
//        1: Chef obtained
//2
//        2 points at the end of the game. This means he served two times from the right side of the court, once when his score was
//0
//        0 and once again when his score was
//2
//        2.
//
//Test case
//        2
//        2: Chef obtained
//9
//        9 points at the end of the game. This means he served
//5
//        5 times from the right side of the court. The points when he had to serve from right were:
//        0
//        ,
//        2
//        ,
//        4
//        ,
//        6
//        ,
//        8
//        0,2,4,6,8.
// Hint
// When the Chef is on even points, he has served [(P/2) + 1]
// times When the Chef is on odd points, he has served [{(P-1)/2} + 1] times

package CodeChef_500_1000;

import java.util.Scanner;

public class BadmintonServes {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int points = read.nextInt();

            if (points == 2){
                System.out.println("2");
            } else {
                points = (points/2) + 1;
                System.out.println(points);
            }
        }
    }
}
