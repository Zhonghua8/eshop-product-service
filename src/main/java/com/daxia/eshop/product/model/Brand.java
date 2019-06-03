package com.daxia.eshop.product.model;

/**
 * @Description
 * @Author daxia
 * @Date 2019/6/1 23:27
 * @Version 1.0
 */
public class Brand {
    
    private Long id;
    private String name;
    private String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
