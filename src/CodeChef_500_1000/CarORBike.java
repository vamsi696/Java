//Car or Bike
//Chef wants to reach home as soon as possible. He has two options:
//
//Travel with his BIKE which takes
//X
//X minutes.
//Travel with his CAR which takes
//Y
//Y minutes.
//Which of the two options is faster or do they both take same time?
//
//Input Format
//First line will contain
//T
//T, number of test cases. Then the test cases follow.
//Each test case contains a single line of input, two integers
//        X
//        ,
//        Y
//X,Y representing the time taken to travel with BIKE and CAR respectively.
//Output Format
//For each test case, print CAR if travelling with Car is faster, BIKE if travelling with Bike is faster, SAME if they both take the same time.
//
//You may print each character of CAR, BIKE and SAME in uppercase or lowercase (for example, CAR, Car, cAr will be considered identical).
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
//,
//Y
//≤
//        10
//        1≤X,Y≤10
//Sample 1:
//Input
//        Output
//3
//        1 5
//        4 2
//        6 6
//BIKE
//        CAR
//SAME
//Explanation:
//Test case-1: Travelling with BIKE takes
//1
//        1 minute while travelling with CAR takes
//5
//        5 minutes. So travelling with BIKE is faster.
//
//Test case-2: Travelling with BIKE takes
//4
//        4 minutes while travelling with CAR takes
//2
//        2 minutes. So travelling with CAR is faster.
//
//Test case-3: Travelling with both BIKE and CAR takes the SAME time i.e.
//6
//        6 minutes.
package CodeChef_500_1000;

import java.util.Scanner;

public class CarORBike {
    public static void main(String[] args) {
        Scanner  sr = new Scanner(System.in);
        int t = sr.nextInt();

        while (t-- > 0){
            int bike = sr.nextInt();
            int car = sr.nextInt();

            if (bike < car){
                System.out.println("Bike");
            } else if (bike >  car ){
                System.out.println("Car");
            } else {
                System.out.println("Same");
            }
        }
    }
}
