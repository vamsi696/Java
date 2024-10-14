public class PrimeNumberCheck {
    public static void main(String[] args) {
        int num = 11;
        boolean isPrime = true;
        int i = 2;
        while (i <= Math.sqrt(num)){
            if (num % i == 0){
                isPrime = false;
                break;
            }
            i++;
        }
        System.out.println(isPrime);
    }
}
