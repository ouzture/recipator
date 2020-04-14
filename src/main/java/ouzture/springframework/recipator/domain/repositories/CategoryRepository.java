package ouzture.springframework.recipator.domain.repositories;

import org.springframework.data.repository.CrudRepository;
import ouzture.springframework.recipator.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category,Long> {

    Optional<Category> findByDescription(String description);

}
