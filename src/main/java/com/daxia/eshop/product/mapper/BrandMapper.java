package com.daxia.eshop.product.mapper;

import com.daxia.eshop.product.model.Brand;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Description
 * @Author daxia
 * @Date 2019/6/1 23:29
 * @Version 1.0
 */

@Mapper
public interface BrandMapper {
    
    @Insert("insert into brand (name, description) values (#{name},#{description})")
    public void add(Brand brand);
    
    @Update("update brand set name = #{name}, description = #{description} where id = #{id}")
    public void update(Brand brand);
    
    @Delete("delete from brand where id = #{id}")
    public void delete(@Param("id") Long id);
    
    @Select("select * from brand where id = #{id}")
    public Brand findById(@Param("id") Long id);
    
    @Select("select * from brand where id in (#{ids})")
    public List<Brand> findByIds(@Param("ids") String ids);
}
