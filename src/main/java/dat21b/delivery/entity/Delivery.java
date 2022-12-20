package dat21b.rename_me.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

@Entity
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @OneToMany(cascade = CascadeType.ALL)
    List<ProductOrder> productOrder;

    private String deliveryDate;
    private String fromWarehouse;
    private String destination;

    public Delivery( List<ProductOrder> productOrder, String deliveryDate, String fromWarehouse, String destination) {
        this.productOrder = productOrder;
        this.deliveryDate = deliveryDate;
        this.fromWarehouse = fromWarehouse;
        this.destination = destination;

    }
}
