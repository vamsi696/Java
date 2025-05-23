//Cyclic Quadrilateral
//Read problem statements in Mandarin Chinese, Russian, and Vietnamese as well.
//You are given the sizes of angles of a simple quadrilateral (in degrees)
//        A
//                A,
//                B
//B,
//C
//C and
//D
//D, in some order along its perimeter. Determine whether the quadrilateral is cyclic.
//
//Note: A quadrilateral is cyclic if and only if the sum of opposite angles is
//18
//        0
//        ∘
//        180
//        ∘
//        .
//
//Input
//The first line of the input contains a single integer
//T
//T denoting the number of test cases. The description of
//        T
//T test cases follows.
//The first and only line of each test case contains four space-separated integers
//        A
//                A,
//                B
//B,
//C
//C and
//D
//D.
//        Output
//Print a single line containing the string "YES" if the given quadrilateral is cyclic or "NO" if it is not (without quotes).
//
//You may print each character of the string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).
//
//Constraints
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
//A
//,
//B
//,
//C
//,
//D
//≤
//        357
//        1≤A,B,C,D≤357
//A
//+
//B
//+
//C
//+
//D
//=
//        360
//A+B+C+D=360
//Sample 1:
//Input
//        Output
//3
//        10 20 30 300
//        10 20 170 160
//        179 1 179 1
//NO
//        YES
//NO
//Explanation:
//Example case 1: The sum of two opposite angles
//A
//+
//C
//=
//        1
//        0
//        ∘
//        +
//        3
//        0
//        ∘
//        ≠
//        18
//        0
//        ∘
//A+C=10
//        ∘
//        +30
//        ∘
//        =180
//        ∘
//        .
//
//Example case 2: The sum of two opposite angles
//A
//+
//C
//=
//        1
//        0
//        ∘
//        +
//        17
//        0
//        ∘
//        =
//        18
//        0
//        ∘
//A+C=10
//        ∘
//        +170
//        ∘
//        =180
//        ∘
//and
//        B
//+
//D
//=
//        2
//        0
//        ∘
//        +
//        16
//        0
//        ∘
//        =
//        18
//        0
//        ∘
//B+D=20
//        ∘
//        +160
//        ∘
//        =180
//        ∘
//        .
//
//Example case 3: The sum of two opposite angles
//B
//+
//D
//=
//        1
//        ∘
//        +
//        1
//        ∘
//        ≠
//        18
//        0
//        ∘
//B+D=1
//        ∘
//        +1
//        ∘
//        =180
//        ∘
//        .

package CodeChef_500_1000;

import java.util.Scanner;

public class CyclicQuadrilateral {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int a = read.nextInt();
            int b = read.nextInt();
            int c = read.nextInt();
            int d = read.nextInt();

            int firstAngle = a + c;
            int secondAngle = b + d;

            if (firstAngle == 180 && secondAngle == 180){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
