//Chef gives Party
//The code in the IDE is incorrect - debug the code to solve this problem!
//
//Chef wants to give a burger party to all his
//N
//N friends i.e. he wants to buy one burger for each of his friends.
//The cost of each burger is
//X
//X rupees while Chef has a total of
//        K
//K rupees.
//Determine whether he has enough money to buy a burger for each of his friends or not.
//
//Input Format
//The first line contains a single integer
//        T
//T - the number of test cases. Then the test cases follow.
//The first and only line of each test case contains the three integers
//        N
//                N,
//                X
//X, and
//        K
//K - the number of Chef's friends, the cost of each burger, and the total money Chef has, respectively.
//Output Format
//For each test case, output 'YES' if the Chef can give a party to all his
//        N
//N friends. Otherwise, output 'NO'.
//
//Sample 1:
//Input
//        Output
//2
//        5 10 70
//        5 10 40
//YES
//        NO
//Explanation:
//Test case
//        1
//        1: Chef has
//5
//        5 friends. The cost of buying a burger for each of them will be
//10
//        ×
//        5
//        =
//        50
//        10×5=50 while Chef has
//70
//        70 rupees. Therefore, he can buy a burger for all of them.
//
//        Test case
//        2
//        2: Chef has
//5
//        5 friends. The cost of buying a burger for each of them will be
//10
//        ×
//        5
//        =
//        50
//        10×5=50 while Chef has
//40
//        40 rupees. Therefore, he can not buy a burger for all of them.

package CodeChef_500_1000;

import java.util.Scanner;

public class ChefGivesParty {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        for (int i = 0; i < t; i++){
            int n = read.nextInt();
            int x = read.nextInt();
            int k = read.nextInt();

            if (n*x <= k){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
