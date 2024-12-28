package Taking_UserInput;
import java.util.Scanner;

public class MCQ_3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        int c = a + 2;
        int d = c + b;
        System.out.println(d);
    }
}
