//Write a program which does the following:
//
//Initialize an integer variable i to
//0
//        0.
//Output to the console i from
//0
//        0 to
//15
//        15 using a for loop.
//Stop execution when the value of i reaches
//13
//        13 .
package Loops;

public class Break {
    public static void main(String[] args) {
        for (int i = 0; i <= 15; i++){
            if (i == 13){
                break;
            }
            System.out.println(i);
        }
    }
}
