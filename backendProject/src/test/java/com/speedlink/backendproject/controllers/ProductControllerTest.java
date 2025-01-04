//package com.speedlink.backendproject.controllers;
//
//import com.speedlink.backendproject.models.Product;
//import com.speedlink.backendproject.services.ProductService;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import java.util.ArrayList;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static reactor.core.publisher.Mono.when;
//
//class ProductControllerTest {
//    //so we are testing the ProductController class, so we use original object of that class, but if there are any dependencies we mock them.
//
//
//    private ProductController productController;
//
//    //we write@MockBean to mock the obj, so it create a dummy object to work on it.(which is a dependency)
//    @MockBean
//    private ProductService productService;
//
//    public ProductControllerTest(   ProductController productController) {
//        this.productController = productController;
//
//    }
//
//    @Test
//    void testGetProductByIdPositive() {
//    }
//
//    @Test
//    void testGetProductByIdNegative() {
//    }
//
//    @Test
//    void testGetProductByIdThrowsException() {
//    }
//
//    @Test
//    void getAllProducts() {
//        //so here to get the products we mock the db by using in-memory db.
//
//        //hard codig the list of  db values
//        List<Products> expectedProducts = new ArrayList<>();
//
//        Product product1 = new Product();
//        product1.setTitle("Iphone");
//        product1.setPrice(10000.0);
//
//        Product product2 = new Product();
//        product2.setTitle("Iphone");
//        product2.setPrice(10000.0);
//
//        Product product3 = new Product();
//        product3.setTitle("Iphone");
//        product3.setPrice(10000.0);
//
//        expectedProducts.add(product1);
//        expectedProducts.add(product2);
//        expectedProducts.add(product3);
//
//        //when this condition hits it returns the list.
//        when(productService.getAllProducts()).thenReturn(expectedProducts);
//    }
//}