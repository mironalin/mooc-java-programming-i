import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    private Scanner scan;
    private BirdDatabase birdList;

    public UserInterface(BirdDatabase birdList, Scanner scan) {
        this.birdList = birdList;
        this.scan = scan;
    }

    public void start() {
        while (true) {
            String input = askUserInput("?");

            if (input.equals("Quit")) {
                break;
            }

            if (input.equals("Add")) {
                commandAdd();
            }

            if (input.equals("Observation")) {
                commandObservation();
            }

            if (input.equals("All")) {
                commandAll();
            }

            if (input.equals("One")) {
                commandOne();
            }

        }
    }

    public String askUserInput(String prompt) {
        System.out.print(prompt + " ");
        return scan.nextLine();
    }

    public void commandAdd() {
        String name = askUserInput("Name:");
        String latinName = askUserInput("Name in Latin:");

        birdList.addBird(name, latinName);
    }

    public void commandObservation() {
        String bird = askUserInput("Bird?");

        boolean succes = birdList.addObservation(bird);
        if (succes == false) {
            System.out.println("Not a bird!");
        }
    }

    public void commandAll() {
        System.out.println(birdList.getAll());
    }

    public void commandOne() {
        String bird = askUserInput("Bird?");
        String BirdPrint = birdList.getOne(bird);
        
        if (BirdPrint == null) {
            System.out.println("Not a bird!");
        } else {
            System.out.println(BirdPrint);
        }
    }

}
