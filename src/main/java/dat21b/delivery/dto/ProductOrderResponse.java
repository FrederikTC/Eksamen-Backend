package dat21b.delivery.dto;


import dat21b.delivery.entity.ProductOrder;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductOrderResponse {
    int id;
    int productId;
    int quantity;

    public ProductOrderResponse(ProductOrder p){
        this.id = p.getId();
        this.productId = p.getProductId();
        this.quantity = p.getQuantity();

    }
}
