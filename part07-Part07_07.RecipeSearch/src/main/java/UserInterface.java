/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mahamud
 */
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class UserInterface {

    private RecipeBook recipeBook;
    private Scanner scan;

    public UserInterface(RecipeBook recipeBook, Scanner scan) {
        this.recipeBook = recipeBook;
        this.scan = scan;
    }

    public void start() {
        appStart();
        appLoop();

    }

    public void appStart() {
        System.out.print("File to read: ");
        String fileName = scan.nextLine();

        try (Scanner readFile = new Scanner(Paths.get(fileName))) {
            while (readFile.hasNextLine()) {
                Recipe recipe = extractRecipeFromTextSegment(readFile);
                this.recipeBook.addRecipe(recipe);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public Recipe extractRecipeFromTextSegment(Scanner readFile) {

        String recipeName = readFile.nextLine();
        int cookTime = Integer.valueOf(readFile.nextLine());
        ArrayList<String> ingredients = new ArrayList<>();

        String currentIngredient = readFile.nextLine();
        while (readFile.hasNext() && !currentIngredient.isEmpty()) {
            ingredients.add(currentIngredient);
            currentIngredient = readFile.nextLine();
        }
        return new Recipe(recipeName, cookTime, ingredients);
    }

    public void appLoop() {
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");

        while (true) {
            System.out.print("Enter command: ");
            String command = scan.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                this.recipeBook.allRecipes();
                System.out.println("");
            }
            
            if(command.equals("find name")){
                System.out.print("Searched word: ");
                String name = scan.nextLine();
                this.recipeBook.search(name);
            }
            
            if(command.equals("find cooking time")){
                System.out.print("Max cooking time: ");
                int time = Integer.valueOf(scan.nextLine());
                this.recipeBook.maxCookingTime(time);
            }
            
            if(command.equals("find ingredient")){
                System.out.print("Ingredient: ");
                String ingredient = scan.nextLine();
                this.recipeBook.searchByIngredient(ingredient);
            }
        }
    }
    
    
}
