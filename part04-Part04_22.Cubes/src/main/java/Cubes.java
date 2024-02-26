
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String stringInput = scanner.nextLine();

            if (stringInput.equals("end")) {
                break;
            }

            int input = Integer.valueOf(stringInput);

            System.out.println(input * input * input);
        }
    }
}
