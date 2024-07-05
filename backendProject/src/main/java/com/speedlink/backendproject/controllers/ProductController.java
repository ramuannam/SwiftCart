package com.speedlink.backendproject.controllers;

import com.speedlink.backendproject.exceptions.ProductNotFoundException;
import com.speedlink.backendproject.models.Product;
import com.speedlink.backendproject.services.FakeStoreProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.speedlink.backendproject.services.ProductService;
import org.springframework.web.client.RestTemplate;



import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
//listing all the product api's.
public class ProductController {

//    private FakeStoreProductService fakeStoreProductService; // never depend on direct implementation of the class, better to depend on interface.
    public ProductService productService; //when spring creates object of productController spring need an object(as we can't create object of an interface) of  some class that creating/implementing this productService which is an Interface.(so here productService is being implemented by FakeStore service so that object of this FakeStore will be stored here, with the help of dependency injection, autowiring (using constructor).
    public ProductController(ProductService productService){ //using constructor for autowiring.
        this.productService=productService;
    }

       @GetMapping("{id}")
       public ResponseEntity<Product> getProductById(@PathVariable("id") Long id) throws ProductNotFoundException {   //if you pass an id it should return Product object in the Response Entity.

//        ResponseEntity<Product> responseEntity=null;
//                try{
//                  Product product=  productService.getSingleProduct(id);
//                  responseEntity=new ResponseEntity<>(
//                          product,
//                          HttpStatus.OK
//                  );
//                } catch (RuntimeException e){
//                    responseEntity= new ResponseEntity<>(
//                            HttpStatus.NOT_FOUND
//                    );
//           }
//                return responseEntity;

//        throw new RuntimeException("Something went wrong");

                   ResponseEntity<Product> response=new ResponseEntity<>(
                   productService.getSingleProduct(id),
                    HttpStatus.OK
           );
           return  response;
       }

       @GetMapping()
       public List<Product> getAllProducts(){
        return  productService.getAllProducts();
       }

       @PatchMapping("/{id}")  // partial update
       public   Product updateProduct(@PathVariable("id") Long id,@RequestBody Product product){
        return productService.updateProduct(id,product);
       }

       @PutMapping("/{id}")  // Complete update or complete replace
       public Product replaceProduct(@PathVariable("id") Long id,@RequestBody Product product){
           return null;

       }
       public void deleteProduct(Long productId){
      }
//      public addProduct(){
//
//       }
//       public limitResults(){
//
//       }
//
//       public getAllCategories(){
//
//       }
//       public getInCategory(){
//
//       }
}
