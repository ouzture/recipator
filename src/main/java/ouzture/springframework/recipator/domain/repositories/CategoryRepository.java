package ouzture.springframework.recipator.domain.repositories;

import org.springframework.data.repository.CrudRepository;
import ouzture.springframework.recipator.domain.Category;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
