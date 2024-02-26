
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its content printed?");
        String name = scanner.nextLine();

        try (Scanner fileReader = new Scanner(Paths.get(name))) {
            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("File not found");
        }
    }
}
