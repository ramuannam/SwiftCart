package com.speedlink.backendproject.controllerAdvice;

import com.speedlink.backendproject.dtos.ExceptionDto;
import com.speedlink.backendproject.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class globalExceptionHandler {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<ExceptionDto> handleArithmeticException(){
        ExceptionDto exceptionDto =new ExceptionDto();
        exceptionDto.setMessage("Arithmetic exception has happened");
        exceptionDto.setSolution("I don't know, try out on your own");

        ResponseEntity<ExceptionDto> response=new ResponseEntity<>(
//                "Something went wrong, coming from Controller Advice", //instead of jus sending a string am sending an object with few more information.
                exceptionDto,
                HttpStatus.NOT_FOUND
        );
        return response;
    }

    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    public ResponseEntity<String> handleArrayIndexOutOfBoundException(){
        ResponseEntity<String> response=new ResponseEntity<>(
                "ArrayIndexOutOfBoundException has happened",
                HttpStatus.BAD_REQUEST
        );
        return response;
    }

//    @ExceptionHandler(NullPointerException.class)
//    public ResponseEntity<String> handleNullPointerExceptionException(){
//        ResponseEntity<String> response=new ResponseEntity<>(
//                "NullPointerExceptionException has happened",
//                HttpStatus.NOT_FOUND
//        );
//        return response;
//    }

    @ExceptionHandler(ProductNotFoundException.class) //custom Exception
    public ResponseEntity<ExceptionDto> handleProductNotFound(){
         ExceptionDto exceptionDto=new ExceptionDto();

//         TODO: pass the input id in the ExceptionDto.
         exceptionDto.setMessage("Product not found");
         exceptionDto.setSolution("Please try again with a valid product id");

         ResponseEntity<ExceptionDto> response=new ResponseEntity<>(
                 exceptionDto,
                 HttpStatus.BAD_REQUEST
         );
         return  response;
    }
}
