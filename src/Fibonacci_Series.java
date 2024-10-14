public class Fibonacci_Series {
    public static void main(String[] args) {
        int value = 10;
        int firstValue = 0;
        int secondValue = 1;
        System.out.print("Fibonacci Series: " + firstValue + ", " + secondValue);
        int i = 2;
        while(i < value){
            int thridValue = firstValue + secondValue;
            System.out.print(", "+ thridValue);
            firstValue = secondValue;
            secondValue = thridValue;
            i++;
        }
    }
}
