package com.majortomdev.RezumeBE.repository;

import com.majortomdev.RezumeBE.model.UrlObject;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/* Created by JKinahan */
public interface UrlObjectRepository extends JpaRepository<UrlObject, Long> {
    List<UrlObject> findAllByUser(Long user);
}
