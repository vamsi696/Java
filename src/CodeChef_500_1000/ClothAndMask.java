//Chef and Masks
//Chef is shopping for masks. In the shop, he encounters
//2
//        2 types of masks:
//
//Disposable Masks — cost
//        X
//X but last only
//1
//        1 day.
//Cloth Masks — cost
//        Y
//Y but last
//10
//        10 days.
//Chef wants to buy masks to last him
//100
//        100 days. He will buy the masks which cost him the least. In case there is a tie in terms of cost, Chef will be eco-friendly and choose the cloth masks. Which type of mask will Chef choose?
//
//Input Format
//The first line of input will contain a single integer
//T
//T, denoting the number of test cases. Then the test cases follow.
//Each test case consists of a single line of input, containing two space-separated integers
//X
//,
//Y
//X,Y.
//        Output Format
//For each test case, if Chef buys the cloth masks print CLOTH, otherwise print DISPOSABLE.
//
//You may print each character of the string in uppercase or lowercase (for example, the strings cloth, clOTh, cLoTH, and CLOTH will all be treated as identical).
//
//Constraints
//1
//        ≤
//T
//≤
//        5000
//        1≤T≤5000
//        1
//        ≤
//X
//        <
//                Y
//≤
//        100
//        1≤X<Y≤100
//Sample 1:
//Input
//        Output
//4
//        10 100
//        9 100
//        88 99
//        1 11
//Cloth
//        Disposable
//Cloth
//        Disposable
//Explanation:
//Test case
//        1
//        1: The cost of the disposable masks will be
//10
//        ⋅
//        100
//        =
//        1000
//        10⋅100=1000, while the cost of the cloth masks will be
//100
//        ⋅
//        10
//        =
//        1000
//        100⋅10=1000. Since the price is equal and Chef is eco-friendly, Chef will buy the cloth masks.
//
//Test case
//        2
//        2: The cost of the disposable masks will be
//9
//        ⋅
//        100
//        =
//        900
//        9⋅100=900, while the cost of the cloth masks will be
//100
//        ⋅
//        10
//        =
//        1000
//        100⋅10=1000. Since the price of disposable masks is less, Chef will buy the disposable masks.
//
//        Test case
//        3
//        3: The cost of the disposable masks will be
//88
//        ⋅
//        100
//        =
//        8800
//        88⋅100=8800, while the cost of the cloth masks will be
//99
//        ⋅
//        10
//        =
//        990
//        99⋅10=990. Since the price of the cloth masks is less, Chef will buy the cloth masks.
//
//Test case
//        4
//        4: The cost of the disposable masks will be
//1
//        ⋅
//        100
//        =
//        100
//        1⋅100=100, while the cost of the cloth masks will be
//11
//        ⋅
//        10
//        =
//        110
//        11⋅10=110. Since the price of disposable masks is less, Chef will buy the disposable masks.

package CodeChef_500_1000;

import java.util.Scanner;

public class ClothAndMask {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0) {
            int x = read.nextInt();
            int y = read.nextInt();

            int DisposableMask = x * 100;
            int clothMask = y * 10;

            if (DisposableMask == clothMask || clothMask < DisposableMask){
                System.out.println("Cloth");
            } else {
                System.out.println("Disposable");
            }
        }
    }
}
