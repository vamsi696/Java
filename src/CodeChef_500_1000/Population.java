//Population
//The code given in the IDE is incorrect - Try and debug this program!!!
//
//Problem statement
//There were initially
//        X
//X million people in a town, out of which
//Y
//Y million people left the town and
//        Z
//Z million people immigrated to this town.
//Determine the final population of the town in millions.
//
//Input format
//The first line of input will contain an integer
//        T
//T — the number of test cases.
//The first and only line of each test case contains three integers
//        X
//X,
//Y
//Y and
//Z
//Z.
//        Output format
//For each test case, output on a new line the final population of the town
//Sample 1:
//Input
//        Output
//2
//        3 1 2
//        2 2 2
//        4
//        2
//Explanation:
//Test case
//        1
//        1: The initial population of the town was
//3
//        3 million, out of which
//1
//        1 million people left and
//2
//        2 million people entered the town. So, final population
//=
//        3
//        −
//        1
//        +
//        2
//        =
//        4
//        =3−1+2=4 million.
//
//        Test case
//        2
//        2: The initial population of the town was
//2
//        2 million, out of which
//2
//        2 million left and
//2
//        2 million immigrated. The final population is thus
//2
//        +
//        2
//        −
//        2
//        =
//        2
//        2+2−2=2 million.

package CodeChef_500_1000;

import java.util.Scanner;

public class Population {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        for (int i = 0; i<t; i++){
            int x = read.nextInt();
            int y = read.nextInt();
            int z = read.nextInt();

            int peopleLeftTheTown = x - y;
            int totalPopulationOfTown = peopleLeftTheTown + z;

            System.out.println(totalPopulationOfTown);
        }
    }
}
