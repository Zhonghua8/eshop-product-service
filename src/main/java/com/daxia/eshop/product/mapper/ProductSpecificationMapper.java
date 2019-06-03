package com.daxia.eshop.product.mapper;

import com.daxia.eshop.product.model.ProductSpecification;
import org.apache.ibatis.annotations.*;

/**
 * @Description
 * @Author daxia
 * @Date 2019/6/1 23:29
 * @Version 1.0
 */

@Mapper
public interface ProductSpecificationMapper {
    
    @Insert("insert into product_specification (name, value, product_id) values (#{name},#{value},#{productId})")
    public void add(ProductSpecification productSpecification);
    
    @Update("update product_specification set name = #{name}, value = #{value}, product_id = #{productId} where id = #{id}")
    public void update(ProductSpecification productSpecification);
    
    @Delete("delete from product_specification where id = #{id}")
    public void delete(@Param("id") Long id);
    
    @Select("select * from product_specification where id = #{id}")
    public ProductSpecification findById(@Param("id") Long id);

    @Select("select * from product_specification where product_id = #{productId}")
    public ProductSpecification findByProductId(@Param("productId") Long productId);
}
