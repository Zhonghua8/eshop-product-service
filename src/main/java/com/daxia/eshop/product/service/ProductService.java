package com.daxia.eshop.product.service;

import com.daxia.eshop.product.model.Product;

/**
 * @Description
 * @Author daxia
 * @Date 2019/6/1 23:34
 * @Version 1.0
 */
public interface ProductService {

    public void add(Product product, String operationType);

    public void update(Product product, String operationType);

    public void delete(Long id, String operationType);

    public Product findById(Long id);
}
