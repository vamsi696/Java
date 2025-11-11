//Chef and Battery
//Chef's phone has a battery level of
//N
//N percent.
//Each minute:
//
//If the phone is on charging, the battery level increases by
//2
//        %
//        2%.
//Otherwise, the battery level decreases by
//3
//        %
//        3%.
//Find the minimum time in which Chef can make the battery level reach exactly
//50
//        %
//        50%.
//Note that the battery level should always lie in the range
//0
//        0 to
//100
//        100 (both included).
//
//Input Format
//The first line of input will contain a single integer
//T
//T, denoting the number of test cases.
//Each test case consists of single lines of input
//N
//N - the current battery level of Chef's phone.
//Output Format
//For each test case, output on a new line the minimum time in which Chef can make the battery level reach exactly
//50
//        %
//        50%.
//
//Constraints
//1
//        ≤
//T
//≤
//        1000
//        1≤T≤1000
//        0
//        ≤
//N
//≤
//        100
//        0≤N≤100
//Sample 1:
//Input
//        Output
//4
//        51
//        50
//        23
//        0
//        2
//        0
//        16
//        25
//Explanation:
//Test case
//        1
//        1: Chef can use his phone for
//        1
//        1 minute. Thus, the battery drops to
//48
//        %
//        48%.
//Then, he can charge it for
//        1
//        1 minute. Thus, the battery reaches exactly
//50
//        %
//        50%.
//
//Test case
//        2
//        2: The battery level is already at
//50
//        %
//        50%.
//
//Test case
//        3
//        3: Chef can charge the battery for
//        15
//        15 minutes and use it for
//        1
//        1 minute.
//        Thus, after
//16
//        16 minutes, the battery will be
//50
//        %
//        50% .
//
//Test case
//        4
//        4: Chef can charge the battery for
//        25
//        25 minutes to reach the battery level of
//50
//        %
//        50%.


package CodeChef_500_1000;

import java.util.Scanner;

public class chefAndBattery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();

            if (n == 50){
                System.out.println("0");
                continue;
            }

            int steps = 0;
            while (n != 50){
                if (n < 50){
                    n = n + 2;
                } else {
                    n = n - 3;
                }
                steps++;

                if (n < 0 || n > 100){
                    break;
                }
            }
            System.out.println(steps);
        }
    }
}
