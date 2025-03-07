package com.speedlink.backendproject.repositories;

import com.speedlink.backendproject.models.Product;
import com.speedlink.backendproject.projections.ProductWithIdAndTitle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
//ProductRepository should contain all the methods(CRUD) related to product model.
public interface ProductRepository extends JpaRepository<Product,Long> {
    /*
    1.Repository should be an interface
    2.Repository should extend JPARepository with Input of the model you wanna interact amd type of the model(table primary key type.)
     */

      List<Product> findByPriceIsGreaterThan(Double price);
         //internally hibernate write the sql query for this: Select * from products where price>?

      List<Product> findProductByTitleLike(String word);  //case sensitive
      //select * from products where title like '%iphone%'

      List<Product> findByTitleLikeIgnoreCase(String word); //case insensitive

      List<Product> findTop5ByTitleContains(String word);
      //select * from products where title like 'word' LIMIT 5

      Optional<Product> findById(Long id);

      Page<Product> findAll(Pageable pageable);  //here no need of optional as list cant ne null and in worst case it can be empty and its ok to be empty.


      //HQL
      @Query("select p.id as id, p.title as title  from Product p where p.id=:x")
      List<ProductWithIdAndTitle> randomSearchMethod(Long x);

      //SQL
      @Query(value = "select p.id as id, p.title as title from product p where p.id = :productId", nativeQuery = true)
      List<ProductWithIdAndTitle> randomSearchMethod2(Long productId);


}
/*
1. Repository should be an interface.
2. Repository should extend JPARepository.

Optional<Product> optionalProduct = productRepository.findById(100);

String title = p.getTitle(); // NPE


Read -> done

 */