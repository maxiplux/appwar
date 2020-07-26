package plus.maxi.ldapsimulator.appwar.repositories;



import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import plus.maxi.ldapsimulator.appwar.models.items.Category;


@Repository
public interface CategoryRepository extends PagingAndSortingRepository<Category, Long> {


}
