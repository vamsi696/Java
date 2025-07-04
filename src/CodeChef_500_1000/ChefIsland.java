//Chef On Island
//Suppose Chef is stuck on an island and currently he has
//        x
//x units of food supply and
//y
//y units of water supply in total that he could collect from the island. He needs
//x
//        r
//x
//        r
//​
//units of food supply and
//        y
//r
//        y
//r
//​
//units of water supply per day at the minimal to have sufficient energy to build a boat from the woods and also to live for another day. Assuming it takes exactly
//D
//D days to build the boat and reach the shore, tell whether Chef has the sufficient amount of supplies to be able to reach the shore by building the boat?
//
//Input:
//First line will contain
//T
//T, number of testcases. Then the testcases follow.
//Each testcase contains of a single line of input, five integers
//x
//,
//y
//,
//        x
//                r
//                ,
//                y
//r
//,
//        D
//                x,y,x
//r
//​
//        ,y
//        r
//​
//        ,D.
//        Output:
//For each testcase, output in a single line answer "YES" if Chef can reach the shore by building the boat and "NO" if not (without quotes).
//
//You may print each character of each string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).
//
//Constraints
//1
//        ≤
//T
//≤
//        300
//        1≤T≤300
//        1
//        ≤
//x
//,
//y
//≤
//        100
//        1≤x,y≤100
//        1
//        ≤
//        x
//                r
//                ,
//                y
//r
//,
//D
//≤
//        10
//        1≤x
//        r
//​
//        ,y
//        r
//​
//        ,D≤10
//Sample 1:
//Input
//        Output
//3
//        4 2 1 1 1
//        4 2 1 3 1
//        4 2 4 2 2
//YES
//        NO
//NO
//Explanation:
//TestCase 1: Chef's food supply will last for
//        4
//        1
//        =
//        4
//        1
//        4
//        ​
//        =4 days and water supply will last for
//        2
//        1
//        =
//        2
//        1
//        2
//        ​
//        =2 days, so in total he will be able to survive for
//m
//        i
//n
//        (
//4
//        ,
//        2
//        )
//=
//        2
//min(4,2)=2 days and since required time to reach the shore is
//1
//        1 day, he will be able to reach there.
//
//        TestCase 2: Chef's food supply will last for
//        4
//        1
//        =
//        4
//        1
//        4
//        ​
//        =4 days and water supply will last for
//        2
//        3
//        =
//        0.67
//        3
//        2
//        ​
//        =0.67 days, so in total he will be able to survive for
//m
//        i
//n
//        (
//4
//        ,
//        0.67
//        )
//=
//        0.67
//min(4,0.67)=0.67 days and since required time to reach the shore is
//1
//        1 day, he won't be able to reach there.
//
//TestCase 3: Chef's food supply will last for
//        4
//        4
//        =
//        1
//        4
//        4
//        ​
//        =1 day and water supply will also last for
//        2
//        2
//        =
//        1
//        2
//        2
//        ​
//        =1 day, so in total he will be able to survive for
//m
//        i
//n
//        (
//1
//        ,
//        1
//        )
//=
//        1
//min(1,1)=1 day and since required time to reach the shore is
//2
//        2 days, he won't be able to reach there.

package CodeChef_500_1000;

import java.util.Scanner;

public class ChefIsland {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int x = read.nextInt();
            int y = read.nextInt();
            int x1 = read.nextInt();
            int y1 = read.nextInt();
            int D = read.nextInt();

            double FoodSupplyLast = (double) x/x1;
            double waterSupplyLast = (double) y/y1;

            double totalSupply = Math.min(FoodSupplyLast, waterSupplyLast);

            if (totalSupply >= D){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
