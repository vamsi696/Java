//Ticket Fine
//On a certain train, Chef-the ticket collector, collects a fine of Rs.
//        X
//X if a passenger is travelling without a ticket. It is known that a passenger carries either a single ticket or no ticket.
//
//P
//P passengers are travelling and they have a total of
//Q
//Q tickets. Help Chef calculate the total fine collected.
//
//        Input Format
//The first line contains a single integer
//        T
//T, the number of test cases.
//        T
//T lines follow. Each following line contains three integers separated by spaces, whose description follows.
//
//The first integer,
//X
//X, is the fee in rupees.
//The second integer,
//P
//P, is the number of passengers on the train.
//The third integer,
//Q
//Q, is the number of tickets Chef collected.
//        Output Format
//The output must consist of
//        T
//T lines.
//
//The
//        i
//t
//        h
//i
//        th
//line must contain a single integer, the total money(in rupees) collected by Chef corresponding to the
//i
//        t
//h
//        i
//th
//test case.
//Constraints
//1
//        ≤
//T
//≤
//        10
//        1≤T≤10
//        1
//        ≤
//X
//≤
//        10
//        1≤X≤10
//        0
//        ≤
//Q
//≤
//P
//≤
//        10
//        0≤Q≤P≤10
//Sample 1:
//Input
//        Output
//4
//        4 1 1
//        2 10 7
//        8 5 4
//        9 7 0
//        0
//        6
//        8
//        63
//Explanation:
//Test case
//        1
//        1: The total number of passengers travelling without ticket are
//1
//        −
//        1
//        =
//        0
//        1−1=0. So the total fine collected is
//0
//        ⋅
//        4
//        =
//        0
//        0⋅4=0 rupees.
//
//        Test case
//        2
//        2: The total number of passengers travelling without ticket are
//10
//        −
//        7
//        =
//        3
//        10−7=3. So the total fine collected is
//3
//        ⋅
//        2
//        =
//        6
//        3⋅2=6 rupees.
//
//        Test case
//        3
//        3: The total number of passengers travelling without ticket are
//5
//        −
//        4
//        =
//        1
//        5−4=1. So the total fine collected is
//1
//        ⋅
//        8
//        =
//        8
//        1⋅8=8 rupees.
//
//        Test case
//        4
//        4: The total number of passengers travelling without ticket are
//7
//        −
//        0
//        =
//        7
//        7−0=7. So the total fine collected is
//7
//        ⋅
//        9
//        =
//        63
//        7⋅9=63 rupees.

package CodeChef_500_1000;

import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        for (int i = 0 ;i < t; i++){
            int x = read.nextInt();
            int p = read.nextInt();
            int q = read.nextInt();

            int withoutTickets = p - q;

            int totalFine = withoutTickets * x;

            System.out.println(totalFine);
        }
    }
}
