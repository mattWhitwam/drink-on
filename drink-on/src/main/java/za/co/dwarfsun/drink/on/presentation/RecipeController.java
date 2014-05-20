/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.co.dwarfsun.drink.on.presentation;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import za.co.dwarfsun.drink.on.domain.Recipe;
import za.co.dwarfsun.drink.on.services.RecipeByDateService;
/**
 *
 * @author 211227307
 */
@Controller
public class RecipeController {
    @Autowired
    private RecipeByDateService recipeByDateService;
    @RequestMapping(value="newrecipes")
    @ResponseBody
    public Recipe getRecipe() {
        Recipe r = null;
        List<Recipe> recipes = recipeByDateService.getRecipeBetween(new Date(0), new Date());
        
        System.out.println(""+recipes.size());
        
        if (recipes.size()>0) {
            r = recipes.get(0);
        }
        return r;
    }
}
