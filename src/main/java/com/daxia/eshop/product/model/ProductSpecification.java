package com.daxia.eshop.product.model;

/**
 * @Description
 * @Author daxia
 * @Date 2019/6/2 9:00
 * @Version 1.0
 */
public class ProductSpecification {
    private Long id;
    private String name;
    private String value;
    private Long productId;

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
