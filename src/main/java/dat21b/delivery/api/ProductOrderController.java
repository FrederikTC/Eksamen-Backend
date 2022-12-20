package dat21b.rename_me.api;


import dat21b.rename_me.dto.ProductOrderRequest;
import dat21b.rename_me.dto.ProductOrderResponse;
import dat21b.rename_me.dto.ProductRequest;
import dat21b.rename_me.dto.ProductResponse;
import dat21b.rename_me.entity.ProductOrder;
import dat21b.rename_me.service.ProductOrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/productorder")
@CrossOrigin
public class ProductOrderController {

    ProductOrderService productOrderService;

    public ProductOrderController(ProductOrderService productOrderService) {
        this.productOrderService = productOrderService;
    }

    @PostMapping
    public void addProductOrder(@RequestBody ProductOrderRequest body) {
        productOrderService.addProductOrder(body);

    }
    @GetMapping
    public List<ProductOrderResponse> getProductOrders(){
        List<ProductOrderResponse> pod = productOrderService.getProductOrders();
        return pod;
    }
}
