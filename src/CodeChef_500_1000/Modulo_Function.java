//Modulo function
//The modulo -
//        %
//        % function is helpful whenever we want to check the divisibility of 2 numbers.
//
//        Task
//There are multiple test cases denoted by the integer
//        T
//T.
//You are given 2 integers -
//A
//A and
//B
//B.
//For each test case, you need to output the following 2 space separated integers on a single line
//
//The quotient when
//        A
//A is divided by
//B
//B - i.e.
//        A
///
//B
//A/B
//The remainder when
//        A
//A is divided by
//B
//B - i.e.
//        A
//%
//B
//A%B
//Go ahead and code out the solution in the IDE.
//
//Sample 1:
//Input
//        Output
//4
//        10 5
//        11 5
//        14 5
//        15 5
//        2 0
//        2 1
//        2 4
//        3 0
//Explanation:
//function gives us the output
//0
//        0 only when
//A
//A is divisible by
//B
//        B

package CodeChef_500_1000;

import java.util.Scanner;

public class Modulo_Function {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int a = read.nextInt();
            int b = read.nextInt();

            System.out.print(a / b + " ");
            System.out.println(a % b + " ");
        }
    }
}
