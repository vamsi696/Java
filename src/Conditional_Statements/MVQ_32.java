package Conditional_Statements;

public class MVQ_32 {
    public static void main(String[] args) {
        int a = 0;
        int b = -10;

        if (a >= b) {
            System.out.print("a is greater or equal to b. ");
        }

        if (a == 0 || b == 0) {
            System.out.print("At least one is 0. ");
        }

        if (a == 0 && b == 0) {
            System.out.print("Both are 0. ");
        }

        System.out.print("Program ends");
    }
}
