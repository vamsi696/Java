//Watching Movies at 2x
//Chef started watching a movie that runs for a total of
//        X
//X minutes.
//
//Chef has decided to watch the first
//        Y
//Y minutes of the movie at twice the usual speed as he was warned by his friends that the movie gets interesting only after the first
//Y
//Y minutes.
//
//How long will Chef spend watching the movie in total?
//
//Note: It is guaranteed that
//Y
//Y is even.
//
//        Input Format
//The first line contains two space separated integers
//X
//,
//Y
//X,Y - as per the problem statement.
//        Output Format
//Print in a single line, an integer denoting the total number of minutes that Chef spends in watching the movie.
//        Constraints
//1
//        ≤
//X
//,
//Y
//≤
//        1000
//        1≤X,Y≤1000
//Y
//Y is an even integer.
//        Subtasks
//Subtask #1 (100 points): original constraints
//
//Sample 1:
//Input
//        Output
//100 20
//        90
//Explanation:
//For the first
//        Y
//        =
//        20
//Y=20 minutes, Chef watches at twice the usual speed, so the total amount of time spent to watch this portion of the movie is
//        Y
//2
//        =
//        10
//        2
//Y
//​
//        =10 minutes.
//
//For the remaining
//        X
//−
//Y
//=
//        80
//X−Y=80 minutes, Chef watches at the usual speed, so it takes him
//80
//        80 minutes to watch the remaining portion of the movie.
//
//        In total, Chef spends
//10
//        +
//        80
//        =
//        90
//        10+80=90 minutes watching the entire movie.
//
//        Sample 2:
//Input
//        Output
//50 24
//        38
//Explanation:
//For the first
//        Y
//        =
//        24
//Y=24 minutes, Chef watches at twice the usual speed, so the total amount of time spent to watch this portion of the movie is
//        Y
//2
//        =
//        12
//        2
//Y
//​
//        =12 minutes.
//
//For the remaining
//        X
//−
//Y
//=
//        26
//X−Y=26 minutes, Chef watches at the usual speed, so it takes him
//26
//        26 minutes to watch the remaining portion of the movie.
//
//        In total, Chef spends
//12
//        +
//        26
//        =
//        38
//        12+26=38 minutes watching the entire movie.

package CodeChef_500_1000;

import java.util.Scanner;

public class WatchingMoviesAt2x {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        int y = read.nextInt();

        int timeSpentOnMovie = y/2;

        System.out.println(x - timeSpentOnMovie);
    }
}
