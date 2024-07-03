package com.majortomdev.RezumeBE.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.List;
/* Created by JKinahan */
@Entity
public class UrlObject {

    @Id
    @GeneratedValue
    private Long id;

    private String theUrl;

    private Long user;

    private boolean active;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTheUrl() {
        return theUrl;
    }

    public void setTheUrl(String theUrl) {
        this.theUrl = theUrl;
    }

    public Long getUser() {
        return user;
    }

    public void setUser(Long user) {
        this.user = user;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
