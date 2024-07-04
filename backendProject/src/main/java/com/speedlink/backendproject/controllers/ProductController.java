package com.speedlink.backendproject.controllers;

import com.speedlink.backendproject.models.Product;
import com.speedlink.backendproject.services.FakeStoreProductService;
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
       public Product getProductById(@PathVariable("id") Long id){   //if you pass an id it should return Product object.
           return  productService.getSingleProduct(id);
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
