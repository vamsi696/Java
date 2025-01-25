//Oneful Pairs
//Chef defines a pair of positive integers
//        (
//                a
//                ,
//                b
//                )
//(a,b) to be a
//Oneful Pair
//Oneful Pair, if
//
//a
//+
//b
//+
//        (
//a
//⋅
//b
//)
//        =
//        111
//a+b+(a⋅b)=111
//
//For example,
//(
//        1
//        ,
//        55
//        )
//        (1,55) is a
//Oneful Pair
//        Oneful Pair, since
//1
//        +
//        55
//        +
//        (
//        1
//        ⋅
//        55
//        )
//        =
//        56
//        +
//        55
//        =
//        111
//        1+55+(1⋅55)=56+55=111.
//But
//        (
//1
//        ,
//        56
//        )
//(1,56) is not a
//Oneful Pair
//        Oneful Pair, since
//1
//        +
//        56
//        +
//        (
//        1
//        ⋅
//        56
//        )
//        =
//        57
//        +
//        56
//        =
//        113
//        ≠
//        111
//        1+56+(1⋅56)=57+56=113=111.
//
//Given two positive integers
//a
//a and
//b
//b, output Yes if they are a
//Oneful Pair
//Oneful Pair. And No otherwise.
//
//        Input Format
//The only line of input contains two space-separated integers
//a
//a and
//b
//b.
//
//        Output Format
//Output Yes, if
//        (
//a
//,
//b
//)
//        (a,b) form a
//Oneful Pair
//Oneful Pair. Output No if they do not.
//
//You may print each character of Yes and No in uppercase or lowercase (for example, yes, yEs, Yes will be considered identical).
//
//Constraints
//1
//        ≤
//a
//,
//b
//≤
//        1000
//        1≤a,b≤1000
//Sample 1:
//Input
//        Output
//1 55
//Yes
//Explanation:
//        (
//        1
//        ,
//        55
//        )
//        (1,55) is a
//Oneful Pair
//        Oneful Pair, since
//1
//        +
//        55
//        +
//        (
//        1
//        ⋅
//        55
//        )
//        =
//        56
//        +
//        55
//        =
//        111
//        1+55+(1⋅55)=56+55=111.
//
//Sample 2:
//Input
//        Output
//1 56
//No
//Explanation:
//        (
//        1
//        ,
//        56
//        )
//        (1,56) is not a
//Oneful Pair
//        Oneful Pair, since
//1
//        +
//        56
//        +
//        (
//        1
//        ⋅
//        56
//        )
//        =
//        57
//        +
//        56
//        =
//        113
//        ≠
//        111
//        1+56+(1⋅56)=57+56=113=111

package CodeChef_500_1000;

import java.util.Scanner;

public class Oneful_Pair {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int x = read.nextInt();
        int y = read.nextInt();

        int oneful_Pair = x + y + (x * y);

        if (oneful_Pair == 111){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
