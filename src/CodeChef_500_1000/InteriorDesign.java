//Interior Design
//Chef decided to redecorate his house, and now needs to decide between two different styles of interior design.
//
//        Style 1: tiling the floor will cost
//        X
//1
//X
//1
//        ​
//rupees and painting the walls will cost
//        Y
//1
//Y
//1
//        ​
//rupees.
//        Style 2: tiling the floor will cost
//        X
//2
//X
//2
//        ​
//rupees and painting the walls will cost
//        Y
//2
//Y
//2
//        ​
//rupees.
//Chef will choose whichever style has the lower total cost. How much will Chef pay for his interior design?
//
//Input Format
//The first line of input will contain a single integer
//T
//T, denoting the number of test cases.
//Each test case consists of a single line of input, containing
//4
//        4 space-separated integers
//X
//1
//        ,
//Y
//1
//        ,
//X
//2
//        ,
//Y
//2
//X
//1
//        ​
//        ,Y
//1
//        ​
//        ,X
//2
//        ​
//        ,Y
//2
//        ​
//as described in the statement.
//        Output Format
//For each test case, output on a new line the amount Chef will pay for interior design.
//
//Sample 1:
//Input
//        Output
//2
//        10 20 9 25
//        10 20 9 20
//        30
//        29
//Explanation:
//Test case
//        1
//        1: The first style costs
//10
//        +
//        20
//        =
//        30
//        10+20=30 rupees, and the second costs
//9
//        +
//        25
//        =
//        34
//        9+25=34 rupees. The first is cheaper, so Chef will pay
//30
//        30 rupees.
//
//        Test case
//        2
//        2: The first style costs
//10
//        +
//        20
//        =
//        30
//        10+20=30 rupees, and the second costs
//9
//        +
//        20
//        =
//        29
//        9+20=29 rupees. The second is cheaper, so Chef will pay
//29
//        29 rupees.

package CodeChef_500_1000;

import java.util.Scanner;

public class InteriorDesign {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int t = read.nextInt();

        while (t-- > 0) {
            int x1 = read.nextInt();
            int y1 = read.nextInt();
            int x2 = read.nextInt();
            int y2 = read.nextInt();

            int firstCost = x1 + y1;
            int secondCost = x2 + y2;

            if (firstCost < secondCost){
                System.out.println(firstCost);
            } else {
                System.out.println(secondCost);
            }
        }
    }
}
