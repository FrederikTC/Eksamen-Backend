package dat21b.rename_me.dto;

import dat21b.rename_me.entity.Product;
import dat21b.rename_me.entity.ProductOrder;
import lombok.*;
import org.springframework.stereotype.Service;

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
