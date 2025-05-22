package CodeChef_500_1000;

import java.util.Scanner;

public class Buy2Get1Free {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();

        while (t>0){
            int n = read.nextInt();
            int x = read.nextInt();

            int spend = (n-(n/3))*x;
            System.out.println(spend);

            t--;
        }
    }
}
