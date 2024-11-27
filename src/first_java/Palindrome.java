//To find out whether the given String is Palindrome or not.

package first_java;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = in.nextLine();

        String cleanedString = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int length = cleanedString.length();
        boolean isPalindrome = true;

        int i = 0;
        while (i < length/2){
            if (cleanedString.charAt(i) != cleanedString.charAt(length - i -1)){
             isPalindrome = false;
             break;
            }
            i++;
        }
        if (isPalindrome){
            System.out.println("This is a Palindrome");
        } else {
            System.out.println("This is not a Palindrome");
        }
    }
}
