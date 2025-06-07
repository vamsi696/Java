//Car Choice
//Chef is planning to buy a new car for his birthday. After a long search, he is left with
//2
//        2 choices:
//
//Car 1: Runs on diesel with a fuel economy of
//x
//1
//x
//1
//        ​
//km/l
//Car 2: Runs on petrol with a fuel economy of
//x
//2
//x
//2
//        ​
//km/l
//Chef also knows that
//
//the current price of diesel is
//y
//1
//y
//1
//        ​
//rupees per litre
//the current price of petrol is
//y
//2
//y
//2
//        ​
//rupees per litre
//Assuming that both cars cost the same and that the price of fuel remains constant, which car will minimize Chef's expenses?
//
//Print your answer as a single integer in the following format
//
//If it is better to choose Car 1, print
//−
//        1
//        −1
//If both the cars will result in the same expenses, print
//0
//        0
//If it is better to choose Car 2, print
//1
//        1
//Input Format
//The first line of input contains a single integer
//        T
//T, denoting the number of test cases. The description of
//        T
//T test cases follows.
//Each test case consists of a single line containing
//4
//        4 space-separated integers —
//x
//1
//        ,
//x
//2
//        ,
//y
//1
//        ,
//y
//2
//x
//1
//        ​
//        ,x
//2
//        ​
//        ,y
//1
//        ​
//        ,y
//2
//        ​
//        .
//Output Format
//For each test case, output in a single line the answer as explained earlier.
//
//Constraints
//1
//        ≤
//T
//≤
//        10000
//        1≤T≤10000
//        1
//        ≤
//x
//1
//        ,
//x
//2
//        ,
//y
//1
//        ,
//y
//2
//        ≤
//        50
//        1≤x
//1
//        ​
//        ,x
//2
//        ​
//        ,y
//1
//        ​
//        ,y
//2
//        ​
//        ≤50
//Sample 1:
//Input
//        Output
//3
//        10 5 3 20
//        7 2 7 2
//        1 5 3 2
//        -1
//        0
//        1
//Explanation:
//Test Case
//1
//        1: The cost of driving Car 1 is
//3
//        10
//        =
//        0.3
//        10
//        3
//        ​
//        =0.3 rs/km, and the cost of driving Car 2 is
//20
//        5
//        =
//        4
//        5
//        20
//        ​
//        =4 rs/km. Therefore, Car 1 is cheaper to drive, so the output is
//−
//        1
//        −1.
//
//Test Case
//2
//        2: The cost of driving Car 1 is
//1
//        1 rs/km, and the cost of driving Car 2 is also
//1
//        1 rs/km. Both cars offer the same economy, so the output is
//0
//        0.
//
//Test Case
//3
//        3: The cost of driving Car 1 is
//3
//        3 rs/km and the cost of driving Car 2 is
//0.4
//        0.4 rs/km. Therefore, Car 2 is cheaper to drive, so the output is
//1
//        1.

package CodeChef_500_1000;

import java.util.Scanner;

public class CarChoice {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int x1 = read.nextInt();
            int x2 = read.nextInt();
            int y1 = read.nextInt();
            int y2 = read.nextInt();

            double car1 = (double) y1/x1;
            double car2 = (double) y2/x2;

            if (car1 < car2){
                System.out.println("-1");
            } else if (car1 == car2){
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        }
    }
}
