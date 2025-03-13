//Presents for Cheffina
//Chef has fallen in love with Cheffina, and wants to buy
//N
//N gifts for her. On reaching the gift shop, Chef got to know the following two things:
//
//The cost of each gift is
//1
//        1 coin.
//On the purchase of every
//4
//t
//        h
//4
//th
//gift, Chef gets the
//5
//t
//        h
//5
//th
//gift free of cost.
//What is the minimum number of coins that Chef will require in order to come out of the shop carrying
//N
//N gifts?
//
//Input Format
//The first line of input will contain an integer
//        T
//T — the number of test cases. The description of
//        T
//T test cases follows.
//The first and only line of each test case contains an integer
//        N
//N, the number of gifts in the shop.
//        Output Format
//For each test case, output on a new line the minimum number of coins that Chef will require to obtain all
//        N
//N gifts.
//
//Constraints
//1
//        ≤
//T
//≤
//        1000
//        1≤T≤1000
//        1
//        ≤
//N
//≤
//        1
//        0
//        9
//        1≤N≤10
//        9
//
//Sample 1:
//Input
//        Output
//2
//        5
//        4
//        4
//        4
//Explanation:
//Test case
//        1
//        1: After purchasing
//4
//        4 gifts, Chef will get the
//5
//t
//        h
//5
//th
//gift free of cost. Hence Chef only requires
//4
//        4 coins in order to get
//5
//        5 gifts.
//
//        Test case
//        2
//        2: Chef will require
//4
//        4 coins in order to get
//4
//        4 gifts.

package CodeChef_500_1000;

import java.util.Scanner;

public class PresentsForchefina {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int n = read.nextInt();
            int coins;
            if (n%5==0){
                coins = n/5;
                System.out.println(n - coins);
            } else {
                System.out.println(n - (n/5));
            }
        }
    }
}
