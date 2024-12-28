package String;

public class MCQ_1 {
    public static void main(String[] args) {
        String s = "abc";
        char[] sArray = s.toCharArray();
        sArray[2] = 'd';
        s = new String(sArray);
        System.out.println(s);
    }
}
