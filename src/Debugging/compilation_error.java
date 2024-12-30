//Task
//We have populated a code in the IDE which should output 15.
//Click on Submit to run the code and view the error message.
//Can you debug the code to get the output 15.

package Debugging;

public class compilation_error {
    public static void main(String[] args) {
        int a = 3; // change capital I to small i
        int b = 5;
        System.out.println(a * b);   // add semicolon
    }
}
