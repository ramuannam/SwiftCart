package com.speedlink.backendproject.services;

import com.speedlink.backendproject.exceptions.ProductNotFoundException;
import com.speedlink.backendproject.models.Product;

import java.util.List;

//All the methods of the Interface are public and static by default.
//good to create a productService "interface" than attaching the controller directly to a particular class( particular service), so that loose coupling achieved and switching between services like in bank example switching to one bank toanother bank or eg:2 switching to one db to other as these different services can be implemented based on the particular interface, so all these services should have same methods, return types etc,..
public interface ProductService {
     Product getSingleProduct(Long productID) throws ProductNotFoundException;

     List<Product> getAllProducts();

     Product updateProduct(Long id, Product product) throws ProductNotFoundException;

     Product replaceProduct(Long id , Product product);

     void deleteProduct(Long id);

     Product addNewProduct(Product product);

}
