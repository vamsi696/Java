package CodeChef_500_1000;

import java.util.Scanner;

public class Monopoly {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();

        while (t-- > 0){
            int p = sr.nextInt();
            int q = sr.nextInt();
            int r = sr.nextInt();
            int s = sr.nextInt();

            if (p > q + r + s || q > p + r + s || r > p + q + s || s > p + q + r){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
