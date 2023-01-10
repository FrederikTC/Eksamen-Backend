package dat21b.delivery.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    private String name;
    double price;
    double weight;


    public Product(String name, double price, double weight){
        this.name = name;
        this.price = price;
        this.weight = weight;

    }
}
