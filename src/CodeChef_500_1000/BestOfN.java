//Best of N Sets
//Sonu and Titu are playing a tennis match. They are playing a "best of
//N
//N sets" match (
//N
//N is always odd). That means that they will play at most
//N
//        N sets, and the person who has won most sets wins the match. But they are smart, and if they notice at any point that one of them has no chance of winning the match, they will stop the match right then, without playing out all the
//N
//N sets needlessly.
//
//        For example, suppose
//N
//=
//        11
//N=11. And at some point, Sonu has won 5 sets, and Titu has won 4 sets. Sonu is leading now, but it is possible that Titu wins the two remaining sets and wins the whole match. So they will not stop right now.
//
//But suppose Sonu wins the next set as well, and so now the score is
//        (
//6
//        ,
//        4
//        )
//(6,4). Now, even though there is one set remaining, there is no chance of Titu winning the whole match, since at best, even if he wins the next set, the score will become
//        (
//6
//        ,
//        5
//        )
//(6,5), and Sonu still wins. So, they will stop at a score of
//        (
//6
//        ,
//        4
//        )
//(6,4) and declare Sonu as the winner.
//
//As another example, if
//N
//=
//        15
//N=15, and the score is currently
//        (
//8
//        ,
//        2
//        )
//(8,2), then they'll stop right now, since there is no way for Titu to win the match. Even if Titu wins all the
//        5
//        5 remaining sets, Titu cannot win the match.
//
//You are watching the match, and you see that the match has ended with a score of
//        (
//                X
//                ,
//                Y
//                )
//(X,Y). That is, Sonu has won
//X
//        X sets, and Titu has won
//        Y
//Y sets. But you don't know what
//N
//N is. Can you find out
//N
//N from just knowing the final score?
//
//Input Format
//The first line of input will contain a single integer
//T
//T, denoting the number of test cases.
//Each test case consists of a single line of input containing two space-separated integers
//X
//X and
//Y
//Y where
//X
//X is the number of sets won by Sonu and
//Y
//Y is the number of sets won by Titu.
//        Output Format
//For each test case, output on a new line the value of
//N
//N.
//Note that you should only output an odd integer.
//        Constraints
//1
//        ≤
//T
//≤
//        10000
//        1≤T≤10000
//        1
//        ≤
//X
//≤
//        100
//        1≤X≤100
//        1
//        ≤
//Y
//≤
//        100
//        1≤Y≤100
//X
//≠
//Y
//X=Y, since they would never stop when they have won the same number of sets.
//Sample 1:
//Input
//        Output
//4
//        2 5
//        8 10
//        99 1
//        4 8
//        9
//        19
//        197
//        15
//Explanation:
//Testcase 1: Sonu has won 2 sets and Titu has won 5. They have played 7 sets and Titu has been decided to be the winner.
//
//Suppose
//        N
//        =
//        11
//N=11, then 4 more sets are remaining and if Sonu wins them all, Sonu's score (
//        2
//        +
//        4
//        =
//        6
//        2+4=6) will become greater than Titu's score of
//        5
//        5. So at this point, they could not have stopped playing, and so
//        N
//N cannot be
//11
//        11 or more.
//
//But suppose
//N
//=
//        9
//N=9, then 2 more sets are remaining and even if Sonu wins them all, he still cannot win, since
//2
//        +
//        2
//        =
//        4
//        2+2=4 is still
//<
//5
//<5. So it makes sense that they stopped right now.
//
//        N
//N can't be lower than
//        9
//        9, since they would have stopped the match sooner.
//
//So, the answer is
//        N
//        =
//        9
//N=9.
//
//Testcase 2: Sonu has won 8 sets and Titu has won 10. They have played 18 sets and Titu has been decided to be the winner.
//
//Suppose
//        N
//        =
//        21
//N=21, then 3 more sets are remaining and if Sonu wins them all, Sonu's score (
//        8
//        +
//        3
//        =
//        11
//        8+3=11) will become greater than Titu's score of
//        10
//        10. So at this point, they could not have stopped playing, and so
//        N
//N cannot be
//21
//        21 or more.
//
//But suppose
//N
//=
//        19
//N=19, then 1 more set is remaining and even if Sonu wins that set, he still cannot win, since
//8
//        +
//        1
//        =
//        9
//        8+1=9 is still
//<
//10
//<10. So it makes sense that they stopped right now.
//
//        N
//N can't be lower than
//        19
//        19, since they have played
//18
//        18 sets.
//
//        So, the answer is
//        N
//        =
//        19
//N=19.
//
//Testcase 3: Sonu has won 99 sets and Titu has won 1. They have played 100 sets and Sonu has been decided to be the winner.
//
//Suppose
//        N
//        =
//        199
//N=199, then 99 more sets are remaining and if Titu wins them all, Titu's score (
//        1
//        +
//        99
//        =
//        100
//        1+99=100) will become greater than Titu's score of
//        99
//        99. So at this point, they could not have stopped playing, and so
//        N
//N cannot be
//199
//        199 or more.
//
//But suppose
//N
//=
//        197
//N=197, then 97 more sets are remaining and even if Titu wins that set, he still cannot win, since
//1
//        +
//        97
//        =
//        98
//        1+97=98 is still
//<
//9
//<9. So it makes sense that they stopped right now.
//
//        N
//N can't be lower than
//        197
//        197, since they would have stopped the match sooner.
//
//So, the answer is
//        N
//        =
//        197
//N=197.
//
//Testcase 4: Sonu has won 4 sets and Titu has won 8. They have played 12 sets and Titu has been decided to be the winner.
//
//Suppose
//        N
//        =
//        17
//N=17, then 5 more sets are remaining and if Sonu wins them all, Sonu's score (
//        4
//        +
//        5
//        =
//        9
//        4+5=9) will become greater than Titu's score of
//        8
//        8. So at this point, they could not have stopped playing, and so
//        N
//N cannot be
//17
//        17 or more.
//
//But suppose
//N
//=
//        15
//N=15, then 3 more sets are remaining and even if Sonu wins them all, he still cannot win, since
//4
//        +
//        3
//        =
//        7
//        4+3=7 is still
//<
//8
//<8. So it makes sense that they stopped right now.
//
//        N
//N can't be lower than
//        15
//        15, since they would have stopped the match sooner.
//
//So, the answer is
//        N
//        =
//        15
//N=15.

package CodeChef_500_1000;

import java.util.Scanner;

public class BestOfN {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int x = read.nextInt();
            int y = read.nextInt();

            int maxVal = Math.max(x, y);
            int n = 2 * maxVal - 1;

            System.out.println(n);
        }
    }
}
