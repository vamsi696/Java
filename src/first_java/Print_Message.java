//Take name as input and print a greeting message for that particular name.

package first_java;

import java.util.Scanner;

public class Print_Message {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("Hi "+ name + " how are you doing?");
    }
}
