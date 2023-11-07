package com.example.product.service;

import com.example.product.contract.Product;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api(tags = "Product APIs")
public class ProductController {
    private static List<Product> products = new ArrayList< >();

    public ProductController() {
        products.add(new Product(1,"Shoe",1000, "Fashion"));
        products.add(new Product(2,"Mobile Phone",15000, "Gadget"));
        products.add(new Product(3,"Microwave Oven",10000, "Appliances"));
        products.add(new Product(4,"HeadPhone",5000, "Gadget"));
    }


    @ApiOperation(value = "Get all products", notes = "Retrieves a list of all products.")
    @GetMapping("/products")
    public List< Product > getProducts() {
        return products;//ResponseEntity.ok(products);
    }

    @GetMapping("/product/{id}")
    @ApiOperation(value = "Get a product by ID", notes = "Retrieves a specific product by its ID.")
    public Product getProducts(@PathVariable int id) {
        return findProduct(id);
    }

    private Product findProduct(int id) {
        return products.stream()
                .filter(product -> product.getId()
                        .equals(id))
                .findFirst()
                .orElse(null);
    }
}
