package dat21b.rename_me.repository;

import dat21b.rename_me.entity.ProductOrder;
import dat21b.rename_me.service.ProductOrderService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductOrderRepository extends JpaRepository<ProductOrder, Integer> {
}
