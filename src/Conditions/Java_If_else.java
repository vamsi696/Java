//In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. An if-else statement has the following logical flow:
//
//Wikipedia if-else flow chart
//
//Source: Wikipedia
//
//        Task
//Given an integer, , perform the following conditional actions:
//
//If  is odd, print Weird
//If  is even and in the inclusive range of  to , print Not Weird
//If  is even and in the inclusive range of  to , print Weird
//If  is even and greater than , print Not Weird
//Complete the stub code provided in your editor to print whether or not  is weird.
//
//        Input Format
//
//A single line containing a positive integer, .
//
//Constraints
//
//Output Format
//
//Print Weird if the number is weird; otherwise, print Not Weird.
//
//Sample Input 0
//
//        3
//Sample Output 0
//
//Weird
//Sample Input 1
//
//        24
//Sample Output 1
//
//Not Weird
//Explanation
//
//Sample Case 0:
//is odd and odd numbers are weird, so we print Weird.
//
//Sample Case 1:
//and  is even, so it isn't weird. Thus, we print Not Weird.

package Conditions;

import java.util.Scanner;

public class Java_If_else {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        if(N % 2 == 1){
            System.out.println("Weird");
        } else {
            if ((2 <= N && N <= 5) || 20 < N){
                System.out.println("Not Weird");
            } else {
                System.out.println("Weird");
            }
        }
    }
}
