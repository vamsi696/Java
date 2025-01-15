//Coding problem - 1
//In a contest where
//N
//N new users visited the contest,
//
//A
//A users just saw the problems and didn’t make any submissions and hence won’t get any rating.
//B
//B users who made a submission but could not solve any problem correctly. Thus, after the contest, they will get a rating in the range
//800
//        −
//        1000
//        800−1000.
//Everyone else could correctly solve at least
//1
//        1 problem. Thus, they will get a rating strictly greater than
//1000
//        1000 after the contest.
//You need to output the number of new users in the contest who, after the contest, will get a rating and also the number of new users who will get a rating strictly greater than
//1000
//        1000.
//
//The code given in the IDE uses the concept of method.
//Update the code to solve the problem.
//
//        Input Format
//Each input file contains of a single line, with three integers
//N
//,
//A
//N,A and
//B
//B - the number of new users, the number of users who just saw the problem and didn't make any submission, and the number of users who made a submission but could not solve any problem correctly.
//Output Format
//Output two integers separated by a space in a single line - the number of new users who will get a rating at the end of the contest and the number of new users who will get a rating higher than
//1000
//        1000.
//
//Constraints
//2
//        ≤
//N
//≤
//        1000
//        2≤N≤1000
//        1
//        ≤
//A
//≤
//        1000
//        1≤A≤1000
//        1
//        ≤
//B
//≤
//        1000
//        1≤B≤1000
//A
//+
//B
//≤
//N
//A+B≤N
//Sample 1:
//Input
//        Output
//10 3 2
//        7 5
//Explanation:
//There were
//10
//        10 new users. Among those
//10
//        10,
//        3
//        3 didn't make any submissions. This means that the other
//        10
//        −
//        3
//        =
//        7
//        10−3=7 users made submissions and will get a rating. This is the first integer of the output.
//
//Now, among these
//7
//        7 users,
//        2
//        2 couldn't solve any problem even though they submitted and tried. So, they will get a rating less than equal to
//        1000
//        1000. The other
//7
//        −
//        2
//        =
//        5
//        7−2=5 users were able to solve at least
//1
//        1 problem and hence will get a rating greater than
//1000
//        1000. Hence, the second integer of the output is
//5
//        5.
//
//Sample 2:
//Input
//        Output
//10 4 1
//        6 5
//Explanation:
//There were
//10
//        10 new users. Among those
//10
//        10,
//        4
//        4 didn't make any submissions. This means that the other
//        10
//        −
//        4
//        =
//        6
//        10−4=6 users made submissions and will get a rating. This is the first integer of the output.
//
//Now, among these
//6
//        6 users,
//        1
//        1 couldn't solve any problem even though they submitted and tried. So, they will get a rating less than equal to
//        1000
//        1000. The other
//6
//        −
//        1
//        =
//        5
//        6−1=5 users were able to solve at least
//1
//        1 problem and hence will get a rating greater than
//1000
//        1000. Hence, the second integer of the output is
//5
//        5.
//
//Sample 3:
//Input
//        Output
//20 1 2
//        19 17
//Explanation:
//There were
//20
//        20 new users. Among those
//20
//        20,
//        1
//        1 didn't make any submissions. This means that the other
//        20
//        −
//        1
//        =
//        19
//        20−1=19 users made submissions and will get a rating. This is the first integer of the output.
//
//Now, among these
//19
//        19 users,
//        2
//        2 couldn't solve any problem even though they submitted and tried. So, they will get a rating less than equal to
//        1000
//        1000. The other
//19
//        −
//        2
//        =
//        17
//        19−2=17 users were able to solve at least
//1
//        1 problem and hence will get a rating greater than
//1000
//        1000. Hence, the second integer of the output is
//17
//        17.
//
//Sample 4:
//Input
//        Output
//1000 300 700
//        700 0
//Explanation:
//There were
//1000
//        1000 new users. Among those
//1000
//        1000,
//        300
//        300 didn't make any submissions. This means that the other
//        1000
//        −
//        300
//        =
//        700
//        1000−300=700 users made submissions and will get a rating. This is the first integer of the output.
//
//Now, among these
//700
//        700 users,
//        700
//        700 couldn't solve any problem even though they submitted and tried. So, they will get a rating less than equal to
//        1000
//        1000. The other
//700
//        −
//        700
//        =
//        0
//        700−700=0 users were able to solve at least
//1
//        1 problem and hence will get a rating greater than
//1000
//        1000. Hence, the second integer of the output is
//0
//        0.

package Methods;

import java.util.Scanner;

public class Coding_Problem_1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int N = read.nextInt();
        int A = read.nextInt();
        int B = read.nextInt();

        int result1 = getRatingUsers(A, B, N);
        int result2 = getHighRatingUsers(A, B, N);
        System.out.println(result1 + " " + result2);
    }
    public static int getRatingUsers(int a, int b, int n){
        return n - a;
    }
    public static int getHighRatingUsers(int a, int b, int n){
        return n - a - b;
    }
}
