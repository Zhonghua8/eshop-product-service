package com.daxia.eshop.product.service;

import com.daxia.eshop.product.model.Category;

/**
 * @Description
 * @Author daxia
 * @Date 2019/6/1 23:34
 * @Version 1.0
 */
public interface CategoryService {

    public void add(Category category, String operationType);

    public void update(Category category, String operationType);

    public void delete(Long id, String operationType);

    public Category findById(Long id);
}
