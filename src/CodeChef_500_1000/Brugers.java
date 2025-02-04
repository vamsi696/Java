//Burgers
//Chef has
//A
//A patties and
//        B
//B buns.
//To make
//1
//        1 burger, Chef needs
//1
//        1 patty and
//1
//        1 bun.
//Find the maximum number of burgers that Chef can make.
//
//Input Format
//The first line of input will contain an integer
//        T
//T — the number of test cases.
//The first and only line of each test case contains two space-separated integers
//A
//A and
//B
//B, the number of patties and buns respectively.
//        Output Format
//For each test case, output the maximum number of burgers that Chef can make.
//
//Sample 1:
//Input
//        Output
//3
//        2 2
//        2 3
//        23 17
//        2
//        2
//        17
//Explanation:
//Test case
//        1
//        1: Chef has
//2
//        2 patties and
//2
//        2 buns, and therefore Chef can make
//2
//        2 burgers.
//
//        Test case
//        2
//        2: Chef has
//2
//        2 patties and
//3
//        3 buns. Chef can make at most
//2
//        2 burgers by using
//2
//        2 patties and
//2
//        2 buns.
//
//        Test case
//        3
//        3: Chef has
//23
//        23 patties and
//17
//        17 buns. Chef can make at most
//17
//        17 burgers by using
//17
//        17 patties and
//17
//        17 buns.

package CodeChef_500_1000;

import java.util.Scanner;

public class Brugers {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int a = read.nextInt();
            int b = read.nextInt();

            int noOfBurgers = Math.min(a, b);
            System.out.println(noOfBurgers);
        }
    }
}
