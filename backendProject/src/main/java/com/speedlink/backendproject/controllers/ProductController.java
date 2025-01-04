package com.speedlink.backendproject.controllers;

import com.speedlink.backendproject.commons.AuthUtility;
import com.speedlink.backendproject.dtos.UserDto;
import com.speedlink.backendproject.exceptions.ProductNotFoundException;
import com.speedlink.backendproject.models.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.speedlink.backendproject.services.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
//listing all the product api's.
public class ProductController {

//    private FakeStoreProductService fakeStoreProductService; // never depend on direct implementation of the class, better to depend on interface.
    private  ProductService productService; //when spring creates object of productController spring need an object(as we can't create object of an interface) of  some class that creating/implementing this productService which is an Interface.(so here productService is being implemented by FakeStore service so that object of this FakeStore will be stored here, with the help of dependency injection, autowiring (using constructor).

    private AuthUtility authUtility;

    public ProductController(@Qualifier("FakeStoreProductService")
                             ProductService productService,
                             AuthUtility authUtility){ //using constructor for autowiring.
        this.productService=productService;
        this.authUtility=authUtility;
    }


    /// //////////////////////////////////////////////////1.getProductById
//       @GetMapping("/{id}")
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


       /// //////////////////////////////////////////////////////2.getAllProducts
//       @GetMapping()
//       public Page<Product> getAllProducts(@RequestParam("pageNumber") int pageNumber, @RequestParam("pageSize") int pageSize) throws ProductNotFoundException {
//        return  productService.getAllProducts( pageNumber,pageSize);
//       }


    //making validations:
    @GetMapping("/{tokenValue}")
    public ResponseEntity<List<Product>> getAllProducts(@PathVariable String tokenValue) {

        //make a call to userService/ Auth Service to validate this token.
        UserDto userDto=authUtility.validateToken(tokenValue); //separate utils class to handle common usecase as we may need validating token for every call.

        //create response entity to handle
        ResponseEntity<List<Product>> responseEntity=null;

        if(userDto==null){
            //token is invalid i,e, user after validation got null means this user is not presnt/ user token expired so now trying to access may cause UNAUTHORIZED ACCESS.
            responseEntity=new ResponseEntity<>(
              HttpStatus.UNAUTHORIZED
            );
            return responseEntity;

        }

        responseEntity=new ResponseEntity<>(
                productService.getAllProducts(),
               HttpStatus.OK );
        return responseEntity;
    }



    /// ////////////////////////////////////////////////3.updateProduct
       @PatchMapping("/{id}")  // partial update
       public   Product updateProduct(@PathVariable("id") Long id, @RequestBody Product product) throws ProductNotFoundException {
        return productService.updateProduct(id,product);
       }

       /// ////////////////////////////////////////////4.replaceProduct
       @PutMapping("/{id}")  // Complete update or complete replace
       public Product replaceProduct(@PathVariable("id") Long id, @RequestBody Product product){
           return null;

       }

       /// ////////////////////////////////////////5.deleteProduct
       @DeleteMapping("/{id}")
       public void deleteProduct(@PathVariable("id") Long productId){
        productService.deleteProduct(productId);
      }


      @PostMapping()
      public Product  addNewProduct( @RequestBody Product product){

             return productService.addNewProduct(product);


       }
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
