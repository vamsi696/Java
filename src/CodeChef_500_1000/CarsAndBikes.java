//Cars and Bikes
//Read problems statements in Russian and Bengali.
//Chef opened a company which manufactures cars and bikes. Each car requires
//4
//        4 tyres while each bike requires
//2
//        2 tyres. Chef has a total of
//        N
//N tyres (
//        N
//                N is even). He wants to manufacture maximum number of cars from these tyres and then manufacture bikes from the remaining tyres.
//
//        Chef's friend went to Chef to purchase a bike. If Chef's company has manufactured even a single bike then Chef's friend will be able to purchase it.
//
//Determine whether he will be able to purchase the bike or not.
//
//Input Format
//The first line contains an integer
//T
//T denoting the number of test cases. The
//        T
//T test cases then follow.
//The first line of each test case contains an integer
//        N
//N denoting the number of tyres.
//Output Format
//For each test case, output YES or NO depending on whether Chef's friend will be able to purchase the bike or not. Output is case insensitive.
//
//Constraints
//1
//        ≤
//T
//≤
//        100
//        1≤T≤100
//        2
//        ≤
//N
//≤
//        1000
//        2≤N≤1000
//N
//N is even
//Sample 1:
//Input
//        Output
//3
//        8
//        2
//        6
//NO
//        YES
//YES
//Explanation:
//For the first test case Chef, will manufacture
//2
//        2 cars and will thus use all the
//8
//        8 tyres and thus could not manufacture any bike.
//
//For the second test case, Chef cannot manufacture any car since there are not enough tyres and will thus manufacture only a single bike which will be purchased by Chef's friend.
//
//For the third test case, Chef will manufacture
//1
//        1 car and thus use
//4
//        4 tyres. From the remaining
//2
//        2 tyres, Chef can manufacture a single bike which will be purchased by Chef's friend.


package CodeChef_500_1000;

import java.util.Scanner;

public class CarsAndBikes {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t>0){
            int n = read.nextInt();

            if (n%4==0){
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
