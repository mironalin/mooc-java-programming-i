
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

//import javax.jws.soap.SOAPBinding.Use;

import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipe> recipes = new ArrayList<>();

        UserInterface userInterface = new UserInterface(recipes, scanner);

        userInterface.start();

    }

}
