//Genes
//People in Chefland have three different eye colors, namely brown, blue, and green. green is the rarest of the eye colors whereas brown is most common.
//
//The eye color of the child of two people is most likely to be the most common eye color between them.
//
//You are given two characters denoting the eye colors of two people in Chefland. The character R denotes bRown color, B denotes Blue color, and G denotes Green color.
//
//Determine the most likely eye color of their child. (Print R, B or G denoting bRown, Blue or Green respectively).
//
//Please see the sample test cases below for explained examples.
//
//Input Format
//The first (and only) line of input contains two space-separated characters, the eye colors of the parents.
//        Output Format
//Print a single character denoting the most likely eye color of the child. (Print R, B or G denoting brown, blue or green respectively).
//
//Constraints
//The input contains two space-separated characters
//Each character in the input is one among {R, B, G}.
//Subtasks
//Sample 1:
//Input
//        Output
//R B
//R
//Explanation:
//The two people have brown and blue eyes and brown is the most common. Therefore, their child will most likely have brown eyes.
//
//Sample 2:
//Input
//        Output
//B B
//B
//Explanation:
//Both parents have blue eyes, therefore their child will most likely have blue eyes
//
//Sample 3:
//Input
//        Output
//G B
//B
//Explanation:
//The parents have green and blue eyes, out of which blue is more common than green, therefore the child will most likely have blue eyes.

package CodeChef_500_1000;

import java.util.Scanner;

public class Genes {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String parent1 = read.next();
        String parent2 = read.next();

        if ((parent1.equals("R") && parent2.equals("B")) || (parent1.equals("R") && parent2.equals("G")) || (parent1.equals("R") && parent2.equals("R"))) {
            System.out.println("R");
        } else if ((parent1.equals("B") && parent2.equals("G")) || (parent1.equals("G") && parent2.equals("B")) ||(parent1.equals("B")) && parent2.equals("B")){
            System.out.println("B");
        } else {
            System.out.println("G");
        }
    }
}
