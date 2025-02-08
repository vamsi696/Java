//Apples and Oranges
//Bob has
//X
//X rupees and goes to a market.
//The cost of apples is Rs.
//A
//A per kg and the cost of oranges is Rs.
//B
//B per kg.
//Determine whether he can buy at least
//1
//        1 kg each of apples and oranges.
//
//Note - this problem does not have multiple test cases. t is not a part of the input
//
//Input Format
//The first line of input will contain an integer
//        X
//X, the amount of money Bob has.
//The second line of input contains two space-separated integers
//A
//A and
//B
//B, the cost per kg of apples and oranges respectively.
//        Output Format
//Print a single line containing 'Yes' if Bob can buy the fruits and 'No' otherwise.
//
//        Subtasks
//Subtask 1 (100 points):
//Original constraints.
//Sample 1:
//Input
//        Output
//14
//        2 2
//Yes
//Explanation:
//The cost of buying
//1
//        1 kg each of apple and orange is
//2
//        +
//        2
//        =
//        4
//        2+2=4. Since Bob has more than
//4
//        4 rupees, the answer will be Yes.
//
//        Sample 2:
//Input
//        Output
//5
//        3 2
//Yes
//Explanation:
//The cost of buying
//1
//        1 kg each of apple and orange is
//3
//        +
//        2
//        =
//        5
//        3+2=5. Since Bob has exactly
//5
//        5 rupees, the answer will be Yes.

package CodeChef_500_1000;

import java.util.Scanner;

public class Apples_Oranges {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int x = read.nextInt();
        int a = read.nextInt();
        int b = read.nextInt();

        if (x >= a + b){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
