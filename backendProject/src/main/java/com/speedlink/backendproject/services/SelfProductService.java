package com.speedlink.backendproject.services;

import com.speedlink.backendproject.exceptions.ProductNotFoundException;
import com.speedlink.backendproject.models.Product;
import com.speedlink.backendproject.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelfProductService implements ProductService{
    private ProductRepository productRepository;

    //dependency Injection
    public SelfProductService (ProductRepository productRepository){
        this.productRepository=productRepository;
    }

    @Override
    public Product getSingleProduct(Long productID) throws ProductNotFoundException {
       //make a call to DB to fetch a product with given id.

        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        return null;
    }

    @Override
    public Product replaceProduct(Long id, Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {

    }
}
