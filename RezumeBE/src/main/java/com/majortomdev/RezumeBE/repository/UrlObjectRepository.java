package com.majortomdev.RezumeBE.repository;

import com.majortomdev.RezumeBE.model.UrlObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/* Created by JKinahan */
@Repository
public interface UrlObjectRepository extends JpaRepository<UrlObject, Long> {
    //List<UrlObject> findAllByUserId(Long userId);
    List<UrlObject> findByUserId(Long userId);
}
