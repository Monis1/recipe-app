package com.meezotech.recipeapp.controllers;

import com.meezotech.recipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping("/recipe/{id}")
    public String showRecipeById(@PathVariable String id, Model model) {
        model.addAttribute("recipe", recipeService.findRecipeById(new Long(id)));
        return "recipes/show";
    }

}

