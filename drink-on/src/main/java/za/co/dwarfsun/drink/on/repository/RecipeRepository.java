/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.co.dwarfsun.drink.on.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.dwarfsun.drink.on.domain.Recipe;

/**
 *
 * @author Matt
 */
public interface RecipeRepository extends JpaRepository<Recipe, Long>{
    
}
