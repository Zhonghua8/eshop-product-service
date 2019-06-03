package com.daxia.eshop.product.service;

import com.daxia.eshop.product.model.ProductIntro;

/**
 * @Description
 * @Author daxia
 * @Date 2019/6/1 23:34
 * @Version 1.0
 */
public interface ProductIntroService {

    public void add(ProductIntro productIntro, String operationType);

    public void update(ProductIntro productIntro, String operationType);

    public void delete(Long id, String operationType);

    public ProductIntro findById(Long id);
}
