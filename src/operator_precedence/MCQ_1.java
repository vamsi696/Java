package operator_precedence;

public class MCQ_1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int result = a++ - --b + a--;
        System.out.println(result);
    }
}
