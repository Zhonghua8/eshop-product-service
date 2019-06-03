package com.daxia.eshop.product.service;

import com.daxia.eshop.product.model.Brand;

import java.util.List;

/**
 * @Description
 * @Author daxia
 * @Date 2019/6/1 23:34
 * @Version 1.0
 */
public interface BrandService {

    public void add(Brand brand, String operationType);

    public void update(Brand brand, String operationType);

    public void delete(Long id, String operationType);

    public Brand findById(Long id);

    public List<Brand> findByIds(String ids);

}
