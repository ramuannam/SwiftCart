package com.speedlink.backendproject.services;

import com.speedlink.backendproject.exceptions.ProductNotFoundException;
import com.speedlink.backendproject.models.Category;
import com.speedlink.backendproject.models.Product;
import com.speedlink.backendproject.repositories.CategoryRepository;
import com.speedlink.backendproject.repositories.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("SelfProductService")
public class SelfProductService implements ProductService{
    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    //dependency Injection
    public SelfProductService (ProductRepository productRepository,
                               CategoryRepository categoryRepository){
        this.productRepository=productRepository;
        this.categoryRepository=categoryRepository;
    }

    @Override
    public Product getSingleProduct(Long productID) throws ProductNotFoundException {
       //make a call to DB to fetch a product with given id.
        Optional<Product> productOptional =  productRepository.findById(productID);

        if(productOptional.isEmpty()){
            throw new ProductNotFoundException("Product with id: " + productID+ " Doesn't Exist");
        }
        return productOptional.get();
    }

    @Override
    public  Page<Product> getAllProducts(int pageNumber, int pageSize) {

//        Sort sort=Sort.by("price").ascending().and(Sort.by("title").descending());
      return productRepository.findAll(
                PageRequest.of(pageNumber,pageSize,Sort.by("price").descending())  //directly passing sort parameter based on price in descending order.
        );
    }

    //Partial update : Patch
    @Override
    public Product updateProduct(Long id, Product product) throws ProductNotFoundException {
        Optional<Product> optionalProduct = productRepository.findById(id);

        if(optionalProduct.isEmpty()){
            throw new ProductNotFoundException("product with id"+ id + "doesn't exist");
        }

         Product productInDB=optionalProduct.get();

        if(product.getTitle() != null){
            productInDB.setTitle(product.getTitle());
        }

        if(product.getPrice() != null){
            productInDB.setPrice(product.getPrice());
        }

        return productRepository.save(productInDB);

    }

    //Replace: Put
    @Override
    public Product replaceProduct(Long id, Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);

    }

    @Override
    public Product addNewProduct(Product product) {
        Category category=product.getCategory();

//         if(category.getId()==null){  // if category doesnlt have id then first persist/save the id in category then save/persist the object.
//             //we need to create a new Category object in the DB first
//             Category updatedcategory = categoryRepository.save(category);
//             product.setCategory(updatedcategory); // assigning the updatedcategory to product.
//
//         }
          // the above commented code is handled by cascade.

         return productRepository.save(product);
    }


}



