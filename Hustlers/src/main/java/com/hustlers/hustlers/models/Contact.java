package com.hustlers.hustlers.models;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;


/*
@Data annotation is provided by Lombok library which generates getter, setter,
equals(), hashCode(), toString() methods & Constructor at compile time.
This makes our code short and clean.
* */
@Data
public class  Contact {
    //maintaining the same attributes names from the html so to match directly with this class attributes.

    /*
 * @NotNull: Checks if a given field is not null but allows empty values & zero elements inside collections.
   @NotEmpty: Checks if a given field is not null and its size/length is greater than zero.
   @NotBlank: Checks if a given field is not null and trimmed length is greater than zero.
 * */


    @NotBlank(message="Name must not be blank")  // validation with an error message
    @Size(min=3,message="Name must be atleast 3 characters long")
    private String name;

    @NotBlank(message="Mobile number must not be blank")
    @Pattern(regexp="(^$|[0-9]{10})", message="Mobile number must be 10 digits")
    private String mobileNum;

    @NotBlank(message="Email must not be blank")
    @Email(message="please provide a valid Email address")
    private String email;

    @NotBlank(message="Subject must not be blank")
    @Size(min=5, message="Subject must be atleast 5 characters long")
    private String subject;

    @NotBlank(message="Message must not be blank")
    @Size(min=10, message="Message must be atleast 10 characters long")
    private String message;


}

//for this class: here in this case we have a NoArgumentsConstructor available because I have not defined my variables
//as final, which means If Someone updating my variables available inside my Contact pojo class with the setter methods.
//So in this scenario, my Lombok is smart enough to understand that since the fields are not final, it generated a NoArgumentConstructor.

//ctrl+F12 to see list of methods, constructors, etc.. to see.
