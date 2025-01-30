//Fitness
//Another practice problem for you.
//
//Chef wants to become fit for which he decided to walk to the office and return home by walking.
//It is known that Chef's office is
//X
//X km away from his home.
//If his office is open on
//        5
//        5 days in a week, find the number of kilometres Chef travels through office trips in a week.
//
//        Hint
//
//        Return trips imply that
//        2
//        2*
//        X
//        X distance is travelled each day
//        Input Format
//        The first line of input contains
//        T
//        T - the number of test cases.
//        Each of next
//        T
//        T lines contains a number
//        X
//        X - distance of Chef's office from his of home.
//        Output Format
//        For each test cases, print the number of kilometres Chef travels through office trips in a week, on a new line.
//        Sample 1:
//        Input
//        Output
//        2
//        1
//        3
//        10
//        30

package CodeChef_500_1000;

import java.util.Scanner;

public class Fitness_Problem {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int t = read.nextInt();

        while (t-- > 0){
            int x = read.nextInt();
            int returnDistance = 2 * x;

            System.out.println(returnDistance * 5);
        }
    }
}
