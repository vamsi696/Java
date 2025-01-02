//Odd numbers
//Task
//Write a program to print odd numbers between
//10
//        10 to
//20
//        20 on separate lines:
//
//Think of where the loop should start from, declare a variable a and initialise it to that value.
//Use the while syntax to create a loop,
//Think of what condition would stop the loop when the iterator reaches its end.
//Think of how to adjust the value of the iterator within each iteration. Would it be incremented or decremented? By what value should it be incremented or decremented?
//Expected output:
//        11
//        13
//        15
//        17
//        19

package Loops;

public class Odd_Numbers {
    public static void main (String[] args)
    {
        // Update the code below this line.
        int i = 10;
        while(i < 20){
            if(i % 2 == 1){
                System.out.println(i);
            }
            i++;
        }
    }
}
