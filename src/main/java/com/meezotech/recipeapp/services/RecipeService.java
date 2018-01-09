package com.meezotech.recipeapp.services;

import com.meezotech.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findRecipeById(Long id);
}
