package CodeChef_500_1000;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicatesUsingStream {
    public static void main(String[] args) {
        String input = "Hemanth kandalla";

        String result = Arrays.stream(input.toLowerCase().split("")).distinct().collect(Collectors.joining());

        System.out.println(result);
    }
}
