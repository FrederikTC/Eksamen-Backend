package dat21b.rename_me.dto;

import dat21b.rename_me.entity.Delivery;
import dat21b.rename_me.entity.ProductOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryRequest {
    List<ProductOrder> productOrders;
    String deliveryDate;
    String fromWarehouse;
    String destination;

    public static Delivery getDeliveryEntity(DeliveryRequest dr){
        return Delivery.builder()
                .productOrder(dr.productOrders)
                .deliveryDate(dr.deliveryDate)
                .fromWarehouse(dr.fromWarehouse)
                .destination(dr.destination)
                .build();
    }
}
