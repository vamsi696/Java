//Speciality
//On every CodeChef user's profile page, the list of problems that they have set, tested, and written editorials for, is listed at the bottom.
//
//Given the number of problems in each of these
//3
//        3 categories as
//X
//,
//Y
//,
//X,Y, and
//        Z
//Z respectively (where all three integers are distinct), find if the user has been most active as a Setter, Tester, or Editorialist.
//
//Input Format
//The first line of input will contain a single integer
//T
//T, denoting the number of test cases.
//Each test case consists of three space-separated integers
//X
//,
//Y
//,
//X,Y, and
//        Z
//Z - the number of problems they have set, tested, and written editorials for.
//Output Format
//For each test case, output in a new line:
//
//Setter, if the user has been most active as a setter.
//        Tester, if the user has been most active as a tester.
//        Editorialist, if the user has been most active as an editorialist.
//Note that the output is case-insensitive. Thus, the strings SETTER, setter, seTTer, and Setter are all considered the same.
//
//        Constraints
//1
//        ≤
//T
//≤
//        1
//        0
//        4
//        1≤T≤10
//        4
//
//        1
//        ≤
//X
//,
//Y
//,
//Z
//≤
//        100
//        1≤X,Y,Z≤100, where
//        X
//        ,
//        Y
//        ,
//        X,Y, and
//Z
//Z are distinct.
//        Sample 1:
//Input
//        Output
//4
//        5 3 2
//        1 2 4
//        2 5 1
//        9 4 5
//Setter
//        Editorialist
//Tester
//        Setter
//Explanation:
//Test case
//        1
//        1: The number of problems that the user has set is greater than the number of problems tested or written editorials for. Thus, the user is most active as setter.
//
//        Test case
//        2
//        2: The number of problems that the user has written editorials for, is greater than the number of problems set or tested. Thus, the user is most active as editorialist.
//
//        Test case
//        3
//        3: The number of problems that the user has tested is greater than the number of problems set or written editorials for. Thus, the user is most active as tester.
//
//        Test case
//        4
//        4: The number of problems that the user has set is greater than the number of problems tested or written editorials for. Thus, the user is most active as setter.

package CodeChef_500_1000;

import java.util.Scanner;

public class Specalist {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int x = read.nextInt();
            int y = read.nextInt();
            int z = read.nextInt();

            if (x >= y && x >= z){
                System.out.println("Setter");
            } else if (y >= x && y >= z){
                System.out.println("Tester");
            } else {
                System.out.println("Editorialist");
            }
        }
    }
}
