package com.example.crawler.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "PRICE")
    private String price;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "EXTRA_INFORMATION")
    private String extraInformation;

    public Product() {
    }

    public Product(String name, String price, String description, String extraInformation) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.extraInformation = extraInformation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExtraInformation() {
        return extraInformation;
    }

    public void setExtraInformation(String extraInformation) {
        this.extraInformation = extraInformation;
    }
}