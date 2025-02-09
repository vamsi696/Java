//(Farm animals) - Solve the complete problem
//        In Chefland, each chicken has
//X
//X legs and each duck has
//Y
//Y legs.
//Chef's farm can have exactly one type of bird.
//Given that the birds on the farm have a total of
//        Z
//Z legs:
//
//Print CHICKEN, if the farm can have only chickens but not ducks.
//Print DUCK, if the farm can have only ducks but not chickens.
//Print ANY, if the farm can have either chickens or ducks.
//Print NONE, if the farm can have neither chickens nor ducks.
//Input format
//
//The first line will contain
//        T
//T, the number of test cases. Then the test cases follow.
//Each test case consists of a single line of input, containing three space-separated integers
//X
//,
//Y
//,
//Z
//X,Y,Z.
//        Sample 1:
//Input
//        Output
//3
//        2 3 5
//        2 2 2
//        3 4 6
//NONE
//        ANY
//CHICKEN
//Explanation:
//Test case
//        1
//        1: There are
//5
//        5 legs on the farm. Each chicken has
//2
//        2 legs and each duck has
//3
//        3 legs. Thus, the farm can have neither chickens nor ducks.
//
//Test case
//        2
//        2: There are
//2
//        2 legs on the farm. Each chicken has
//2
//        2 legs and each duck has
//2
//        2 legs. Thus, the farm can have any bird among chicken and duck.
//
//Test case
//        3
//        3: There are
//6
//        6 legs on the farm. Each chicken has
//3
//        3 legs and each duck has
//4
//        4 legs. Thus, the farm can have chicken only.

package CodeChef_500_1000;

import java.util.Scanner;

public class FarmAnimals {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int x = read.nextInt();
            int y = read.nextInt();
            int z = read.nextInt();

            if (z%x != 0 && z%y != 0){
                System.out.println("None");
            } else if (z%x == 0 && z%y == 0) {
                System.out.println("Any");
            } else if (z%x == 0){
                System.out.println("Chicken");
            } else {
                System.out.println("Duck");
            }
        }
    }
}
