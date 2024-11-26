//Take 2 numbers as inputs and find their HCF and LCM.
package flow_of_program;

import java.util.Scanner;

public class HCF_and_LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
//        HCF - Highest Common Factor
        int num3 = num1 % num2;

        if (num2 % num3 == 0){
            System.out.println(num3);
        } else {
            System.out.println("Throws an error!!");
        }
//        LCM - Least Common Device
        int LCM = (num1 * num2)/num3;
        System.out.println(LCM);
    }
}
