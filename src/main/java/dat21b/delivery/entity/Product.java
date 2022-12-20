package dat21b.rename_me.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
