//Expense List
//Chef has made a list for his monthly expenses. The list has
//        N
//N expenses with index
//1
//        1 to
//        N
//N. The money spent on each expense depends upon the monthly income of Chef.
//
//        Chef spends
//50
//        %
//        50% of his total income on the expense with index
//1
//        1.
//The money spent on the
//        i
//t
//        h
//i
//        th
//expense
//        (
//                i
//>
//        1
//        )
//(i>1) is equal to
//50
//        %
//        50% of the amount remaining, after paying for all expenses with indices less than
//i
//i.
//Given that Chef earns
//2
//X
//2
//X
//rupees in a month, find the amount he saves after paying for all
//        N
//N expenses.
//
//Input Format
//The first line of input will contain a single integer
//T
//T, denoting the number of test cases.
//Each test case consists of two space-separated integers
//N
//N and
//X
//X — where
//        N
//N denotes the number of expenses and
//2
//X
//2
//X
//denotes the monthly income of Chef.
//Output Format
//For each test case, output on a new line, the amount saved by Chef after paying for all
//        N
//N expenses.
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
//        <
//                X
//≤
//        20
//        1≤N<X≤20
//Sample 1:
//Input
//        Output
//4
//        1 2
//        1 3
//        2 3
//        3 4
//        2
//        4
//        2
//        2
//Explanation:
//Test case
//        1
//        1: The number of expenses are
//1
//        1 and Chef's monthly income is
//        2
//        2
//        =
//        4
//        2
//        2
//        =4.
//Chef spends
//50
//        %
//        50% of his monthly income, that is,
//        2
//        2 on first expense and saves the remaining amount
//4
//        −
//        2
//        =
//        2
//        4−2=2.
//
//Test case
//        2
//        2: The number of expenses are
//1
//        1 and Chef's monthly income is
//        2
//        3
//        =
//        8
//        2
//        3
//        =8.
//Chef spends
//50
//        %
//        50% of his monthly income, that is,
//        4
//        4 on first expense and saves the remaining amount
//8
//        −
//        4
//        =
//        4
//        8−4=4.
//
//Test case
//        3
//        3: The number of expenses are
//2
//        2 and Chef's monthly income is
//        2
//        3
//        =
//        8
//        2
//        3
//        =8.
//
//Chef spends
//50
//        %
//        50% of his monthly income, that is,
//        4
//        4 on first expense. The remaining amount is
//8
//        −
//        4
//        =
//        4
//        8−4=4.
//Chef spends
//50
//        %
//        50% of the remaining amount, that is,
//        2
//        2 on his second expense. The remaining amount is
//4
//        −
//        2
//        =
//        2
//        4−2=2 which goes into his savings.
//        Test case
//        4
//        4: The number of expenses are
//3
//        3 and Chef's monthly income is
//        2
//        4
//        =
//        16
//        2
//        4
//        =16.
//
//Chef spends
//50
//        %
//        50% of his monthly income, that is,
//        8
//        8 on first expense. The remaining amount is
//16
//        −
//        8
//        =
//        8
//        16−8=8.
//Chef spends
//50
//        %
//        50% of the remaining amount, that is,
//        4
//        4 on second expense. The remaining amount is
//8
//        −
//        4
//        =
//        4
//        8−4=4.
//Chef spends
//50
//        %
//        50% of the remaining amount, that is,
//        2
//        2 on his third expense. The remaining amount is
//4
//        −
//        2
//        =
//        2
//        4−2=2 which goes into his savings.

package CodeChef_500_1000;

import java.util.Scanner;

public class ExpensiveList {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int n = read.nextInt();
            int x = read.nextInt();

            double expenses = Math.pow(2, x - n);

            System.out.println((int)expenses);
        }
    }
}
