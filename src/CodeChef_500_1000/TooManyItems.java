//Too many items
//Chef bought
//N
//N items from a shop. Although it is hard to carry all these items in hand, so Chef has to buy some polybags to store these items.
//
//1
//        1 polybag can contain at most
//10
//        10 items. What is the minimum number of polybags needed by Chef?
//
//Input Format
//The first line will contain an integer
//        T
//T - number of test cases. Then the test cases follow.
//The first and only line of each test case contains an integer
//        N
//N - the number of items bought by Chef.
//        Output Format
//For each test case, output the minimum number of polybags required.
//
//        Constraints
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
//        1000
//        1≤N≤1000
//Sample 1:
//Input
//        Output
//3
//        20
//        24
//        99
//        2
//        3
//        10
//Explanation:
//Test case-1: Chef will require
//2
//        2 polybags. Chef can fit
//10
//        10 items in the first and second polybag each.
//
//Test case-2: Chef will require
//3
//        3 polybags. Chef can fit
//10
//        10 items in the first and second polybag each and fit the remaining
//4
//        4 items in the third polybag.

package CodeChef_500_1000;

import java.util.Scanner;

public class TooManyItems {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int n = read.nextInt();

            if (n%10 == 0){
                System.out.println(n/10);
            } else {
                System.out.println((n/10)+ 1);
            }
        }
    }
}
