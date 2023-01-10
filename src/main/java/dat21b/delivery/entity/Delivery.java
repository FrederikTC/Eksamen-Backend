package dat21b.delivery.entity;

import lombok.*;

import javax.persistence.*;
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
