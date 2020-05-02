package ouzture.springframework.recipator.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;
import ouzture.springframework.recipator.domain.Recipe;
import ouzture.springframework.recipator.domain.repositories.RecipeRepository;
import ouzture.springframework.recipator.services.RecipeService;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

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

        //given
        Set<Recipe> recipeSet = new HashSet<>();
        recipeSet.add(new Recipe());
        Recipe recipe2 = new Recipe();
        recipe2.setId(2L);

        recipeSet.add(recipe2);

        when(recipeService.getRecipes()).thenReturn(recipeSet);

        ArgumentCaptor<Set<Recipe>> argumentCaptor = ArgumentCaptor.forClass(Set.class);

        //when
        String viewName = controller.getIndexPage(model);

        //then
        assertEquals(viewName,"index");

        verify(recipeService,times(1)).getRecipes();
        verify(model,times(1)).addAttribute(eq("recipes"),argumentCaptor.capture());

        Set<Recipe> recipesInController = argumentCaptor.getValue();
        assertEquals(recipesInController.size(),2);

    }
}