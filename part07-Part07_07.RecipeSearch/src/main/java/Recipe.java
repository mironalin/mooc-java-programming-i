import java.util.ArrayList;

public class Recipe {
    private String recipeName;
    private int cookingTime;
    private ArrayList<String> recipeIngredients;

    public Recipe(String name, int time, ArrayList<String> ingredients) {
        recipeName = name;
        cookingTime = time;
        recipeIngredients = ingredients;
    }

    // Setters
    public void setRecipeName(String name) {
        if (!(name.equals(""))) {
            recipeName = name;
        }
    }

    public void setCookingTime(int time) {
        cookingTime = time;
    }

    public void setIngredient(String ingredient) {
        recipeIngredients.add(ingredient);
    }

    // Getters
    public String getRecipeName() {
        return recipeName;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public boolean recipeHasIngredient(String searchedIngredient) {
        for (int i = 0; i < recipeIngredients.size(); i++) {
            String ingredient = recipeIngredients.get(i);
            if (ingredient.equals(searchedIngredient)) {
                return true;
            }
        }
        return false;
    } 

    public String toString() {
        return recipeName + ", cooking time: " + cookingTime;
    }
}
