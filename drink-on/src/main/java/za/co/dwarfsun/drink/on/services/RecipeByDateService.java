/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.co.dwarfsun.drink.on.services;

import java.util.Date;
import java.util.List;
import za.co.dwarfsun.drink.on.domain.Recipe;

/**
 *
 * @author Matt
 */
public interface RecipeByDateService {
    public List<Recipe> getRecipeBetween(Date start, Date end);
    
}
