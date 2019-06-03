package com.daxia.eshop.product.mapper;

import com.daxia.eshop.product.model.Category;
import org.apache.ibatis.annotations.*;

/**
 * @Description
 * @Author daxia
 * @Date 2019/6/1 23:29
 * @Version 1.0
 */

@Mapper
public interface CategoryMapper {
    
    @Insert("insert into category (name, description) values (#{name},#{description})")
    public void add(Category category);
    
    @Update("update category set name = #{name}, description = #{description} where id = #{id}")
    public void update(Category category);
    
    @Delete("delete from category where id = #{id}")
    public void delete(@Param("id") Long id);
    
    @Select("select * from category where id = #{id}")
    public Category findById(@Param("id") Long id);
}
