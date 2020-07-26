package plus.maxi.ldapsimulator.appwar.services;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import plus.maxi.ldapsimulator.appwar.models.items.Item;


import java.util.Optional;

public interface ItemService {


    Page<Item> findAll(Pageable pageable);

    Item createProduct(Item product);

    Item updateProduct(Item product);

    Optional<Item> updateProductById(long id, Item product);

    Boolean deleteProductById(long id);

    Optional<Item> findById(long id);
}
