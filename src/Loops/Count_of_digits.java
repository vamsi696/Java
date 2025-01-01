//Count of Digits
//Chef's coding journey continues.
//Chef was given an integer input
//N
//N - he needs to find the number of digits in the given integer.
//
//Let's assume the number of digits in
//N
//N is
//x
//x.
//Whenever we divide a number by
//10
//        10 and store it in an integer, the right-most digit of that number gets removed.
//        Since
//1
//        1 digit gets removed each time we divide a number by
//10
//        10, thus the total number digits we can remove from a number are the total number of digits in the number.
//Thus, we can divide
//        N
//N by
//10
//        10,
//x
//x times before it becomes
//0
//        0, after which the division will not affect the number and it will remain
//0
//        0(as
//0
//        0 divided by anything is still
//0
//        0).
//So, If we keep dividing the integer
//N
//N by
//10
//        10 in a loop, till it reaches
//0
//        0, the loop will execute
//x
//x times.
//Now, we can just count how many times the loop was executed, by starting a count from
//0
//        0 and increasing the count each time the loop executes.
//        Here, we can get the number of digits in
//N
//N in count.
//Based on this, Help him complete the while loop.
//
//        Sample 1:
//Input
//        Output
//14635
//        5
//Sample 2:
//Input
//        Output
//3246
//        4

package Loops;

import java.util.Scanner;

public class Count_of_digits {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int count = 0;

        while (num != 0){
            num /= 10;
            count++;
        }
        System.out.println(count);
    }
}
