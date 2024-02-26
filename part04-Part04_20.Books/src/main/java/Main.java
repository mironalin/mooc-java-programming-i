import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();

        // implement here the program that allows the user to enter 
        // book information and to examine them
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                System.out.println("");
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());

            books.add(new Books(title, pages, year));
        }

        System.out.print("What information will be printed? ");
        String prompt = scanner.nextLine();

        if (prompt.equals("everything")) {
            for (int i = 0; i < books.size(); i++) {
                System.out.println(books.get(i));
            }
        } else if (prompt.equals("name")) {
            for (int i = 0; i < books.size(); i++) {
                System.out.println(books.get(i).getBookName());
            }
        }
    }
}
