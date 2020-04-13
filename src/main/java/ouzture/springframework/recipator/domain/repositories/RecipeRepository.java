package ouzture.springframework.recipator.domain.repositories;

import org.springframework.data.repository.CrudRepository;
import ouzture.springframework.recipator.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
