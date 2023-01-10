package dat21b.delivery.repository;

import dat21b.delivery.entity.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<Delivery, Integer> {
}
