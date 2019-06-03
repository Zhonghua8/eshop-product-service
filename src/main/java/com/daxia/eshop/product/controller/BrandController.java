package com.daxia.eshop.product.controller;

import com.daxia.eshop.product.model.Brand;
import com.daxia.eshop.product.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author daxia
 * @Date 2019/6/1 23:37
 * @Version 1.0
 */

@RestController
@RequestMapping("/brand")
public class BrandController {
    
    @Autowired
    private BrandService brandService;

    @RequestMapping("/add")
    public String add(Brand brand, String operationType){
        try {
            brandService.add(brand, operationType);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        
        return "success";
    }

    @RequestMapping("/update")
    public String update(Brand brand, String operationType){
        try {
            brandService.update(brand, operationType);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }

        return "success";
    }

    @RequestMapping("/delete")
    public String delete(Long id, String operationType){
        try {
            brandService.delete(id,operationType);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }

        return "success";
    }

    @RequestMapping("/findById")
    public Brand findById(Long id){
        try {
            return brandService.findById(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new Brand();
    }

    @RequestMapping("/findByIds")
    public List<Brand> findByIds(String ids){
        try {
            return brandService.findByIds(ids);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ArrayList<Brand>();
    }
}
