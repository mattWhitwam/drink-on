/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.co.dwarfsun.drink.on.services.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import za.co.dwarfsun.drink.on.domain.Ingredient;
import za.co.dwarfsun.drink.on.domain.Recipe;
import za.co.dwarfsun.drink.on.repository.RecipeRepository;
import za.co.dwarfsun.drink.on.services.RecipeByIngredientService;

/**
 *
 * @author Matt
 */
public class RecipeByIngredientServiceImpl implements RecipeByIngredientService{
    @Autowired
    private RecipeRepository recipeRepository;

    @Override
    public List<Recipe> getRecipeByIngredient(Ingredient ingr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Recipe> getRecipeByIngredient(String ingr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
