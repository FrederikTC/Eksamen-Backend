package dat21b.delivery.repository;

import dat21b.delivery.entity.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductOrderRepository extends JpaRepository<ProductOrder, Integer> {
}
