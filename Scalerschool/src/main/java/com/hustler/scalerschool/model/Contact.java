package com.hustler.scalerschool.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contact {
    //maintaining the same attributes names from the html so to match directly with this class attributes.
    private String name;
    private String mobileNum;
    private String email;
    private String subject;
    private String message;

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", mobileNum='" + mobileNum + '\'' +
                ", email='" + email + '\'' +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
