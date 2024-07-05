package com.hustler.scalerschool.service;


import com.hustler.scalerschool.model.Contact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    public boolean saveMessageDetails(Contact contact) {
        Logger log = LoggerFactory.getLogger(ContactService.class);
        boolean isSaved = true;
        //TODO: Need to persist the data into the DB table
        log.info(contact.toString());
        return isSaved;
    }
}
