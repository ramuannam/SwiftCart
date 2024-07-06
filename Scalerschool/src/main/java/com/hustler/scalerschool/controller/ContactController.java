package com.hustler.scalerschool.controller;

import com.hustler.scalerschool.model.Contact;
import com.hustler.scalerschool.service.ContactService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class ContactController { //created new controller for contact as contact as some few more details and info to handle like with db etc.. so created separate controller.

    private static Logger log= LoggerFactory.getLogger(ContactController.class);

   // DI
    private final ContactService contactService;
    @Autowired
     public ContactController (ContactService contactService){
         this.contactService=contactService;
     }

    @RequestMapping("/contact")
    public String displayContactPage(){
         return "contact.html";
     }

//     @PostMapping("/saveMsg")  // OR//@RequestMapping(value="/saveMsg", method = POST)
//     public ModelAndView saveMessage(@RequestParam String name, @RequestParam String mobileNum, @RequestParam String email,
//                                     @RequestParam String subject, @RequestParam String message ){ // you can use either @RequstParam or @PathVariable . NOte: here the varible name should match with the names used in html or you can use diff variable names in method but you need to use @PathVaribale("name") String username.
//        log.info("Name : " + name);
//        log.info("Mobile Number "+ mobileNum);
//        log.info("Email Address" + subject);
//        log.info("Subject "+ subject);
//        log.info("Message "+ message);
//        return new ModelAndView("redirect:/contact"); //so  here after the data submitted to backend, here we are creating new ModelAndView Object and  in this we jus redirecting to contact page without changing any attributes in this object, the user will redirect to contact page again with fresh page.
//     }

    //so instead of  variables in method we used an object.
    @RequestMapping(value = "/saveMsg", method = POST)  // OR SIMPLY @PostMapping("/saveMsg")
    public ModelAndView saveMsg(Contact contact){ // by using POJO object all the attributes from client gets mapped to the object and assigned to the object.
         contactService.saveMessageDetails(contact); // taking the given object to service layer to do some logic.
           return new ModelAndView("redirect:/contact");
    }
}
