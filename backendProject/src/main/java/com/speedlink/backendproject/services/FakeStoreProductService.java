package com.speedlink.backendproject.services;

import com.speedlink.backendproject.dtos.FakeStoreProductDto;
import com.speedlink.backendproject.models.Category;
import com.speedlink.backendproject.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


@Service//creates object of this class in spring context.
public class FakeStoreProductService implements ProductService { // so here compiler force you to implement all the methods of the interface as we are implementing an interface. jus right clcik and generate
   //using restTemplate object here which is in App context using DI (with the help of constructor)
   private RestTemplate restTemplate;
   public FakeStoreProductService (RestTemplate restTemplate){
         this.restTemplate=restTemplate;
   }
    @Override
    public Product getSingleProduct(Long productId) {
        //Now lets call fakeStore to Fetch the product with given id. => HTTP CALL
        //so using RestTemplate (which is a class in spring web) allow you to make call http to third party systems.
        //   RestTemplate restTemplate=new RestTemplate();
      FakeStoreProductDto fakeStoreProductDto =  restTemplate.getForObject(
                "https://fakestoreapi.com/products/" + productId, FakeStoreProductDto.class
        );

      //finally converting the FakeStoreProductDto object to product object.
      return convertFakeStoreProductToProduct(fakeStoreProductDto);
    }

    @Override
//    public List<Product> getAllProducts() {
//        List<FakeStoreProductDto> fakeStoreProductDtos=restTemplate.getForObject(
//                "https://fakestoreapi.com/products" , List<FakeStoreProductDto>.class);  // so here instead of list we use simple array as at runtime we don't even have the list<FakeStoreProductDto> type list or you can say at runtime we don't have list of specific type.
    public List<Product> getAllProducts() { //we use array as it doesn't uses "Generics".
            FakeStoreProductDto [] fakeStoreProductDtos=restTemplate.getForObject(
                    "https://fakestoreapi.com/products" , FakeStoreProductDto[].class);
            //converting list of fakeStoreDtos to List Products.
        List<Product>products=new ArrayList<>();
        for(FakeStoreProductDto fakeStoreProductDto : fakeStoreProductDtos){
            products.add(convertFakeStoreProductToProduct(fakeStoreProductDto));
        }
        return products;

    }

    //using a method as for the conversion to Product as this conversion need multiple times.
    private Product convertFakeStoreProductToProduct(FakeStoreProductDto fakeStoreProductDto){
        Product product =new Product();
        product.setId(fakeStoreProductDto.getId());
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setPrice(fakeStoreProductDto.getPrice());

        Category category=new Category();
        category.setDescription(fakeStoreProductDto.getCategory()); //as category is an object in product object so we created the category object and the data we are getting from the fakeStoreProductDto objetc is string of description so we set the description of category object from the fakeStoreProductDto category and lastly we set the category that category to product object.
        product.setCategory(category);

        return  product;
    }
}
