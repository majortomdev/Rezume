package com.majortomdev.RezumeBE.service;

import com.majortomdev.RezumeBE.model.UrlObject;
import com.majortomdev.RezumeBE.repository.UrlObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UrlObjectService {

    @Autowired
    private UrlObjectRepository urlObjectRepository;

    public List<UrlObject> findAllByUserId(Long userId) {
        return urlObjectRepository.findAllByUserId(userId);
    }

    public UrlObject save(UrlObject urlObject) {
        return urlObjectRepository.save(urlObject);
    }
}
