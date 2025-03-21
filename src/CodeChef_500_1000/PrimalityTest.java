//Primality Test
//
//Alice and Bob are meeting after a long time. As usual they love to play some math games. This times Alice takes the call and decides the game. The game is very simple, Alice says out an integer and Bob has to say whether the number is prime or not. Bob as usual knows the logic but since Alice doesn't give Bob much time to think, so Bob decides to write a computer program.
//
//Help Bob accomplish this task by writing a computer program which will calculate whether the number is prime or not.
//
//Note that 1 is not a prime number.
//
//        Input
//The first line of the input contains an integer T, the number of testcases. T lines follow.
//
//Each of the next T lines contains an integer N which has to be tested for primality.
//
//        Output
//For each test case output in a separate line, "yes" if the number is prime else "no."
//
//Constraints
//1 ≤ T ≤ 20
//        1 ≤ N ≤ 100000
//Sample 1:
//Input
//        Output
//5
//        23
//        13
//        20
//        1000
//        99991
//yes
//        yes
//no
//        no
//yes

package CodeChef_500_1000;

import java.util.Scanner;

public class PrimalityTest {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int n = read.nextInt();

            if (primeNumber(n)){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
    public static boolean primeNumber(int x){
        if (x <= 1){
            return false;
        }
        for (int i = 2; i * i < x; i++){
            if (x%i==0){
                return false;
            }
        }
        return true;
    }
}
