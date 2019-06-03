package com.daxia.eshop.product.mapper;

import com.daxia.eshop.product.model.ProductProperty;
import com.daxia.eshop.product.model.ProductSpecification;
import org.apache.ibatis.annotations.*;

/**
 * @Description
 * @Author daxia
 * @Date 2019/6/1 23:29
 * @Version 1.0
 */

@Mapper
public interface ProductPropertyMapper {
    
    @Insert("insert into product_property (name, value, product_id) values (#{name},#{value},#{productId})")
    public void add(ProductProperty productProperty);
    
    @Update("update product_property set name = #{name}, value = #{value}, product_id = #{productId} where id = #{id}")
    public void update(ProductProperty productProperty);
    
    @Delete("delete from product_property where id = #{id}")
    public void delete(@Param("id") Long id);
    
    @Select("select * from product_property where id = #{id}")
    public ProductProperty findById(@Param("id") Long id);

    @Select("select * from product_property where product_id = #{productId}")
    public ProductProperty findByProductId(@Param("productId") Long productId);
}
