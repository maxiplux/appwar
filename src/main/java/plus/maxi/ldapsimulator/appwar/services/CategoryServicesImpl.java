package plus.maxi.ldapsimulator.appwar.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import plus.maxi.ldapsimulator.appwar.models.items.Category;
import plus.maxi.ldapsimulator.appwar.repositories.CategoryRepository;
import plus.maxi.ldapsimulator.appwar.services.generics.CrudServicesImpl;


import javax.annotation.PostConstruct;
import java.util.Optional;

@Service
public class CategoryServicesImpl extends CrudServicesImpl<Category> implements CategoryServices<Category> {

    @Autowired
    private CategoryRepository categoryRepository;


    @PostConstruct
    public  void posContructor() {
        this.setRepository( categoryRepository);
    }


    public Optional<Category> UpdateById(long id, Category element) {
        Optional<Category> optionalCurrentCompany = this.repository.findById(id);
        if (optionalCurrentCompany.isPresent()) {
            Category currentProduct = optionalCurrentCompany.get();

            if (element.getName() != null) {
                currentProduct.setName(element.getName());
            }


            return Optional.of((Category) this.repository.save(currentProduct));
        }
        return Optional.empty();

    }


}
