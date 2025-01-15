//Task
//Update the method given in the IDE to output the following to the IDE by printing from inside the method.
//
//A
//2
//        +
//        2
//        ∗
//A
//∗
//B
//+
//B
//2
//A
//2
//        +2∗A∗B+B
//2
//
//A
//+
//B
//A+B
//Check sample output below.
//
//Sample 1:
//Input
//        Output
//3 5
//        2 7
//        4 1
//        64
//        8
//        81
//        9
//        25
//        5

package Methods;

import java.util.Scanner;

public class Return_Value {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n = 3;

        for (int i = 0; i < n; i++){
            int A = read.nextInt();
            int B = read.nextInt();
            computeValue(A, B);
        }
    }

    public static void computeValue(int a, int b){
        int wholeSquare = (a * a) + (2 * a * b) + (b * b);
        int concatianation = a + b;

        System.out.println(wholeSquare);
        System.out.println(concatianation);
    }
}
