//Credits
//The code given in the IDE is incorrect - Try and debug this program!!!
//
//In the current semester, you have taken
//X
//X RTP courses,
//Y
//Y Audit courses and
//Z
//Z Non-RTP courses.
//The credit distribution for the courses are:
//
//        4
//        4 credits for clearing each RTP course,
//2
//        2 credits for clearing each Audit course,
//0
//        0 credits for clearing a Non-RTP course.
//Assuming that you cleared all your courses, report the number of credits you obtain this semester.
//
//        Input format
//The first line of input will contain an integer
//        T
//T — the number of test cases.
//The first and only line of each test case contains three integers
//        X
//X,
//Y
//Y and
//Z
//        Z
//Output format
//For each test case, output on a new line the number of credits you obtain this semester.
//        Sample 1:
//Input
//        Output
//2
//        6 6 5
//        8 7 2
//        36
//        46
//Explanation:
//Test case
//        1
//        1: You obtain
//4
//        4 credits for each of the RTP courses, accounting for
//        4
//        ⋅
//        6
//        =
//        24
//        4⋅6=24 credits. You also obtain
//2
//        2 credits for each audit course, accounting for
//        2
//        ⋅
//        6
//        =
//        12
//        2⋅6=12 credits. Finally, you get
//0
//        0 credits for each of the non-RTP courses, accounting for
//        0
//        ⋅
//        5
//        =
//        0
//        0⋅5=0 credits. This accounts for a total of
//24
//        +
//        12
//        +
//        0
//        =
//        36
//        24+12+0=36 credits.
//
//        Test case
//        2
//        2: You obtain
//4
//        4 credits for each of the RTP courses, accounting for
//        4
//        ⋅
//        8
//        =
//        32
//        4⋅8=32 credits. You also obtain
//2
//        2 credits for each audit course, accounting for
//        2
//        ⋅
//        7
//        =
//        14
//        2⋅7=14 credits. Finally, you get
//0
//        0 credits for each of the non-RTP courses, accounting for
//        0
//        ⋅
//        2
//        =
//        0
//        0⋅2=0 credits. This accounts for a total of
//32
//        +
//        14
//        +
//        0
//        =
//        46
//        32+14+0=46 credits.

package CodeChef_500_1000;

import java.util.Scanner;

public class Credits {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int x = read.nextInt();
            int y = read.nextInt();
            int z = read.nextInt();

            int totalCredits = 4*x + 2*y + 0*z;

            System.out.println(totalCredits);
        }
    }
}
