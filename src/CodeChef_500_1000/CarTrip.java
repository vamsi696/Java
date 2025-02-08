//Car Trip
//The code in the IDE is incorrect - debug the code to solve this problem!
//
//Chef rented a car for a day. Usually, the cost to rent the car is Rs
//10
//        10 per km.
//However, since Chef has booked the car for the whole day, he needs to pay for at least
//300
//        300 kms even if the car runs less than
//300
//        300 kms.
//If the car ran
//X
//        X kms, determine the cost Chef needs to pay.
//
//Input Format
//The first line of input will contain a single integer
//T
//T, denoting the number of test cases.
//Each test case consists of a single integer
//        X
//X - denoting the number of kms Chef travelled.
//        Output Format
//For each test case, output the cost Chef needs to pay.
//
//        Sample 1:
//Input
//        Output
//2
//        800
//        3
//        8000
//        3000
//Explanation:
//Test case
//        1
//        1: The car runs for
//        800
//        800 kms. Thus, he needs to pay
//800
//        ⋅
//        10
//        =
//        8000
//        800⋅10=8000 rupees.
//
//        Test case
//        2
//        2: The car runs for
//        3
//        3 kms. However, since Chef booked the car for whole day, he needs to pay for at least
//300
//        300 kms. Thus, he needs to pay
//300
//        ⋅
//        10
//        =
//        3000
//        300⋅10=3000 rupees.

package CodeChef_500_1000;

import java.util.Scanner;

public class CarTrip {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while(t-- > 0){
            int x = read.nextInt();

            if (x <= 300){
                System.out.println(300 * 10);
            } else {
                System.out.println(x * 10);
            }
        }
    }
}
