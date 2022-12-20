package dat21b.rename_me.dto;


import dat21b.rename_me.entity.ProductOrder;
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
