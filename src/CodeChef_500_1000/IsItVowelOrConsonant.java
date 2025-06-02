//Is it a VOWEL or CONSONANT
//Write a program to take a character
//        (
//                C
//                )
//(C) as input and check whether the given character is a vowel or a consonant.
//
//N
//        O
//T
//        E
//:
//        −
//NOTE:− Vowels are 'A', 'E', 'I', 'O', 'U'. Rest all alphabets are called consonants.
//
//Input Format
//First line will contain the character
//C
//C.
//        Output Format
//Print "Vowel" if the given character is a vowel, otherwise print "Consonant".
//
//Constraints
//        C
//C
//        w
//i
//        l
//l
//        will
//b
//        e
//be
//        a
//n
//        an
//u
//        p
//p
//        e
//r
//        upper
//c
//        a
//s
//        e
//case
//E
//        n
//g
//        l
//i
//        s
//h
//        English
//a
//        l
//p
//        h
//a
//        b
//e
//        t
//alphabet
//Sample 1:
//Input
//        Output
//Z
//        Consonant

package CodeChef_500_1000;

import java.util.Scanner;

public class IsItVowelOrConsonant {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        char C = read.next().charAt(0);
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};
        boolean isVowel = false;

        for (char vowel : vowels){
            if (C == vowel){
                isVowel = true;
                break;
            }
        }

        if (isVowel){
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
