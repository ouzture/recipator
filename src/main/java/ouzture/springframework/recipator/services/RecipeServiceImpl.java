package ouzture.springframework.recipator.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ouzture.springframework.recipator.domain.Recipe;
import ouzture.springframework.recipator.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Slf4j
public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {

        log.debug("Inside service");

        Set<Recipe> recipeSet = new HashSet<>();

        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }

    @Override
    public Recipe findById(Long id) {
        final Optional<Recipe> byId = recipeRepository.findById(id);
        if(! byId.isPresent()) {
            throw new RuntimeException("Recipe not found");
        }

        return byId.get();
    }
}
