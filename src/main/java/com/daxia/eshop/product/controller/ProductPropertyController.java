package com.daxia.eshop.product.controller;

import com.daxia.eshop.product.model.ProductProperty;
import com.daxia.eshop.product.service.ProductPropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author daxia
 * @Date 2019/6/1 23:37
 * @Version 1.0
 */

@RestController
@RequestMapping("/productProperty")
public class ProductPropertyController {
    
    @Autowired
    private ProductPropertyService productPropertyService;

    @RequestMapping("/add")
    public String add(ProductProperty productProperty, String operationType){
        try {
            productPropertyService.add(productProperty, operationType);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        
        return "success";
    }

    @RequestMapping("/update")
    public String update(ProductProperty productProperty, String operationType){
        try {
            productPropertyService.update(productProperty,operationType);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }

        return "success";
    }

    @RequestMapping("/delete")
    public String delete(Long id, String operationType){
        try {
            productPropertyService.delete(id,operationType);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }

        return "success";
    }

    @RequestMapping("/findById")
    public ProductProperty findById(Long id){
        try {
            return productPropertyService.findById(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ProductProperty();
    }

    @RequestMapping("/findByProductId")
    public ProductProperty findByProductId(Long productId){
        try {
            return productPropertyService.findByProductId(productId);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ProductProperty();
    }
}
