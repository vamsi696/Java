//Test Score
//In a test, there are
//N
//        N problems, each carrying
//        X
//X marks.
//In each problem, Chef either received
//        X
//X marks or
//0
//        0 marks.
//
//Determine whether is it possible for Chef to achieve exactly
//Y
//Y marks.
//
//Input Format
//The first line of input will contain a single integer
//T
//T, denoting the number of test cases.
//Each test case consists of three integers
//N
//,
//X
//,
//N,X, and
//        Y
//Y, the number of problems, the maximum score for each problem, and the score Chef wants.
//Output Format
//For each test case, output YES if Chef can achieve exactly
//Y
//        Y marks, NO otherwise.
//
//You can print each character of the string in uppercase or lowercase. For example, the strings Yes, YES, yes, and yEs, are all considered identical.
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
//≤
//        10
//        1≤N≤10
//        1
//        ≤
//X
//≤
//        10
//        1≤X≤10
//        0
//        ≤
//Y
//≤
//N
//⋅
//X
//0≤Y≤N⋅X
//Sample 1:
//Input
//        Output
//5
//        1 8 4
//        3 6 12
//        4 5 0
//        10 10 100
//        8 5 36
//NO
//        YES
//YES
//        YES
//NO
//Explanation:
//Test case
//        1
//        1: There is no way for Chef to score exactly
//4
//        4 marks.
//
//        Test case
//        2
//        2: Chef can score
//12
//        12 marks by receiving
//6
//        6 marks in
//2
//        2 problems and
//0
//        0 marks in
//1
//        1 problem.
//
//        Test case
//        3
//        3: Chef can score
//0
//        0 marks by receiving
//0
//        0 marks in each of the
//4
//        4 problems.
//
//        Test case
//        4
//        4: Chef can score
//100
//        100 marks by receiving
//10
//        10 marks in each of the
//10
//        10 problems.
//
//        Test case
//        5
//        5: There is no way for Chef to score exactly
//36
//        36 marks.

package CodeChef_500_1000;

import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int n = read.nextInt();
            int x = read.nextInt();
            int y = read.nextInt();

            if (y%x==0 && y <= n*x){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
