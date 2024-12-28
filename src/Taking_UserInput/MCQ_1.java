package Taking_UserInput;
import java.util.Scanner;

public class MCQ_1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        System.out.println(a + "" + b + "" + (a + b)); // "" is empty string and not single space
    }
}
