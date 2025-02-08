//Parity
//Ashu and Arvind participated in a coding contest, as a result of which they received
//N
//N chocolates. Now they want to divide the chocolates between them equally.
//
//Can you help them by deciding if it is possible for them to divide all the
//        N
//N chocolates in such a way that they each get an equal number of chocolates?
//
//You cannot break a chocolate in two or more pieces.
//
//        Input Format
//The first line of input will contain a single integer
//T
//T, denoting the number of test cases.
//The first and only line of each test case contains a single integer
//N
//N — the number of chocolates they received.
//Output Format
//For each test case output the answer on a new line — "Yes" (without quotes) if they can divide chocolates between them equally, and "No" (without quotes) otherwise.
//
//Each letter of the output may be printed in either uppercase or lowercase, i.e, "Yes", "YES", and "yEs" will all be treated as equivalent.
//
//Constraints
//1
//        ≤
//T
//≤
//        10
//        1≤T≤10
//        1
//        ≤
//N
//≤
//        10
//        1≤N≤10
//Sample 1:
//Input
//        Output
//4
//        10
//        4
//        3
//        2
//Yes
//        Yes
//No
//        Yes
//Explanation:
//Test case
//        1
//        1: They can divide
//10
//        10 chocolates such that both of them get
//5
//        5 chocolates each.
//
//Test case
//        2
//        2: They can divide
//4
//        4 chocolates such that both of them get
//2
//        2 chocolates each.
//
//Test case
//        3
//        3: There is no way to divide
//3
//        3 chocolates so that they get equal number of chocolates.
//
//        Test case
//        4
//        4: They can divide
//2
//        2 chocolates such that both of them get
//1
//        1 chocolate each.

package CodeChef_500_1000;

import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0) {
            int x = read.nextInt();

            if (x%2 == 0){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
