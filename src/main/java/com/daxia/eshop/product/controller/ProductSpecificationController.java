package com.daxia.eshop.product.controller;

import com.daxia.eshop.product.model.ProductSpecification;
import com.daxia.eshop.product.service.ProductSpecificationService;
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
@RequestMapping("/productSpecification")
public class ProductSpecificationController {
    
    @Autowired
    private ProductSpecificationService productSpecificationService;

    @RequestMapping("/add")
    public String add(ProductSpecification productSpecification, String operationType){
        try {
            productSpecificationService.add(productSpecification,operationType);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        
        return "success";
    }

    @RequestMapping("/update")
    public String update(ProductSpecification productSpecification, String operationType){
        try {
            productSpecificationService.update(productSpecification,operationType);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }

        return "success";
    }

    @RequestMapping("/delete")
    public String delete(Long id, String operationType){
        try {
            productSpecificationService.delete(id,operationType);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }

        return "success";
    }

    @RequestMapping("/findById")
    public ProductSpecification findById(Long id){
        try {
            return productSpecificationService.findById(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ProductSpecification();
    }

    @RequestMapping("/findByProductId")
    public ProductSpecification findByProductId(Long productId){
        try {
            return productSpecificationService.findByProductId(productId);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ProductSpecification();
    }
}
