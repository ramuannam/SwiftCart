package com.speedlink.backendproject.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

import java.util.Date;
@Getter
@Setter
@MappedSuperclass // for saying this class as mapped super class.
public class BaseModel implements Serializable { //base model is like where common attributes reside, so that we can inherit these into other classes.
    @Id //for primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto Increment
    private Long id;
    private Date createdAt;
    private Date updatesAt;
}







