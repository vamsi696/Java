//Printing numbers 10 - 0
//Let us change the problem a bit.
//
//        Task
//Write a program to print numbers from
//10
//        10 to
//0
//        0 on separate lines:
//
//Think of where the loop should start from, declare a variable a and initialise it to that value.
//Use the while syntax to create a loop,
//Think of what condition would stop the loop when the iterator reaches its end.
//Think of how to adjust the value of the iterator within each iteration. Would it be incremented or decremented?
//Expected Output:
//        10
//        9
//        8
//        7
//        6
//        5
//        4
//        3
//        2
//        1
//        0

package Loops;

public class Printing_Numbers {
    public static void main (String[] args)
    {
        // Update the blank given below
        int i = 10;
        while(i >= 0){
            System.out.println(i);
            i--;
        }
    }
}
