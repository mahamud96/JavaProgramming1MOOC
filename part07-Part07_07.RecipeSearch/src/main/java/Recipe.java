
import java.util.ArrayList;

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

public class Recipe {
    private String recipeName;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String recipeName, int cookingTime, ArrayList<String> ingredients) {
        this.recipeName = recipeName;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }
    
    public String getRecipeName(){
        return this.recipeName;
    }
    
    public int getCookingTime(){
        return this.cookingTime;
    }

    public ArrayList<String> getIngredients(){
        return this.ingredients;
    }
    
    @Override
    public String toString(){
        return this.recipeName + this.cookingTime + this.ingredients;
    }
    
    

}
