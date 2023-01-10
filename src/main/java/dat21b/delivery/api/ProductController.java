package dat21b.delivery.api;

import dat21b.delivery.dto.ProductRequest;
import dat21b.delivery.dto.ProductResponse;
import dat21b.delivery.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/products")
@CrossOrigin
public class ProductController {
    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ProductResponse addProduct(@RequestBody ProductRequest body) {
        return productService.addProduct(body);
    }

    @GetMapping
    public List<ProductResponse> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/getProductByName")
    public List<ProductResponse> getProductById(@RequestBody ProductRequest body) {
        return productService.getProductbyName(body);
    }

    @PutMapping("/{productId}")
    public String editProduct(@RequestBody ProductRequest body, @PathVariable int productId) {
        return productService.editProduct(body, productId);
    }

    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable int productId) {
        return productService.deleteProduct(productId);
    }

}
