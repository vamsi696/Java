public class Factorial_Of_A_Number {
    public static void main(String[] args) {
      int num = 6, factorial = 1, i = 1;
      while (i <= num){
          factorial *= i;
          i++;
      }
        System.out.println(factorial);
    }
}
