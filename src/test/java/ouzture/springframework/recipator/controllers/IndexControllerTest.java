package ouzture.springframework.recipator.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;
import ouzture.springframework.recipator.domain.repositories.RecipeRepository;
import ouzture.springframework.recipator.services.RecipeService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class IndexControllerTest {

    @Mock
    RecipeService recipeService;
    @Mock
    Model model;

    @Mock
    RecipeRepository recipeRepository;

    IndexController controller;

    @BeforeEach
    void setUp() {

        MockitoAnnotations.initMocks(this);

        controller = new IndexController(recipeService);
    }

    @Test
    void getIndexPage() {




    assertEquals(controller.getIndexPage(model),"index");

    verify(recipeService,times(1)).getRecipes();
    verify(model,times(1)).addAttribute(eq("recipes"),anySet());

    }
}