package dat21b.delivery.configuration;


import dat21b.delivery.entity.Product;
import dat21b.delivery.entity.ProductOrder;
import dat21b.delivery.repository.DeliveryRepository;
import dat21b.delivery.repository.ProductOrderRepository;
import dat21b.delivery.repository.ProductRepository;
import dat21b.delivery.service.ProductOrderService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;

@Controller
public class SetupDevUsers implements ApplicationRunner {

    ProductRepository productRepository;
    ProductOrderService productOrderService;
    ProductOrderRepository productOrderRepository;
    DeliveryRepository deliveryRepository;


    public SetupDevUsers(ProductRepository productRepository, ProductOrderService productOrderService, ProductOrderRepository productOrderRepository, DeliveryRepository deliveryRepository) {
        this.productRepository = productRepository;
        this.productOrderService = productOrderService;
        this.productOrderRepository = productOrderRepository;
        this.deliveryRepository = deliveryRepository;
    }


    @Override
    public void run(ApplicationArguments args) {

        Product product1 = Product.builder()
                .name("Vodka")
                .price(85)
                .weight(1)
                .build();

        Product product2 = Product.builder()
                .name("Gin")
                .price(125)
                .weight(2)
                .build();
        Product product3 = Product.builder()
                .name("Snaps")
                .price(150)
                .weight(3)
                .build();

        Product product4 = Product.builder()
                .name("Saftevand")
                .price(50)
                .weight(4)
                .build();

        productRepository.save(product1);
        productRepository.save(product2);
        productRepository.save(product3);
        productRepository.save(product4);

        ProductOrder productOrder1 = ProductOrder.builder()
                .productId(1)
                .quantity(4)
                .build();
        ProductOrder productOrder2 = ProductOrder.builder()
                .productId(2)
                .quantity(5)
                .build();
        ProductOrder productOrder3 = ProductOrder.builder()
                .productId(3)
                .quantity(4)
                .build();
        ProductOrder productOrder4 = ProductOrder.builder()
                .productId(4)
                .quantity(5)
                .build();

        productOrderRepository.save(productOrder1);
        productOrderRepository.save(productOrder2);
        productOrderRepository.save(productOrder3);
        productOrderRepository.save(productOrder4);
/*
        List<ProductOrder> productOrderList = productOrderRepository.findAll();
        Delivery deliver1 = Delivery.builder()
                .productOrder(productOrderList)
                .deliveryDate("d4")
                .fromWarehouse("Hytten")
                .destination("bjerget")
                .build();
        deliveryRepository.save(deliver1);
*/
    }

}

