//Capacity
//Capacity
//You have
//N
//N cars that can seat
//5
//        5 people each and
//        M
//M cars that can seat
//7
//        7 people each.
//Determine the maximum number of people that can travel together in these cars.
//
//        Hint
//
//Calculate the total capacity of 5 seater cars and 7 seater cars. Then add the total capacity.
//        Input Format
//The first line of input contains a single integer
//        T
//T, the number of test cases.
//The first and only line of each test case contains two space-separated integers
//N
//N and
//M
//M — the number of
//5
//        5-seaters and
//7
//        7-seaters, respectively.
//        Output Format
//For each test case, output on a new line the maximum number of people that can travel together.
//
//Sample 1:
//Input
//        Output
//2
//        4 8
//        2 13
//        76
//        101
//Explanation:
//Test case
//        1
//        1: There are
//4
//        4 cars that seat
//5
//        5 each and
//8
//        8 cars that seat
//7
//        7 each. So,
//        4
//        ×
//        5
//        +
//        8
//        ×
//        7
//        =
//        76
//        4×5+8×7=76 people can travel together.
//
//Test case
//        2
//        2: There are
//2
//        2 cars that seat
//5
//        5 each and
//13
//        13 cars that seat
//7
//        7 each. So,
//        2
//        ×
//        5
//        +
//        13
//        ×
//        7
//        =
//        101
//        2×5+13×7=101 people can travel together.

package CodeChef_500_1000;

import java.util.Scanner;

public class Capacity {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int n = read.nextInt();
            int m = read.nextInt();

            int five_Seat_Car = n * 5;
            int seven_Seat_Car = m * 7;

            System.out.println(five_Seat_Car + seven_Seat_Car);
        }
    }
}
