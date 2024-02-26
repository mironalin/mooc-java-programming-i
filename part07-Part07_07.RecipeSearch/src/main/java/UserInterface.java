import java.lang.reflect.Array;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Recipe> recipes;

    public UserInterface(ArrayList<Recipe> recipes, Scanner scanner) {
        this.recipes = recipes;
        this.scanner = scanner;
    }

    public void start() {
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        System.out.println("");

        fileScan(fileName);
        commandLineInterface();
    }

    public void fileScan(String fileName) {
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))){
            while (fileScanner.hasNextLine()) {
                ArrayList<String> ingredients = new ArrayList<>();
                
                String fileLine = fileScanner.nextLine();
                if (fileLine.equals("")) {
                    continue;
                }
                String name = fileLine;
                int time = Integer.valueOf(fileScanner.nextLine());

                while (fileScanner.hasNextLine()) {
                    String ingredient = fileScanner.nextLine();
                     
                    if (ingredient.isEmpty()) {
                        break;
                    }

                    ingredients.add(ingredient);
                }

                recipes.add(new Recipe(name, time, ingredients));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void commandLineInterface() {

        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println();

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            System.out.println("");

            // stop - stops the program
            if (command.equals("stop")) {
                break;
            }

            // list - lists the recipes
            if (command.equals("list")) {
                System.out.println("Recipes:");
                for (int i = 0; i < recipes.size(); i++) {
                    System.out.println(recipes.get(i));
                }
                System.out.println("");
            }

            // find name - searches recipes by name
            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String searchedName = scanner.nextLine();
                System.out.println("\nRecipes:");
                for (int i = 0; i < recipes.size(); i++) {
                    String recipeName = recipes.get(i).getRecipeName();
                    if (recipeName.contains(searchedName)) {
                        System.out.println(recipes.get(i) + "\n");
                    }
                }
            }

            // find cooking time - searches recipes by cooking time
            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int searchedCookingTime = Integer.valueOf(scanner.nextLine());
                System.out.println("\nRecipes:");
                for (int i = 0; i < recipes.size(); i++) {
                    int cookingTime = recipes.get(i).getCookingTime();
                    if (cookingTime <= searchedCookingTime) {
                        System.out.println(recipes.get(i));
                    }
                }
                System.out.println("");
            }

            // find ingredient - searches recipes by ingredient
            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String searchedIngredient = scanner.nextLine();
                System.out.println("\nRecipes:");
                for (int i = 0; i < recipes.size(); i++) {
                    if (recipes.get(i).recipeHasIngredient(searchedIngredient) == true) {
                        System.out.println(recipes.get(i));
                    }
                }
                System.out.println("");

            }
        }
    }
}
