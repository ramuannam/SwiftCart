package com.speedlink.backendproject.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends BaseModel{
    private String title;
    private Double price;

    // here many means the current table(product)
    @ManyToOne (cascade = CascadeType.REMOVE) // SO WHEN you save the product object, then automatically save(save means  automatically increments the id in db table and saves the incoming attributes/object the category id if the incoming object doesn't have the id.
    private Category category;
}
/*
Cardinality between product and category.
  1     ------->   1
product <-----> category = M:1   SO id of one side in many side. ie,. category id in product table.(simple)
   m   <--------   1

 */


//  // we use setters and getters methods to avoid direct accessing of the private attributes, so using getters and setters we access the private attributes.
// And to avoid all the long list of getter an setter methods (redundant code) we use lombok library for setters and getters using annotation.