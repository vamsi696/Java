//Print Numbers 5 - 20
//Task
//You have to print numbers from 5 to 20 in separate lines using a while loop.
//
//When using a loop you have to think about three things - initialisation, condition and update statement.
//So think about what we initialise the variable with? i.e., Where does the sequence start form?
//Think about what the condition will be? i.e., Till where is the sequence going?
//Also think about how the variable will be updating after every iteration. How the terms in the sequence are changing?
//Expected Output
//5
//        6
//        7
//        8
//        9
//        10
//        11
//        12
//        13
//        14
//        15
//        16
//        17
//        18
//        19
//        20
package Loops;

public class Print_Numbers {
    public static void main (String[] args)
    {
        int i = 5; // Initialization
        while (i <= 20) { // Condition
            System.out.println(i);
            i++; // Update statement
        }

    }
}
