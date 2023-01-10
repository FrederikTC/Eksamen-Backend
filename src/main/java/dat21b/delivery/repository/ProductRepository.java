package dat21b.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dat21b.delivery.entity.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findProductByName(String name);

}
