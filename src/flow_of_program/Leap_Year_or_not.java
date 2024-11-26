//Input a year and find whether it is a leap year or not.
// Start -> Input year -> check whether the year is divisible by 4 or not
// If divisible by 4 = 0 then its leap year else its not an leap year

package flow_of_program;

import java.util.Scanner;

public class Leap_Year_or_not {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();

        if (year % 4 == 0){
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }
}
