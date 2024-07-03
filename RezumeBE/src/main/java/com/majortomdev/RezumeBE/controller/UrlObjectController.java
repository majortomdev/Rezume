package com.majortomdev.RezumeBE.controller;




import com.majortomdev.RezumeBE.model.UrlObject;
import com.majortomdev.RezumeBE.model.User;
import com.majortomdev.RezumeBE.repository.UrlObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/* Created by JKinahan */
@RestController
public class UrlObjectController {

    @Autowired
    UrlObjectRepository urlObjectRepository;

    @PostMapping("/saveUrl")
    UrlObject urlObj(@RequestBody UrlObject urlObjectTosave){
        return urlObjectRepository.save(urlObjectTosave);
    }

    @GetMapping("/urlsByUserId/{userId}")
    List<UrlObject> getAllUsersUrls(@PathVariable("userId") Long u) {
        return urlObjectRepository.findAllByUser(u);
    }

}
