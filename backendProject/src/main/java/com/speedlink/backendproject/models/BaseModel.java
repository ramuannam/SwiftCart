package com.speedlink.backendproject.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class BaseModel { //base model is like where common attributes reside, so that we can inherit these into other classes.
    private long id;
    private Date createdAt;
    private Date updatesAt;

}
