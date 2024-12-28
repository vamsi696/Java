//Changing Characters in a String
//To change the value of a specific character in a string:
//
//We convert the string into a character array using the toCharArray() method.
//Refer to the index number.
//We then use single quotes to declare the new value, like so,
//String word = "CodeShef";
//char[] wordArray = word.toCharArray();
//wordArray[4] = 'C';
//Task
//Write a program which does the following:
//
//Initialise a string variable word and assign the value "Ocygen" to it.
//You now want to fix the typo in the given string.
//Use the syntax learnt previously to replace 'c' with 'x' in the variable word.
//Output the updated word to console.

package String;

public class Changing_character_to_string {
    public static void main (String[] args)
    {
        // Update the blank in code given below
        String word = "Ocygen";
        char[] wordArray = word.toCharArray();
        wordArray[1] = 'x';
        word = new String(wordArray);
        System.out.println(word);
    }
}
