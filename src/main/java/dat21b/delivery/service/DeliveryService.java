package dat21b.rename_me.service;

import dat21b.rename_me.dto.*;
import dat21b.rename_me.entity.Delivery;
import dat21b.rename_me.entity.Product;
import dat21b.rename_me.repository.DeliveryRepository;
import dat21b.rename_me.repository.ProductOrderRepository;
import dat21b.rename_me.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DeliveryService {

    ProductOrderRepository productOrderRepository;
    DeliveryRepository deliveryRepository;
    ProductRepository productRepository;

    public DeliveryService(DeliveryRepository deliveryRepository, ProductOrderRepository productOrderRepository, ProductRepository productRepository){
        this.deliveryRepository = deliveryRepository;
        this.productOrderRepository = productOrderRepository;
        this.productRepository = productRepository;

    }
    public DeliveryResponse deliverOrder(DeliveryRequest deliveryRequest) {
        Delivery newDelivery = DeliveryRequest.getDeliveryEntity(deliveryRequest);
        newDelivery = deliveryRepository.save(newDelivery);
        return new DeliveryResponse(newDelivery);

    }
    public List<DeliveryResponse> getDeliveries(){
        List<Delivery> deliveries = deliveryRepository.findAll();
        List<DeliveryResponse> response = deliveries.stream().map(del-> new DeliveryResponse(del)).collect(Collectors.toList());
        return response;
               /*
        public ProductResponse addProduct(ProductRequest productRequest){
            Product newProduct = ProductRequest.getProductEntity(productRequest);
            newProduct = productRepository.save(newProduct);
            return new ProductResponse(newProduct);
        }
*/

    }

}

