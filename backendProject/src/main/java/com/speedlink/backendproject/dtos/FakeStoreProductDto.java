package com.speedlink.backendproject.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto { // this is replica/ intermediary which is similar to client/ backend api data format or blueprint to exchange  the data between them.
  private  Long id;
  private String title;
  private double price;
  private String category;
  private String description;
  private String image;
}
