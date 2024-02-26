
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int value = Integer.valueOf(scanner.nextLine());

            if (value == 0) {
                break;
            }

            amount = amount + 1;
            sum = sum + value;
        }
        System.out.println("Average of the numbers: " + (1.0*sum/amount));
    }
}
