package com.daxia.eshop.product.mapper;

import com.daxia.eshop.product.model.ProductIntro;
import org.apache.ibatis.annotations.*;

/**
 * @Description
 * @Author daxia
 * @Date 2019/6/1 23:29
 * @Version 1.0
 */

@Mapper
public interface ProductIntroMapper {
    
    @Insert("insert into product_intro (content, product_id) values (#{content},#{productId})")
    public void add(ProductIntro productIntro);
    
    @Update("update product_intro set content = #{content}, product_id = #{productId} where id = #{id}")
    public void update(ProductIntro productIntro);
    
    @Delete("delete from product_intro where id = #{id}")
    public void delete(@Param("id") Long id);
    
    @Select("select * from product_intro where id = #{id}")
    public ProductIntro findById(@Param("id") Long id);
}
