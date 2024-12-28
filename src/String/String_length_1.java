//Write a program which does the following:
//
//Create a variable txt and assign it the text "NumeroTres".
//Use the length() function to output to the console the number of characters in txt.

package String;

public class String_length_1 {
    public static void main (String[] args)
    {
        String txt = "NumeroTres";
        int len = txt.length();
        System.out.println("The length of the word is: " + len);
    }
}
