//You are given the age of a person as the variable age. Will this person be able to vote?
//
//Output 1 or 0 assuming that the voting age is 18 i.e., a person's age has to be greater than or equal to 18 to vote.

package Debugging;

public class Debug_the_code_2 {
    public static void main (String[] args) throws java.lang.Exception
    {
        int age = 18;
        if(age >= 18){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
