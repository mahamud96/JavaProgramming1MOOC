/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mahamud
 */
import java.util.ArrayList;


public class RecipeBook {
    private ArrayList<Recipe> recipeBook;
    
    public RecipeBook(){
        this.recipeBook = new ArrayList<>();
    }
    
    public void addRecipe(Recipe recipe){
        this.recipeBook.add(recipe);
    }
    
    public void allRecipes(){
        for(Recipe recipe:this.recipeBook){
            System.out.println(recipe.getRecipeName()+ ", cooking time: " + recipe.getCookingTime());
        }
    }
    
    public void search(String name){
        for(Recipe recipe:this.recipeBook){
            if(recipe.getRecipeName().contains(name)){
                System.out.println(recipe.getRecipeName()+ ", cooking time: " + recipe.getCookingTime());
            }
        }
        System.out.println("");
    }
    
    public void maxCookingTime(int time){
        for(Recipe recipe:this.recipeBook){
            if(recipe.getCookingTime() <= time){
                System.out.println(recipe.getRecipeName()+ ", cooking time: " + recipe.getCookingTime());
            }
        }
        System.out.println("");
    }
    
    public void searchByIngredient(String ingredient){
        for(Recipe recipe:this.recipeBook){
            if(recipe.getIngredients().contains(ingredient)){
                System.out.println(recipe.getRecipeName()+ ", cooking time: " + recipe.getCookingTime());
            }
        }
        System.out.println("");
    }

    
}
