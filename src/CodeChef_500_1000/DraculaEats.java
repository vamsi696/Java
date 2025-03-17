//Dracula Eats
//Eat, drink, and be scary
//
//There are
//N
//N spooky days left until Halloween.
//Dracula dines at a mysterious restaurant that changes its spooky menu daily. He particularly enjoys what they serve on Tuesday.
//
//Today is Monday, so he wishes to calculate how many times he can indulge in his favourite menu in the next
//N
//N days (including today) before Halloween.
//
//Note that Dracula follows the standard
//7
//        7-day calendar, with Tuesday immediately following Monday.
//
//Input Format
//The first line of input will contain a single integer
//T
//T, denoting the number of test cases.
//The only line of each test case contains a single integer
//N
//N, denoting the number of spooky days.
//Output Format
//For each test case, output on a new line the number of times Dracula would have had his favorite meal after
//        N
//N days.
//
//Constraints
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
//        1000
//        1≤N≤1000
//Sample 1:
//Input
//        Output
//4
//        1
//        10
//        15
//        16
//        0
//        2
//        2
//        3
//Explanation:
//Test case
//        1
//        1: The first day is Monday, and Dracula has only one day. So, no Tuesdays are encountered, and the answer is
//0
//        0.
//
//Test case
//        2
//        2: The first day is Monday, so the second and ninth days are Tuesdays.
//Dracula can eat his favorite meal twice.
//
//        Test case
//        3
//        3: Once again, the second and ninth days are Tuesday, so in
//15
//        15 days, Dracula still gets to eat his favorite meal only twice.
//
//Test case
//        4
//        4: After the ninth day, the
//16
//        16-th day is also a Tuesday. So, this time Dracula gets to eat his favorite meal three times - on days
//2
//        ,
//        9
//        ,
//        16
//        2,9,16.

package CodeChef_500_1000;

import java.util.Scanner;

public class DraculaEats {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int n = read.nextInt();
            int favouriteEats;
            if (n <= 1){
                System.out.println("0");
            } else {
                favouriteEats = (n - 1 + 6)/7;
                System.out.println(favouriteEats);
            }
        }
    }
}
