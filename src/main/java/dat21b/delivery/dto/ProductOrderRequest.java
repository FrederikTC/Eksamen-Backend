package dat21b.delivery.dto;

import dat21b.delivery.entity.ProductOrder;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class ProductOrderRequest {
    int productId;
    int quantity;

    public static ProductOrder getProductOrderEntity(ProductOrderRequest pod){
        return ProductOrder.builder()
                .productId(pod.productId)
                .quantity(pod.quantity)
                .build();
    }
}
