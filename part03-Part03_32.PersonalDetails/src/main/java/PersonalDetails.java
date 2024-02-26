
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumYears = 0;
        int noEntries = 0;

        String longestName = "";

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] pieces = input.split(",");
            noEntries++;
            sumYears += Integer.valueOf(pieces[1]);

            if (pieces[0].length() > longestName.length()) {
                longestName = pieces[0];
            }
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + 1.0 * sumYears / noEntries);
    }
}
