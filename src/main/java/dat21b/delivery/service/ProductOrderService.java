package dat21b.rename_me.service;

import dat21b.rename_me.dto.ProductOrderRequest;
import dat21b.rename_me.dto.ProductOrderResponse;
import dat21b.rename_me.dto.ProductRequest;
import dat21b.rename_me.dto.ProductResponse;
import dat21b.rename_me.entity.Product;
import dat21b.rename_me.entity.ProductOrder;
import dat21b.rename_me.repository.ProductOrderRepository;
import dat21b.rename_me.repository.ProductRepository;
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

    /*
    public ProductOrderResponse productOrder(int productId, int quantity){

        ProductOrder productOrder = new ProductOrder(productId,quantity);
        ProductOrder order = productOrderRepository.save(productOrder);
        return new ProductOrderResponse(order);
    }

     */
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
