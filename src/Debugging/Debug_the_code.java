//You are given the name of a teen as the variable name. There is a special rule in Chef town - You will get special treatment if your name is C or A.
//
//Output should be the following:
//
//        1 if the name is A or C.
//        0 otherwise.

package Debugging;

public class Debug_the_code {
    public static void main (String[] args) throws java.lang.Exception
    {
        char name = 'A';
        if(name=='A' || name =='C'){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

    }
}
