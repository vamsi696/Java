public class Palindrome {
    public static void main(String[] args) {
        String name = "madam";
        String str = new StringBuilder(name).reverse().toString();
        System.out.println(name.equals(str));
    }
}
