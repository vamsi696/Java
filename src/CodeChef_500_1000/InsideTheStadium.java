//Inside The Stadium
//Shubman Gill is playing an international match.
//He played a total of
//        N
//        N balls, where, in the
//        i
//t
//        h
//i
//        th
//ball, he scored
//A
//        i
//A
//        i
//​
//runs.
//
//The strike rate of a player is calculated as :
//no. of runs
//no. of balls played
//×
//        100
//no. of balls played
//no. of runs
//​
//        ×100.
//
//Preet, a math enthusiast, is currently watching the match. Help him find the number of times, Shubman's strike rate became exactly
//        100
//        100.
//
//Input Format
//The first line of input will contain a single integer
//T
//T, denoting the number of test cases.
//Each test case consists of multiple lines of input.
//The first line of each test case contains an integer
//        N
//N - the total number of balls played by Gill.
//The second line of each test case contains
//        N
//N space-separated integers where
//        A
//i
//        A
//i
//​
//denotes runs scored on
//i
//        t
//h
//        i
//th
//ball.
//        Output Format
//For each test case, output on a new line, the total number of times the strike rate of Gill became
//100
//        100.
//
//Constraints
//1
//        ≤
//T
//≤
//        10
//        5
//        1≤T≤10
//        5
//
//        1
//        ≤
//N
//≤
//        10
//        5
//        1≤N≤10
//        5
//
//        0
//        ≤
//A
//        i
//≤
//        6
//        0≤A
//        i
//​
//        ≤6
//The sum of
//        N
//N over all test cases won't exceed
//        10
//        6
//        10
//        6
//        .
//Sample 1:
//Input
//        Output
//3
//        4
//        1 0 2 3
//        5
//        2 6 0 1 0
//        3
//        1 1 1
//        2
//        0
//        3
//Explanation:
//Test case
//        1
//        1: Shubhman's strike rate would be:
//
//After
//1
//        1 ball:
//        1
//        1
//        ×
//        100
//        =
//        100
//        1
//        1
//        ​
//        ×100=100.
//After
//2
//        2 balls:
//        1
//        2
//        ×
//        100
//        =
//        50
//        2
//        1
//        ​
//        ×100=50.
//After
//3
//        3 balls:
//        3
//        3
//        ×
//        100
//        =
//        100
//        3
//        3
//        ​
//        ×100=100.
//After
//4
//        4 balls:
//        6
//        4
//        ×
//        100
//        =
//        150
//        4
//        6
//        ​
//        ×100=150.
//Thus, the strike rate was exactly
//100
//        100 twice.
//
//        Test case
//        2
//        2: Shubhman's strike rate would be:
//
//After
//1
//        1 ball:
//        2
//        1
//        ×
//        100
//        =
//        200
//        1
//        2
//        ​
//        ×100=200.
//After
//2
//        2 balls:
//        8
//        2
//        ×
//        100
//        =
//        400
//        2
//        8
//        ​
//        ×100=400.
//After
//3
//        3 balls:
//        8
//        3
//        ×
//        100
//        =
//        266.66
//        3
//        8
//        ​
//        ×100=266.66.
//After
//4
//        4 balls:
//        9
//        4
//        ×
//        100
//        =
//        225
//        4
//        9
//        ​
//        ×100=225.
//After
//5
//        5 balls:
//        9
//        5
//        ×
//        100
//        =
//        180
//        5
//        9
//        ​
//        ×100=180.
//Thus the strike rate was never exactly
//100
//        100.


package CodeChef_500_1000;

import java.util.Scanner;

public class InsideTheStadium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i<n;i++){
                arr[i] = sc.nextInt();
            }

            int runs = 0;
            int count = 0;

            for (int i = 0; i < n; i++){
                runs += arr[i];
                if (runs == i +1){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
