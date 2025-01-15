package Methods;

public class Problem_4 {
    public static void main(String[] args)
    {
        int output = outerMethod(5);
        System.out.println(output);
    }

    // Outer method
    public static int outerMethod(int x)
    {
        // Inner Method
        int result = innerMethod(x, x);
        return result;
    }

    // Inner method
    public static int innerMethod(int x, int y)
    {
        return x * y;
    }
}
