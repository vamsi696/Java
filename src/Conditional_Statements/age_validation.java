//Task
//Write a program which does the following:
//
//Let's think of a real-life example where we need to find out if a person is old enough to vote.
//Find out if the age (25) is greater than OR equal to the voting age limit, which is set to 18.
//Declare the variables age and voting_age - and initialize them to the values 25 and 18 - i.e. the age and the voting age respectively.
//Compare age and voting_age using the syntax given above and output the following
//"Old enough to vote!" if age is greater than or equal to voting_age
//"Not old enough to vote." if age is lesser than voting_age

package Conditional_Statements;

public class age_validation {
    public static void main (String[] args)
    {
        // Update the blank in the code given below
        int Age = 25;
        int Vage = 18;

        if (Age >= Vage) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }
    }
}
