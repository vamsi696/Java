//Changing the elements of an Array
//To change the value of a specific element, we can refer to the index number.
//
//Task
//Write a program which does the following:
//
//The 3rd month in the given list is incorrect.
//Update the 3rd month in the given array with the correct one - "Mar".
//Once the 3rd array element is updated, output the 3rd array element to the console.

package Arrays;

public class Changing_elements_of_Array {
    public static void main(String[] args) {

        String[] months = {"Jan", "Feb", "Dec", "Apr"};
        months[2] = "Mar";
        System.out.println(months[2]);
    }
}
