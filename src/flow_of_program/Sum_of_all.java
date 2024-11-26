//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
package flow_of_program;

import java.util.Scanner;

public class Sum_of_all {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalSum = 0;

        while (true){
            System.out.println("Enter a number (or 'x' to stop): ");
            String input = in.nextLine().trim();

//            Exit condition
            if (input.equalsIgnoreCase("x")){
                break;
            }

//            check if input is numeric
            if (isnumeric(input)){
                double number = Double.parseDouble(input);
                totalSum += number;
            } else {
                System.out.println("Invalid Input! Please enter a valid number or 'x' to stop.");
            }
        }
        System.out.println("The sum of all entered numbers is: " + totalSum);
    }

    private static boolean isnumeric(String str){
        if (str == null || str.isBlank()){
            return false;
        }
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e){
            return  false;
        }
    }
}
