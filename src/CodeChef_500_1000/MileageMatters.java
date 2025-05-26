//Mileage matters
//Chef wants to rent a car to travel to his restaurant which is
//        N
//N kilometers away. He can either rent a petrol car or a diesel car.
//
//One litre of petrol costs
//        X
//X rupees and one litre of diesel costs
//Y
//Y rupees. Chef can travel
//        A
//A kilometers with one litre of petrol and
//B
//B kilometers with one litre of diesel.
//
//Chef can buy petrol and diesel in any amount, not necessarily integer. For example, if
//X
//=
//        95
//X=95, Chef can buy half a litre of petrol by paying
//95
//        /
//        2
//        =
//        47.5
//        95/2=47.5 rupees.
//
//Which car should the chef rent in order to minimize the cost of his travel?
//
//Input Format
//The first line of input will contain a single integer
//T
//T, denoting the number of test cases.
//The first and only line of each test case contains
//5
//        5 space-separated integers,
//        N
//        ,
//        X
//        ,
//        Y
//        ,
//        A
//        ,
//        N,X,Y,A, and
//B
//B - distance that chef needs to travel, the per litre prices of petrol and diesel and the distance chef can travel using one litre of petrol and diesel respectively.
//        Output Format
//For each test case, output on a new line PETROL if the cost of travel is less using petrol car, DIESEL if the cost of travel is less using diesel car or ANY if cost of travel is same in both the cases.
//
//You may print each character of the string in either uppercase or lowercase (for example, the strings PETrol, petrol, Petrol, and PETROL will all be treated as identical).
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
//N
//,
//x
//,
//y
//,
//a
//,
//b
//≤
//        100
//        1≤N,x,y,a,b≤100
//Sample 1:
//Input
//        Output
//4
//        20 10 8 2 4
//        50 12 12 4 3
//        40 3 15 8 40
//        21 9 9 2 9
//DIESEL
//        PETROL
//ANY
//        DIESEL
//Explanation:
//Test case
//        1
//        1: The cost of travelling by the petrol car will be
//100
//        100 rupees while that of using the diesel car will be
//40
//        40 rupees. Hence, diesel car is better.
//
//Test case
//        2
//        2: The cost of travelling by the petrol car will be
//150
//        150 rupees while that of using the diesel car will be
//200
//        200 rupees. Hence, petrol car is better.
//
//Test case
//        3
//        3: The cost of travel for petrol and diesel car will be
//15
//        15 rupees.
//
//        Test case
//        4
//        4: The cost of travelling by the petrol car will be
//94.5
//        94.5 rupees while that of using the diesel car will be
//21
//        21 rupees. Hence, diesel car is better.

package CodeChef_500_1000;

import java.util.Scanner;

public class MileageMatters {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-->0){
            int n = read.nextInt();
            int x = read.nextInt();
            int y = read.nextInt();
            int a = read.nextInt();
            int b = read.nextInt();

            double totalPetrolCost = (double)n / a * x;
            double totalDieselCost = (double)n / b * y;

            if (totalPetrolCost < totalDieselCost){
                System.out.println("Petrol");
            } else if (totalPetrolCost > totalDieselCost){
                System.out.println("Diesel");
            } else {
                System.out.println("Any");
            }
        }
    }
}
