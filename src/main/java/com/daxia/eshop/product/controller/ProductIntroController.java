package com.daxia.eshop.product.controller;

import com.daxia.eshop.product.model.ProductIntro;
import com.daxia.eshop.product.service.ProductIntroService;
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
@RequestMapping("/productIntro")
public class ProductIntroController {
    
    @Autowired
    private ProductIntroService productIntroService;

    @RequestMapping("/add")
    public String add(ProductIntro productIntro, String operationType){
        try {
            productIntroService.add(productIntro,operationType);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        
        return "success";
    }

    @RequestMapping("/update")
    public String update(ProductIntro productIntro, String operationType){
        try {
            productIntroService.update(productIntro,operationType);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }

        return "success";
    }

    @RequestMapping("/delete")
    public String delete(Long id, String operationType){
        try {
            productIntroService.delete(id,operationType);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }

        return "success";
    }

    @RequestMapping("/findById")
    public ProductIntro findById(Long id){
        try {
            return productIntroService.findById(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ProductIntro();
    }
}
