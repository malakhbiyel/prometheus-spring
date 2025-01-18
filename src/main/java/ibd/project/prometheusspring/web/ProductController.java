package ibd.project.prometheusspring.web;

import ibd.project.prometheusspring.entities.Product;
import ibd.project.prometheusspring.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

public class ProductController {
    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
}
