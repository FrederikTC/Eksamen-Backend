package dat21b.rename_me.dto;

import dat21b.rename_me.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ProductResponse {
    int id;
    String name;
    double price;
    double weight;

    public ProductResponse(Product productEntity){
        this.id = productEntity.getId();
        this.name = productEntity.getName();
        this.price = productEntity.getPrice();
        this.weight = productEntity.getWeight();
    }

    public ProductResponse(Product product, boolean includeAll) {
    }
}
