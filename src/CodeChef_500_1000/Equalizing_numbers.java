//Equalizing Numbers
//Chef has two integers
//A
//A and
//B
//B. In one operation he can choose any integer
//d
//,
//d, and make one of the following two moves :
//
//Add
//        d
//d to
//A
//A and subtract
//        d
//d from
//B
//B.
//        Add
//        d
//d to
//B
//B and subtract
//        d
//d from
//A
//A.
//Chef is allowed to make as many operations as he wants. Can he make
//        A
//A and
//B
//B equal?
//
//Input Format
//First line will contain
//T
//T, number of test cases. Then the test cases follow.
//Each test case contains of a single line of input, two integers
//A
//,
//B
//A,B.
//        Output Format
//For each test case, if Chef can make the two numbers equal print YES else print NO.
//
//You may print each character of the string in uppercase or lowercase (for example, the strings yEs, Yes, YeS, and YES will all be treated as identical).
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
//A
//,
//B
//≤
//        1000
//        1≤A,B≤1000
//Sample 1:
//Input
//        Output
//2
//        3 3
//        1 2
//Yes
//        No
//Explanation:
//Test case
//        1
//        1: Since
//        A
//A and
//B
//B are already equal, Chef does not need any operations.
//
//        Test case
//        2
//        2: It can be shown that
//        A
//A and
//B
//B can never be made equal using any number of given operations.

package CodeChef_500_1000;

import java.util.Scanner;

public class Equalizing_numbers {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t>0){
            int a = read.nextInt();
            int b = read.nextInt();

            int operations = b - a;

            if (operations%2==0){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            t--;
        }
    }
}
