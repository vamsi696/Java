//Chef and Profits
//Some time ago, Chef bought
//X
//X stocks at the cost of Rs.
//        Y
//Y each. Today, Chef is going to sell all these
//        X
//X stocks at Rs.
//Z
//Z each. What is Chef's total profit after he sells them?
//
//Chef's profit equals the total amount he received by selling the stocks, minus the total amount he spent buying them.
//
//Input Format
//The first line of input contains an integer
//T
//T, denoting the number of test cases. The description of
//        T
//T test cases follows.
//The first and only line of each test case contains three space-separated integers
//X
//,
//Y
//X,Y and
//Z
//Z — the number of stocks, the price they were bought at, and the price they can be sold at, respectively.
//Output Format
//For each test case print on a new line a single integer — Chef's profit after selling all the stocks he has.
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
//X
//,
//Y
//≤
//        10
//        4
//        1≤X,Y≤10
//        4
//
//Y
//≤
//Z
//≤
//        10
//        4
//Y≤Z≤10
//        4
//
//Sample 1:
//Input
//        Output
//3
//        2 5 20
//        3 1 2
//        4 5 6
//        30
//        3
//        4
//Explanation:
//Test Case 1: Chef bought
//X
//=
//        2
//X=2 stocks for
//Y
//=
//        5
//Y=5 each, making the total amount spent by Chef
//=
//        2
//        ⋅
//        5
//        =
//        10
//        =2⋅5=10.
//
//Chef can sell this stock today for
//Z
//=
//        20
//Z=20, making the total amount received by Chef
//=
//        2
//        ⋅
//        20
//        =
//        40
//        =2⋅20=40.
//
//The total profit is then the amount received minus the amount spent, which equals
//40
//        −
//        10
//        =
//        30
//        40−10=30.
//
//Test Case 2: Chef bought
//X
//=
//        3
//X=3 stocks for
//Y
//=
//        1
//Y=1 each, making the total amount spent by Chef
//=
//        3
//        ⋅
//        1
//        =
//        3
//        =3⋅1=3.
//
//Chef can sell this stock today for
//Z
//=
//        2
//Z=2, making the total amount received by Chef
//=
//        3
//        ⋅
//        2
//        =
//        6
//        =3⋅2=6.
//
//The total profit is then the amount received minus the amount spent, which equals
//6
//        −
//        3
//        =
//        3
//        6−3=3.
//
//Test Case 3: Chef bought
//X
//=
//        4
//X=4 stocks for
//Y
//=
//        5
//Y=5 each, making the total amount spent by Chef
//=
//        4
//        ⋅
//        5
//        =
//        20
//        =4⋅5=20.
//
//Chef can sell this stock today for
//Z
//=
//        6
//Z=6, making the total amount received by Chef
//=
//        4
//        ⋅
//        6
//        =
//        24
//        =4⋅6=24.
//
//The total profit is then the amount received minus the amount spent, which equals
//24
//        −
//        20
//        =
//        4
//        24−20=4


package CodeChef_500_1000;

import java.util.Scanner;

public class ChefAndProfits {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        int t = read.nextInt();

        while (t-- > 0){
            int x = read.nextInt();
            int y = read.nextInt();
            int z = read.nextInt();

            int totalProfitMadeByChef = x * (z - y);

            System.out.println(totalProfitMadeByChef);
        }
    }
}
