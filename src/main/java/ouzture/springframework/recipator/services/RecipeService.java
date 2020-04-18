package ouzture.springframework.recipator.services;

import ouzture.springframework.recipator.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
