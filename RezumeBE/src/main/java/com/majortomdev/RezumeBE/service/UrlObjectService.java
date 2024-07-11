package com.majortomdev.RezumeBE.service;
/* Created by JKinahan */
import com.majortomdev.RezumeBE.model.UrlObject;
import com.majortomdev.RezumeBE.repository.UrlObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrlObjectService {

    @Autowired
    private UrlObjectRepository urlObjectRepository;

    public List<UrlObject> findAllByUserId(Long userId) {
        return urlObjectRepository.findByUserId(userId);
    }

    public UrlObject save(UrlObject urlObject) {
        return urlObjectRepository.save(urlObject);
    }
}
