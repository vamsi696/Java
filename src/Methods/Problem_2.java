package Methods;

public class Problem_2 {
    public static void squaresAndCubes(int x){
        System.out.println((int)Math.pow(x, 2));
        System.out.println((int)Math.pow(x, 3));
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;

        squaresAndCubes(a);
        squaresAndCubes(b);
        squaresAndCubes(c);
    }
}
