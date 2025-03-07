//Sasta Shark Tank
//Devendra just had a million-dollar idea and he needs funds to startup. He was recently invited to Sasta Shark Tank (A TV show where entrepreneurs pitch their ideas to investors hoping to get investment in return).
//
//He was offered deals from two investors. The first investor offers
//A
//A dollars for
//        10
//        10% of his company and the second investor offers
//B
//B dollars for
//        20
//        20% of his company. Devendra will accept the offer from the investor whose valuation of the company is more. Determine which offer will Devendra accept or if both the offers are equally good.
//
//For example, if the first investor offers
//300
//        300 dollars for
//        10
//        10% of the company, then the first investor's valuation of the company is
//        3000
//        3000 dollars since
//10
//        10% of
//3000
//        =
//        300
//        3000=300. If the second investor offers
//500
//        500 dollars for
//        20
//        20% of the company, then the second investor's valuation of the company is
//        2500
//        2500 dollars since
//20
//        20% of
//2500
//        =
//        500
//        2500=500.
//
//Input Format
//The first line contains a single integer
//        T
//T - the number of test cases. Then the test cases follow.
//The first and only line of each test case contains two integers
//        A
//A and
//B
//B - the amount offered by first investor for
//        10
//        10% of Devendra's company and the amount offered by second investor for
//        20
//        20% of Devendra's company respectively.
//Output Format
//For each test case, Output FIRST if Devendra should accept the first investor's deal, output SECOND if he should accept the second investor's deal, otherwise output ANY if both deals are equally good.
//
//You may print each character of the strings in uppercase or lowercase (for example, the strings "FiRst", "First", "FIRST", and "FIrst" will all be treated as identical).
//
//Constraints
//1
//        ≤
//T
//≤
//        100
//        1≤T≤100
//        100
//        ≤
//A
//,
//B
//≤
//        10000
//        100≤A,B≤10000
//A
//A and
//B
//B are multiples of
//100
//        100
//Sample 1:
//Input
//        Output
//3
//        100 200
//        200 100
//        200 500
//ANY
//        FIRST
//SECOND
//Explanation:
//Test case 1: First investor's valuation of Devendra's company was
//1000
//        1000 since
//10
//        10% of
//1000
//        =
//        100
//        1000=100 which is the amount he offered for
//        10
//        10% of the company.
//
//Second investor's valuation of Devendra's company was also
//1000
//        1000 since
//20
//        20% of
//1000
//        =
//        200
//        1000=200 which is the amount he offered for
//        20
//        20% of the company.
//
//Therefore he can accept any of the deal.
//
//Test case 2: First investor offered a better deal as he valued Devendra's company at
//        2000
//        2000 dollars (since
//10
//        10% of
//        2000
//        =
//        200
//        2000=200) compared to the second investor who valued Devendra's company at
//        500
//        500 dollars (since
//20
//        20% of
//        500
//        =
//        100
//        500=100).
//
//Test case 3: Second investor offered a better deal as he valued Devendra's company at
//        2500
//        2500 dollars compared to the first investor who valued Devendra's company
//        2000
//        2000 dollars.

package CodeChef_500_1000;

import java.util.Scanner;

public class Shasta_Shark_Tank {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int t = read.nextInt();

        while (t-- > 0){
            int A = read.nextInt();
            int B = read.nextInt();

            A = A * 10;
            B = B * 5;

            if (A == B){
                System.out.println("Any");
            } else if (A > B){
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        }
    }
}
