package com.majortomdev.RezumeBE.controller;




import com.majortomdev.RezumeBE.model.UrlObject;
import com.majortomdev.RezumeBE.model.User;
import com.majortomdev.RezumeBE.repository.UrlObjectRepository;
import com.majortomdev.RezumeBE.service.UrlObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/* Created by JKinahan */
@RestController
@RequestMapping("/api/urlobjects")
public class UrlObjectController {

    @Autowired
    private UrlObjectService urlObjectService;

    @PostMapping("/saveUrl")
    public UrlObject urlObj(@RequestBody UrlObject urlObjectTosave){
        return urlObjectService.save(urlObjectTosave);
    }

    @GetMapping("/urlsByUserId/{userId}")
    public List<UrlObject> getAllUsersUrls(Long u) {
        return urlObjectService.findAllByUserId(u);
    }

}
