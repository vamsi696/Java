//Chef and Brain Speed
//        In ChefLand, human brain speed is measured in bits per second (bps). Chef has a threshold limit of
//X
//X bits per second above which his calculations are prone to errors. If Chef is currently working at
//Y
//Y bits per second, is he prone to errors?
//
//If Chef is prone to errors print YES, otherwise print NO.
//
//Input Format
//The only line of input contains two space separated integers
//X
//X and
//Y
//Y — the threshold limit and the rate at which Chef is currently working at.
//
//        Output Format
//If Chef is prone to errors print YES, otherwise print NO.
//
//You may print each character of the string in uppercase or lowercase (for example, the strings yes, Yes, yEs, and YES will all be treated as identical).
//
//Constraints
//1
//        ≤
//X
//,
//Y
//≤
//        100
//        1≤X,Y≤100
//Sample 1:
//Input
//        Output
//7 9
//YES
//Explanation:
//Chef's current brain speed of
//        9
//        9 bps is greater than the threshold of
//7
//        7 bps, hence Chef is prone to errors.
//
//Sample 2:
//Input
//        Output
//6 6
//NO
//Explanation:
//Chef's current brain speed of
//        6
//        6 bps is not greater than the threshold of
//6
//        6 bps, hence Chef is not prone to errors.
//
//        Sample 3:
//Input
//        Output
//31 53
//YES
//Explanation:
//Chef's current brain speed of
//        53
//        53 bps is greater than the threshold of
//31
//        31 bps, hence Chef is prone to errors.
//
//Sample 4:
//Input
//        Output
//53 8
//NO
//Explanation:
//Chef's current brain speed of
//        8
//        8 bps is not greater than the threshold of
//53
//        53 bps, hence Chef is not prone to errors.

package CodeChef_500_1000;

import java.util.Scanner;

public class Chef_and_Brain_speed {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int x = read.nextInt();
        int y = read.nextInt();

        if (y > x){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
