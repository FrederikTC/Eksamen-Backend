package dat21b.delivery.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import dat21b.delivery.entity.Delivery;
import dat21b.delivery.entity.ProductOrder;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)

public class DeliveryResponse {

    int id;
    List<ProductOrder> productOrders;
    String deliveryDate;
    String fromWarehouse;
    String destination;

    public DeliveryResponse(Delivery d) {
        this.id = d.getId();
        this.productOrders = d.getProductOrder();
        this.deliveryDate = d.getDeliveryDate();
        this.fromWarehouse = d.getFromWarehouse();
        this.destination = d.getDestination();

    }
}
