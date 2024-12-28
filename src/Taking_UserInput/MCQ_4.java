package Taking_UserInput;
import java.util.Scanner;

public class MCQ_4 {
    public static void main(String[] args) {
        int costPerItem, numberOfItems;
        Scanner read = new Scanner(System.in);
        costPerItem = read.nextInt();
        numberOfItems = read.nextInt();
        int totalCost = costPerItem * numberOfItems;
        System.out.println(totalCost);
    }
}
