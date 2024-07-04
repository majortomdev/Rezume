package com.majortomdev.RezumeBE.repository;

import com.majortomdev.RezumeBE.model.UrlObject;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


/* Created by JKinahan */
public interface UrlObjectRepository extends JpaRepository<UrlObject, Long> {
    List<UrlObject> findAllByUser(Long user);
}
