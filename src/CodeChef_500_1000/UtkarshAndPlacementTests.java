//Utkarsh and Placement tests
//Utkarsh is currently sitting for placements. He has applied to three companies named
//        A
//        ,
//        B
//A,B, and
//        C
//C.
//
//You know Utkarsh's order of preference among these
//        3
//        3 companies, given to you as characters first, second, and third respectively (where first is the company he prefers most).
//
//You also know that Utkarsh has received offers from exactly two of these three companies, given you as characters
//x
//x and
//y
//y.
//
//Utkarsh will always accept the offer from whichever company is highest on his preference list. Which company will he join?
//
//Input Format
//The first line of input contains a single integer
//        T
//T, denoting the number of test cases. The description of
//        T
//T test cases follows.
//The first line of each test case contains three different space-separated characters: first, second, and third, denoting Utkarsh's order of preference among the three companies.
//The second line of each test case contains two space-separated characters
//x
//x and
//y
//y, the companies from which Utkarsh has received offers.
//Output Format
//For each test case, print one line containing a single character, the company whose offer Utkarsh will accept.
//
//The output is not case sensitive, so if the answer is
//        A
//A, both
//        a
//a and
//A
//A will be accepted.
//
//Constraints
//1
//        ≤
//T
//≤
//        36
//        1≤T≤36
//first, second and third are three different characters among
//{
//A
//,
//B
//,
//C
//}
//        {A,B,C}.
//x
//x and
//y
//y are two different characters among
//{
//A
//,
//B
//,
//C
//}
//        {A,B,C}.
//Subtasks
//Subtask #1 (100 points): Original constraints
//
//Sample 1:
//Input
//        Output
//2
//A B C
//A B
//B C A
//A C
//A
//        C
//Explanation:
//Test Case 1. Utkarsh has received offers from
//        A
//A and
//B
//B. Of these two, he prefers company
//        A
//A (first preference) over
//B
//B (second preference). Therefore Utkarsh will accept the offer of company
//A
//A.
//
//Test Case 2. Utkarsh has received offers from
//        A
//A and
//C
//C, where company
//C
//C is his second preference and company
//        A
//A is his third preference. Utkarsh will accept the offer of company
//        C
//C.

package CodeChef_500_1000;

import java.util.Scanner;

public class UtkarshAndPlacementTests {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            char first = read.next().charAt(0);
            char second = read.next().charAt(0);
            char third = read.next().charAt(0);

            char x = read.next().charAt(0);
            char y = read.next().charAt(0);

            if (x == first || y == first){
                System.out.println(first);
            } else {
                System.out.println(second);
            }
        }
    }
}
