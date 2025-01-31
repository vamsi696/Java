//Water Consumption
//Recently, Chef visited his doctor. The doctor advised Chef to drink at least
//2000
//        2000 ml of water each day.
//
//        Chef drank
//X
//X ml of water today. Determine if Chef followed the doctor's advice or not.
//
//Input Format
//The first line contains a single integer
//        T
//T — the number of test cases. Then the test cases follow.
//The first and only line of each test case contains one integer
//        X
//X — the amount of water Chef drank today.
//        Output Format
//For each test case, output YES if Chef followed the doctor's advice of drinking at least
//        2000
//        2000 ml of water. Otherwise, output NO.
//
//You may print each character of the string in uppercase or lowercase (for example, the strings YES, yEs, yes, and yeS will all be treated as identical).
//
//Constraints
//1
//        ≤
//T
//≤
//        2000
//        1≤T≤2000
//        1
//        ≤
//X
//≤
//        4000
//        1≤X≤4000
//Sample 1:
//Input
//        Output
//3
//        2999
//        1450
//        2000
//YES
//        NO
//YES
//Explanation:
//Test case
//        1
//        1: Chef followed the doctor's advice since he drank
//        2999
//        2999 ml of water which is
//≥
//        2000
//        ≥2000 ml.
//
//        Test case
//        2
//        2: Chef did not follow the doctor's advice since he drank
//        1450
//        1450 ml of water which is
//        <
//2000
//<2000 ml.
//
//        Test case
//        3
//        3: Chef followed the doctor's advice since he drank
//        2000
//        2000 ml of water which is
//≥
//        2000
//        ≥2000 ml.

package CodeChef_500_1000;

import java.util.Scanner;

public class Water_Consumption {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int t = read.nextInt();

        while (t-- > 0){
            int x = read.nextInt();

            if (x >= 2000){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
