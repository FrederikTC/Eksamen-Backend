package dat21b.rename_me.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dat21b.rename_me.entity.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findProductByName(String name);

}
