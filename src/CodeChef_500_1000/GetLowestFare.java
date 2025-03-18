//Get Lowest Free
//Chef goes to the supermarket to buy some items. Luckily there's a sale going on under which Chef gets the following offer:
//
//If Chef buys
//3
//        3 items then he gets the item (out of those
//        3
//        3 items) having the lowest price as free.
//For e.g. if Chef bought
//3
//        3 items with the cost
//6
//        6,
//        2
//        2 and
//4
//        4, then he would get the item with cost
//2
//        2 as free. So he would only have to pay the cost of the other two items which will be
//6
//        +
//        4
//        =
//        10
//        6+4=10.
//
//Chef buys
//3
//        3 items having prices
//        A
//A,
//B
//B and
//C
//C respectively. What is the amount of money Chef needs to pay?
//
//Input Format
//The first line will contain an integer
//        T
//T - number of test cases. Then the test cases follow.
//The first and only line of each test case contains three integers
//        A
//        ,
//        B
//        ,
//        C
//A,B,C - the prices of the items bought by Chef.
//Output Format
//For each test case, output the price paid by Chef.
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
//A
//,
//B
//,
//C
//≤
//        10
//        1≤A,B,C≤10
//Sample 1:
//Input
//        Output
//3
//        6 2 4
//        3 3 3
//        8 4 4
//        10
//        6
//        12
//Explanation:
//Test case-1: Explained in the problem statement.
//
//        Test case-2: Since all the three items have the same price, Chef will get one of them free and will have to pay the cost of the other two items which will be
//3
//        +
//        3
//        =
//        6
//        3+3=6.
//
//Test case-3: Chef will get one of the items having price
//4
//        4 as free and will have to pay the cost of the other two items which will be
//8
//        +
//        4
//        =
//        12
//        8+4=12.

package CodeChef_500_1000;

import java.util.Scanner;

public class GetLowestFare {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int a = read.nextInt();
            int b = read.nextInt();
            int c = read.nextInt();

            if (a == b && b == c && c == a){
                System.out.println(a + b);
            } else if ((a < b || b > c) && (a < c || b < c)) {
                System.out.println(b + c);
            } else if (a >= b && b <= c){
                System.out.println(a + c);
            } else {
                System.out.println(a + b);
            }
        }
    }
}
