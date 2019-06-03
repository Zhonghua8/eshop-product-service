package com.daxia.eshop.product.model;

/**
 * @Description
 * @Author daxia
 * @Date 2019/6/2 0:03
 * @Version 1.0
 */
public class Product {
    
    private Long id;
    private String name;
    private Long categoryId;
    private Long brandId;

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

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", categoryId=" + categoryId +
                ", brandId=" + brandId +
                '}';
    }
}
