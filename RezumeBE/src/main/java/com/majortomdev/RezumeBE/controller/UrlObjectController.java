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

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/saveurl")
    public UrlObject urlObj(@RequestBody UrlObject urlObjectTosave){
        System.out.println("QQQ in add urlObj  the url:"+urlObjectTosave.getId());
        return urlObjectService.save(urlObjectTosave);
    }

    @CrossOrigin
    @GetMapping("/urlsbyuserid/{userId}")
    public List<UrlObject> getAllUsersUrls(@PathVariable Long userId) {
        System.out.println("LIST---LIST--LIST get list of urlObj");
        return urlObjectService.findAllByUserId(userId);
    }

}
