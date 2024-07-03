package com.majortomdev.RezumeBE.controller;




import com.majortomdev.RezumeBE.model.UrlObject;
import com.majortomdev.RezumeBE.repository.UrlObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
/* Created by JKinahan */
@RestController
public class UrlObjectController {

    @Autowired
    UrlObjectRepository urlObjectRepository;

    @PostMapping("/saveUrl")
    UrlObject urlObj(@RequestBody UrlObject urlObjectTosave){
        return urlObjectRepository.save(urlObjectTosave);
    }

}
