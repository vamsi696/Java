package Conditional_Statements;
import java.util.Scanner;

public class MCQ_34 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int binary = read.nextInt();

        switch (binary) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            default:
                System.out.println("Not valid");
        }
    }
}
