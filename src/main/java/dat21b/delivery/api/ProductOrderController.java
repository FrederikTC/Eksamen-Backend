package dat21b.delivery.api;

import dat21b.delivery.dto.ProductOrderRequest;
import dat21b.delivery.dto.ProductOrderResponse;
import dat21b.delivery.service.ProductOrderService;
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
    public List<ProductOrderResponse> getProductOrders() {
        List<ProductOrderResponse> pod = productOrderService.getProductOrders();
        return pod;
    }
}
