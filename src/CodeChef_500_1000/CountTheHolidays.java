//Count the Holidays
//A particular month has
//30
//        30 days, numbered from
//1
//        1 to
//30
//        30.
//
//Day
//1
//        1 is a Monday, and the usual
//7
//        7-day week is followed (so day
//2
//        2 is Tuesday, day
//3
//                                        3 is Wednesday, and so on).
//
//Every Saturday and Sunday is a holiday. There are
//N
//N festival days, which are also holidays. Note that it is possible for a festival day to occur on a Saturday or Sunday.
//
//You are given the dates of the festivals. Determine the total number of holidays in this month.
//
//        Input Format
//The first line of input contains a single integer
//        T
//T, denoting the number of test cases. The description of
//        T
//T test cases follows.
//The first line of each test case contains an integer
//        N
//N denoting the number of festival days.
//The second line of each test case contains
//        N
//N distinct space-separated integers
//A
//1
//        ,
//A
//2
//        ,
//        …
//A
//        N
//A
//1
//        ​
//        ,A
//2
//        ​
//        ,…A
//        N
//​
//        , denoting the festival days. Note that the
//        A
//i
//        A
//i
//​
//are not necessarily given in sorted order.
//        Output Format
//For each test case, output a new line containing the total number of holidays.
//
//        Constraints
//1
//        ≤
//T
//≤
//        1000
//        1≤T≤1000
//        1
//        ≤
//N
//≤
//        30
//        1≤N≤30
//        1
//        ≤
//A
//        i
//≤
//        30
//        1≤A
//        i
//​
//        ≤30
//All the
//A
//        i
//A
//        i
//​
//are distinct
//Sample 1:
//Input
//        Output
//3
//        2
//        5 7
//        3
//        23 1 6
//        1
//        13
//        9
//        10
//        8
//Explanation:
//Test Case
//1
//        1: Days
//6
//        ,
//        13
//        ,
//        20
//        6,13,20 and
//27
//        27 are Saturdays, and days
//7
//        ,
//        14
//        ,
//        21
//        ,
//        28
//        7,14,21,28 are Sundays. The festivals fall on day
//5
//        5 and day
//7
//        7, but day
//7
//        7 is already a Sunday. This gives us
//9
//        9 holidays in total — days
//5
//        ,
//        6
//        ,
//        7
//        ,
//        13
//        ,
//        14
//        ,
//        20
//        ,
//        21
//        ,
//        27
//        ,
//        28
//        5,6,7,13,14,20,21,27,28.
//
//Test Case
//2
//        2: Days
//6
//        ,
//        13
//        ,
//        20
//        6,13,20 and
//27
//        27 are Saturdays, and days
//7
//        ,
//        14
//        ,
//        21
//        ,
//        28
//        7,14,21,28 are Sundays. The festivals fall on day
//1
//        1, day
//6
//        6, and day
//23
//        23. This gives us
//10
//        10 holidays in total — days
//1
//        ,
//        6
//        ,
//        7
//        ,
//        13
//        ,
//        14
//        ,
//        20
//        ,
//        21
//        ,
//        23
//        ,
//        27
//        ,
//        28
//        1,6,7,13,14,20,21,23,27,28.
//
//Test Case
//3
//        3: Days
//6
//        ,
//        13
//        ,
//        20
//        6,13,20 and
//27
//        27 are Saturdays, and days
//7
//        ,
//        14
//        ,
//        21
//        ,
//        28
//        7,14,21,28 are Sundays. The only festival is on day
//13
//        13, which is already a holiday. This gives us
//8
//        8 holidays in total — days
//6
//        ,
//        7
//        ,
//        13
//        ,
//        14
//        ,
//        20
//        ,
//        21
//        ,
//        27
//        ,
//        28
//        6,7,13,14,20,21,27,28.

package CodeChef_500_1000;

import java.util.Scanner;

public class CountTheHolidays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            int[] festival = new int[n];

            for (int i = 1; i < n; i++){
                festival[i] = sc.nextInt();
            }

            int holiday = 0;
            boolean[] isHoliday = new boolean[31];

            for (int i = 1; i <= 30; i++){
                if (i % 7 == 6 || i % 7 == 0){
                    isHoliday[i] = true;
                }
            }

            for (int festivals : festival){
                isHoliday[festivals] = true;
            }

            for (int i = 1; i <= 30; i++){
                if (isHoliday[i]){
                    holiday++;
                }
            }

            System.out.println(holiday);
        }
    }
}
