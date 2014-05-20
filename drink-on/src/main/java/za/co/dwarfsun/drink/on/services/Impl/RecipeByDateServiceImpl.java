/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.co.dwarfsun.drink.on.services.Impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import za.co.dwarfsun.drink.on.domain.Recipe;
import za.co.dwarfsun.drink.on.repository.RecipeRepository;
import za.co.dwarfsun.drink.on.services.RecipeByDateService;

/**
 *
 * @author Matt
 */
public class RecipeByDateServiceImpl implements RecipeByDateService {
    
    @Autowired
    private RecipeRepository recipeRepository;
    
    @Override
    public List<Recipe> getRecipeBetween(Date start, Date end) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
