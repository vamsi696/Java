//Task
//Complete the code in IDE to print a greeting message.
//Observe the below sample.
//
//Sample 1:
//Input
//        Output
//
//Hello, Alice!

package Methods;

public class Problem_3 {
    public static void main (String[] args)
    {
        greet("Alice");
    }

    // User-defined method to greet a person by name
    public static void greet(String name)
    {
        System.out.println("Hello, " + name + "!");
    }
}
