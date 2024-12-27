//In the IDE a program is given to convert a temperature from Fahrenheit to Celsius. It takes the temperature in Fahrenheit as input from the user and output the temperature in Celsius.
//
//The formula for conversion is:
//
//C = ((F−32) × 5) / 9

package operator_precedence;

public class Temperature_conversion {
    public static void main(String[] args) {
        int f = 49;
        float c = (float)((f - 32) * 5) / 9; // Ensure that the division is performed with float
        System.out.println(c);
    }
}
