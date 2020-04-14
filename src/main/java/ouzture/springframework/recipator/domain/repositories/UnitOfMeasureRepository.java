package ouzture.springframework.recipator.domain.repositories;

import org.springframework.data.repository.CrudRepository;
import ouzture.springframework.recipator.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {

    Optional<UnitOfMeasure> findByDescription(String description);

}
