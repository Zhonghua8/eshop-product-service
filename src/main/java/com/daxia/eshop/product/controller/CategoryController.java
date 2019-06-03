package com.daxia.eshop.product.controller;

import com.daxia.eshop.product.model.Category;
import com.daxia.eshop.product.service.CategoryService;
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
@RequestMapping("/category")
public class CategoryController {
    
    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/add")
    public String add(Category category, String operationType){
        try {
            categoryService.add(category,operationType);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        
        return "success";
    }

    @RequestMapping("/update")
    public String update(Category category, String operationType){
        try {
            categoryService.update(category,operationType);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }

        return "success";
    }

    @RequestMapping("/delete")
    public String delete(Long id, String operationType){
        try {
            categoryService.delete(id,operationType);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }

        return "success";
    }

    @RequestMapping("/findById")
    public Category findById(Long id){
        try {
            return categoryService.findById(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new Category();
    }
}
