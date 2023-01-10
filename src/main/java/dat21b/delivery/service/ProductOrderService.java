package dat21b.delivery.service;

import dat21b.delivery.dto.ProductOrderRequest;
import dat21b.delivery.dto.ProductOrderResponse;
import dat21b.delivery.entity.ProductOrder;
import dat21b.delivery.repository.ProductOrderRepository;
import dat21b.delivery.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductOrderService {
    ProductRepository productRepository;
    ProductOrderRepository productOrderRepository;

    public ProductOrderService(ProductRepository productRepository, ProductOrderRepository productOrderRepository){
        this.productRepository = productRepository;
        this.productOrderRepository = productOrderRepository;
    }

    public List<ProductOrderResponse> getProductOrders(){
        List<ProductOrder> productOrders = productOrderRepository.findAll();
        List<ProductOrderResponse> productResponses = productOrders.stream().map(pod-> new ProductOrderResponse(pod)).collect(Collectors.toList());
        return productResponses;
    }
    public ProductOrderResponse addProductOrder(ProductOrderRequest productOrderRequest){
        ProductOrder newProductOrder = ProductOrderRequest.getProductOrderEntity(productOrderRequest);
        newProductOrder = productOrderRepository.save(newProductOrder);
        return new ProductOrderResponse(newProductOrder);
    }
}
