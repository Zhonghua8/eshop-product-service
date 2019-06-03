package com.daxia.eshop.product.mapper;

import com.daxia.eshop.product.model.Product;
import org.apache.ibatis.annotations.*;

/**
 * @Description
 * @Author daxia
 * @Date 2019/6/1 23:29
 * @Version 1.0
 */

@Mapper
public interface ProductMapper {
    
    @Insert("insert into product (name, category_id,brand_id) values (#{name},#{categoryId},#{brandId})")
    public void add(Product product);
    
    @Update("update product set name = #{name}, category_id = #{categoryId}, brand_id = #{brandId} where id = #{id}")
    public void update(Product product);
    
    @Delete("delete from product where id = #{id}")
    public void delete(@Param("id") Long id);
    
    @Select("select * from product where id = #{id}")
    @Results({
            @Result(column = "category_id", property = "categoryId"),
            @Result(column = "brand_id", property = "brandId")
    })
    public Product findById(@Param("id") Long id);
}
