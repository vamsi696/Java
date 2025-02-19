package CodeChef_500_1000;

import java.util.Scanner;

public class ExtraShoes {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t-- > 0){
            int n = read.nextInt();
            int m = read.nextInt();

            int extraShoes = n + Math.max(0, n -m);
            System.out.println(extraShoes);
        }
    }
}
