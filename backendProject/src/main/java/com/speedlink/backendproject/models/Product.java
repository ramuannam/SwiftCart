package com.speedlink.backendproject.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends BaseModel{
    private String title;
    private double price;
    private Category category;
}

//  // we use setters and getters methods to avoid direct accessing of the private attributes, so using getters and setters we access the private attributes.
// And to avoid all the long list of getter an setter methods (redundant code) we use lombok library for setters and getters using annotation.