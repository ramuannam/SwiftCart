package com.speedlink.backendproject.repositories;

import com.speedlink.backendproject.models.Product;
import com.speedlink.backendproject.projections.ProductWithIdAndTitle;
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

      List<Product> findAll(Sort sort);  //here no need of optional as list cant ne null and in worst case it can be empty and its ok to be empty.


      //hql
      @Query("select p.id as id, p.title as title  from Product p where p.id=:x")
      List<ProductWithIdAndTitle> randomSearchMethod(Long x);

      //sql

}
