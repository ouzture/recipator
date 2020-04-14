package ouzture.springframework.recipator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ouzture.springframework.recipator.domain.Category;
import ouzture.springframework.recipator.domain.UnitOfMeasure;
import ouzture.springframework.recipator.domain.repositories.CategoryRepository;
import ouzture.springframework.recipator.domain.repositories.UnitOfMeasureRepository;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Category id : " + categoryOptional.get().getId());
        System.out.println("Uom id: " + unitOfMeasure.get().getId());


        return "index";
    }

}
