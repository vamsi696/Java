//Maximise the Tastiness
//Chef is making a dish that consists of exactly two ingredients. He has four ingredients
//A
//,
//B
//,
//C
//A,B,C and
//D
//D with tastiness
//        a
//        ,
//        b
//        ,
//        c
//        ,
//        a,b,c, and
//d
//d respectively. He can use either
//A
//A or
//B
//B as the first ingredient and either
//        C
//C or
//D
//D as the second ingredient.
//
//The tastiness of a dish is the sum of tastiness of its ingredients. Find the maximum possible tastiness of the dish that the chef can prepare.
//
//        Input Format
//The first line of input will contain a single integer
//T
//T, denoting the number of test cases.
//The first and only line of each test case contains four space-separated integers
//a
//,
//b
//,
//c
//,
//a,b,c, and
//        d
//d — the tastiness of the four ingredients.
//Output Format
//For each test case, output on a new line the maximum possible tastiness of the dish that chef can prepare.
//
//Constraints
//1
//        ≤
//T
//≤
//        100
//        1≤T≤100
//        1
//        ≤
//a
//,
//b
//,
//c
//,
//d
//≤
//        100
//        1≤a,b,c,d≤100
//Sample 1:
//Input
//        Output
//2
//        3 5 6 2
//        16 15 5 4
//        11
//        21
//Explanation:
//Test case
//        1
//        1: Chef can prepare a dish with ingredients
//        B
//B and
//C
//C with a tastiness of
//5
//        +
//        6
//        =
//        11
//        5+6=11.
//
//Test case
//        2
//        2: Chef can prepare a dish with ingredients
//        A
//A and
//C
//C with a tastiness of
//16
//        +
//        5
//        =
//        21
//        16+5=21.

package CodeChef_500_1000;

import java.util.Scanner;

public class MaximiseTasteness {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while(t-- > 0){
            int a = read.nextInt();
            int b = read.nextInt();
            int c = read.nextInt();
            int d = read.nextInt();

            int t1 = a + c;
            int t2 = a + d;
            int t3 = b + c;
            int t4 = b + d;

            System.out.println(Math.max(Math.max(t1, t2), Math.max(t3, t4)));
        }
    }
}
