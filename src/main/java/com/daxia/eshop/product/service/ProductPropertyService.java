package com.daxia.eshop.product.service;

import com.daxia.eshop.product.model.ProductProperty;

/**
 * @Description
 * @Author daxia
 * @Date 2019/6/1 23:34
 * @Version 1.0
 */
public interface ProductPropertyService {

    public void add(ProductProperty productProperty, String operationType);

    public void update(ProductProperty productProperty, String operationType);

    public void delete(Long id, String operationType);

    public ProductProperty findById(Long id);

    public ProductProperty findByProductId(Long productId);

}
