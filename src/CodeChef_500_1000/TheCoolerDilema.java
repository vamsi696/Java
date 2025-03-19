//The Cooler Dilemma 2
//The summer is at its peak in Chefland. Chef is planning to purchase a water cooler to keep his room cool. He has two options available:
//
//Rent a cooler at the cost of
//        X
//X coins per month.
//Purchase a cooler for
//Y
//Y coins.
//Chef wonders what is the maximum number of months for which he can rent the cooler such that the cost of renting is strictly less than the cost of purchasing it.
//
//        Input Format
//The first line of input will contain an integer
//        T
//T — the number of test cases. The description of
//        T
//T test cases follows.
//The first and only line of each test case contains two integers
//        X
//X and
//Y
//Y, as described in the problem statement.
//Output Format
//For each test case, output the maximum number of months for which he can rent the cooler such that the cost of renting is strictly less than the cost of purchasing it.
//
//If Chef should not rent a cooler at all, output
//0
//        0.
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
//X
//,
//Y
//≤
//        1
//        0
//        9
//        1≤X,Y≤10
//        9
//
//Sample 1:
//Input
//        Output
//2
//        5 12
//        5 5
//        2
//        0
//Explanation:
//Test case
//        1
//        1: Cost of renting the cooler
//=
//        5
//        =5 coins per month. Cost of purchasing the cooler
//=
//        12
//        =12 coins. So, Chef can rent the cooler for
//        2
//        2 months at the cost of
//10
//        10 coins, which is strictly less than
//12
//        12 coins.
//
//        Test case
//        2
//        2: Cost of renting the cooler
//=
//        5
//        =5 coins per month. Cost of purchasing the cooler
//=
//        5
//        =5 coins. If Chef rents the cooler for
//        1
//        1 month, it will cost
//5
//        5 coins, which is not strictly less than the cost of purchasing it. So, Chef should not rent the cooler.

package CodeChef_500_1000;

import java.util.Scanner;

public class TheCoolerDilema {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int x = read.nextInt();
            int y = read.nextInt();

            CoinsForCooler(x, y);
        }
    }


    public static void CoinsForCooler(int a, int b){
        if (b%a==0){
            System.out.println((b/a)-1);
        }else {
            System.out.println(b/a);
        }
    }
}
