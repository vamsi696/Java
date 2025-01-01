//Do While Loop
//The do/while loop is a variation of the while loop. In this loop, the code block is executed once before checking the condition. After the initial execution, it will continue to repeat the loop as long as the condition remains true.
//
//int i = 0;
//do {
//        System.out.println(i);
//i++;
//        }
//        while (i < 3);
//
///*
//Output:
//0
//1
//2
//*/
//Task
//Write a program which does the following:
//
//Declare an integer variable i and initialise it to
//0
//        0.
//Use the do/while loop to output i to the console as long as i is less than
//6
//        6.
package Loops;

public class do_while_loop {
    public static void main(String[] args) {
        int i = 0;

        do{
            System.out.println(i);
            i++;
        }
        while (i < 6);
    }
}
