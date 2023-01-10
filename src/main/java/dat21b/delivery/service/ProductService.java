package dat21b.delivery.service;


import dat21b.delivery.dto.ProductRequest;
import dat21b.delivery.dto.ProductResponse;
import dat21b.delivery.entity.Product;
import dat21b.delivery.repository.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductResponse addProduct(ProductRequest productRequest){
        Product newProduct = ProductRequest.getProductEntity(productRequest);
        newProduct = productRepository.save(newProduct);
        return new ProductResponse(newProduct);
    }

    public List<ProductResponse> getProducts() {
        List<Product> products = productRepository.findAll();
        List<ProductResponse> response  = products.stream().map(product -> new ProductResponse(product)).collect(Collectors.toList());

        return response;
    }



    public List<ProductResponse> getProductbyName(ProductRequest body) {
        List<Product> products = productRepository.findProductByName(body.getName());
        List<ProductResponse> response = products.stream().map(product -> new ProductResponse(product)).collect(Collectors.toList());
        return response;
    }

    public String editProduct(ProductRequest body, int productId) {
        Product product = productRepository.findById(productId).orElseThrow(()-> new ResponseStatusException(HttpStatus.BAD_REQUEST,"Product with this id does not exit"));
        product.setName(body.getName());
        product.setPrice(body.getPrice());
        product.setWeight(body.getWeight());
        productRepository.save(product);
        return "Approved edit";
    }

    public String deleteProduct(int productId) {
        Product product = productRepository.findById(productId).orElseThrow(()-> new ResponseStatusException(HttpStatus.BAD_REQUEST,"Product with this id does not exit"));
        productRepository.delete(product);
        return "Approved delete";

    }
}

