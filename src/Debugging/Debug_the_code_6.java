//Write a program which does the following:
//
//Initialize a string variable word and assign the value "Ocygen" to it.
//You now want to fix the typo in the given string.
//        Replace 'c' with 'x' in the variable word.
//Output the updated word to console.

/*Note:

The java string toCharArray() method converts this string into character array.
It returns a newly created character array, its length is similar to this string and
its contents are initialized with the characters of this string.

*/
package Debugging;

public class Debug_the_code_6 {
    public static void main (String[] args)
    {
        char[] word = "Ocygen".toCharArray();
        word[1] = 'x';
        System.out.println(word);
    }
}
