//Circular Track
//There is a circular track of length
//        M
//M consisting of
//        M
//M checkpoints and
//        M
//M bidirectional roads such that each road has a length of
//1
//        1 unit.
//
//
//
//Chef is currently at checkpoint
//        A
//A and wants to reach checkpoint
//B
//B. Find the minimum length of the road he needs to travel.
//
//        Input Format
//First line will contain
//T
//T, the number of test cases. Then the test cases follow.
//Each test case contains a single line of input, three integers
//        A
//        ,
//        B
//        ,
//        A,B, and
//M
//M - the initial checkpoint, the final checkpoint, and the total number of checkpoints respectively.
//        Output Format
//For each test case, output the minimum length Chef needs to travel.
//
//Constraints
//1
//        ≤
//T
//≤
//        1000
//        1≤T≤1000
//        2
//        ≤
//M
//≤
//        1
//        0
//        9
//        2≤M≤10
//        9
//
//        1
//        ≤
//A
//,
//B
//≤
//M
//1≤A,B≤M
//        A
//≠
//B
//A=B
//Sample 1:
//Input
//        Output
//4
//        1 3 100
//        1 98 100
//        40 30 50
//        2 1 2
//        2
//        3
//        10
//        1
//Explanation:
//Test Case
//1
//        1: Chef can go from
//1
//        1 to
//3
//        3 as:
//        1
//        →
//        2
//        1→2 and then
//2
//        →
//        3
//        2→3. Thus, total length travelled is
//2
//        2 units.
//
//        Test Case
//2
//        2: Chef can go from
//1
//        1 to
//98
//        98 as:
//        98
//        ←
//        99
//        ←
//        100
//        ←
//        1
//        98←99←100←1. Thus, minimum distance travelled is
//3
//        3 units.
//
//        Test Case
//3
//        3: Chef can go from
//40
//        40 to
//30
//        30 as:
//        30
//        ←
//        31
//        ←
//        32
//        ←
//        ⋯
//        ←
//        39
//        ←
//        40
//        30←31←32←⋯←39←40. Thus, minimum distance travelled is
//10
//        10 units.
//
//        Test Case
//4
//        4: Chef can go from
//2
//        2 to
//1
//        1 as:
//        1
//        ←
//        2
//        1←2. Thus, minimum distance travelled is
//1
//        1 unit.

package CodeChef_500_1000;

import java.util.Scanner;

public class CircularTrack {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int a = read.nextInt();
            int b = read.nextInt();
            int m = read.nextInt();
            int clockWise = Math.abs(b - a);
            int antiClockwise = m - clockWise;

            int minimumScore = Math.min(clockWise, antiClockwise);
            System.out.println(minimumScore);
        }
    }
}
