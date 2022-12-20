package dat21b.rename_me.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@Entity

public class ProductOrder {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int productId;
    int quantity;




    public ProductOrder(int id, int productId, int quantity){
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
    }
}
