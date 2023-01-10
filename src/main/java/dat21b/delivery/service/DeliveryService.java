package dat21b.delivery.service;

import dat21b.delivery.dto.*;
import dat21b.delivery.entity.Delivery;
import dat21b.delivery.repository.DeliveryRepository;
import dat21b.delivery.repository.ProductOrderRepository;
import dat21b.delivery.repository.ProductRepository;
import org.springframework.stereotype.Service;

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


    }

}

