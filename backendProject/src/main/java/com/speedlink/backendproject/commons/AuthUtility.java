package com.speedlink.backendproject.commons;

//so we are implementing auth class as seperate class ina package, as we can do this validation in controller/service class but again we need to change the method signature of the interface and its implementations, so to avoid changing of the existing code we created a seperated package as Commons, and also the validation needs to be made for every request so this can be used at multiple places, so its better to have separate class where we can use it from.

import com.speedlink.backendproject.dtos.UserDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AuthUtility {
    private RestTemplate restTemplate;
    public AuthUtility(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public UserDto validateToken(String tokenValue){
        //so  UserService returning a UserDto so we need to catch the UserDto from UserSevice,as we are communicating b/w two microservices we need that.

        //so UserService acts like third party service, so if we need to communicate with third party service we need to use RestTemplate object.
        // so we have RestTemplate bean created in Configurations package we jus use that bean.

        //making call from productService to userService using restTemplate.
         UserDto userDto=  restTemplate.getForObject(
                "http://localhost:8080/users/validate/"+tokenValue, //THIS IS the api we call to validate the token.
                     UserDto.class     // type of response we are expecting from this call.so that restTemplate can convert the output of this above url to this object(of this UserDto class).
        );

         //now i need to validate this userDto, if its Null then token is invalid else its valid.(we do this validation in ProductController)

        return userDto;

    }

}


/*
Use of RestTemplate in Spring Boot
RestTemplate is a synchronous client provided by Spring Framework for consuming RESTful web services. It simplifies the process of sending HTTP requests and handling HTTP responses.

Common Use Cases
a)Making HTTP Requests:
GET, POST, PUT, DELETE, etc.
b)Consuming APIs:
External APIs (e.g., weather, stock prices, etc.).
Internal microservices within a system.
c)Handling JSON/XML Responses:
Automatically converts responses to Java objects using ObjectMapper.
---------
Key Features:
Supports HTTP methods: GET, POST, PUT, DELETE, PATCH, OPTIONS, HEAD.
Converts JSON/XML to Java objects (and vice versa) using message converters.
Handles request headers, query parameters, and body payloads.
 */