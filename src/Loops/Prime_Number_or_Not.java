//Prime Number
//The last challenge of the while loop.
//
//Chef wants to write a code which checks if a given number is prime.
//
//You are given a whole number N.
//Your task is to determine if N is a prime number or not and print "Yes" if it is prime, or "No" if it is not.
//        Sample 1:
//Input
//        Output
//14635
//No
//Sample 2:
//Input
//        Output
//13
//Yes

package Loops;

import java.util.Scanner;

public class Prime_Number_or_Not {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int i = 2;
        boolean isPrime = true; // assume n is prime

        while (i < num){
            if (num % i == 0){
                isPrime = false;
                break;
            }
            i++;
        }

        if (isPrime){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
