//Bus Seat Numbering
//There is a bus with 30 seats. The seats are numbered from 1 to 30, and the numbering is as depicted in this image.
//
//
//As can be seen in the image, the bus is divided into two decks - The Lower deck, and the Upper deck, with 15 seats each. And some of the seats come as Single and some as Double. For example, Seats 1 and 2 are Double, whereas Seat 11 is a Single.
//
//You will be given a Seat number, and your job is to classify it as one of these 4 types:
//
//Lower Single
//Lower Double
//Upper Single
//Upper Double
//Input Format
//The first line of input will contain a single integer
//T
//T, denoting the number of test cases.
//Each test case consists of a single line of input which contains a single integers
//N
//N — the seat number.
//        Output Format
//For each test case, output on a new line, the type of seat.
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
//        30
//        1≤N≤30
//Sample 1:
//Input
//        Output
//5
//        6
//        28
//        16
//        13
//        10
//Lower Double
//Upper Single
//Upper Double
//Lower Single
//Lower Double
//Explanation:
//Testcase 1: The seat number 6 is in the Lower deck, and it is a Double. Hence the output is "Lower Double".
//
//Testcase 2: The seat number 28 is in the Upper deck, and it is a Single. Hence the output is "Upper Single".
//
//Testcase 3: The seat number 16 is in the Upper deck, and it is a Double. Hence the output is "Upper Double".
//
//Testcase 4: The seat number 13 is in the Lower deck, and it is a Single. Hence the output is "Lower Single".
//
//Testcase 5: The seat number 10 is in the Lower deck, and it is a Double. Hence the output is "Lower Double".

package CodeChef_500_1000;

import java.util.Scanner;

public class BusSeatNumbering {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int n = read.nextInt();

            if (n <= 10){
                System.out.println("Lower Double");
            } else if (n > 10 && n <= 15){
                System.out.println("Lower Single");
            } else if (n > 15 && n <= 25){
                System.out.println("Upper Double");
            } else {
                System.out.println("Upper single");
            }
        }
    }
}
