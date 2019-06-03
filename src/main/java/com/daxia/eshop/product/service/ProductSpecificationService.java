package com.daxia.eshop.product.service;

import com.daxia.eshop.product.model.ProductSpecification;

/**
 * @Description
 * @Author daxia
 * @Date 2019/6/1 23:34
 * @Version 1.0
 */
public interface ProductSpecificationService {

    public void add(ProductSpecification productSpecification, String operationType);

    public void update(ProductSpecification productSpecification, String operationType);

    public void delete(Long id, String operationType);

    public ProductSpecification findById(Long id);

    public ProductSpecification findByProductId(Long productId);

}
