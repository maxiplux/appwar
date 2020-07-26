package plus.maxi.ldapsimulator.appwar.controllers;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import plus.maxi.ldapsimulator.appwar.controllers.generics.CrudController;
import plus.maxi.ldapsimulator.appwar.models.items.Category;
import plus.maxi.ldapsimulator.appwar.services.CategoryServices;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/api/v1/categories")
@Data
public class CategoryController extends CrudController<Category> {

    @Autowired
    CategoryServices categoryServices;

    @PostConstruct
    public  void posContructor() {
        this.service = categoryServices;
    }

}
