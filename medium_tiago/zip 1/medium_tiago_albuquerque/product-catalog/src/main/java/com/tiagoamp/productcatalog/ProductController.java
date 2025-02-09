package com.tiagoamp.productcatalog;

import com.tiagoamp.productcatalog.repository.ProductEntity;
import com.tiagoamp.productcatalog.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/product")
    public List<ProductEntity> getProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/product/{id}")
    ProductEntity findById(@PathVariable("id") Long id){
        Optional<ProductEntity> pe = productRepository.findById(id);
        return pe.get();
    }
}


//-- OVERRIDE findALL() method in CrudRepository - returns List, not Iterable (  Iterable<T> findAll(); )
//public interface NotificationRepository extends CrudRepository<NotificationEntity, Integer> {
//
//    @Override
//    List<NotificationEntity> findAll();