//Mario and Transformation
//Mario transforms each time he eats a mushroom as follows:
//
//If he is currently small, he turns normal.
//If he is currently normal, he turns huge.
//If he is currently huge, he turns small.
//Given that Mario was initially normal, find his size after eating
//X
//X mushrooms.
//
//Input Format
//The first line of input will contain one integer
//        T
//T, the number of test cases. Then the test cases follow.
//Each test case contains a single line of input, containing one integer
//X
//X.
//        Output Format
//For each test case, output in a single line Mario's size after eating
//X
//X mushrooms.
//
//Print:
//
//NORMAL
//NORMAL, if his final size is normal.
//        HUGE
//HUGE, if his final size is huge.
//        SMALL
//SMALL, if his final size is small.
//You may print each character of the answer in either uppercase or lowercase (for example, the strings
//Huge
//        Huge,
//                                                                             hUgE
//                                                                                     hUgE,
//                                                                             huge
//                                                                                     huge and
//                                                                                     HUGE
//                                                                                     HUGE will all be treated as identical).
//
//Constraints
//1
//        ≤
//T
//≤
//        100
//        1≤T≤100
//        1
//        ≤
//X
//≤
//        100
//        1≤X≤100
//Sample 1:
//Input
//        Output
//3
//        2
//        4
//        12
//SMALL
//        HUGE
//NORMAL
//Explanation:
//Test case
//        1
//        1: Mario's initial size is normal. On eating the first mushroom, he turns huge. On eating the second mushroom, he turns small.
//
//Test case
//        2
//        2: Mario's initial size is normal. On eating the first mushroom, he turns huge. On eating the second mushroom, he turns small. On eating the third mushroom, he turns normal. On eating the fourth mushroom, he turns huge.

package CodeChef_500_1000;

import java.util.Scanner;

public class MarioTranformation {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int x = read.nextInt();

            if (x%3==0){
                System.out.println("Normal");
            } else if (x%3==1){
                System.out.println("Huge");
            } else {
                System.out.println("Small");
            }
        }
    }
}
