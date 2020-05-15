package com.dao;

import com.entity.Tbuser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Tbuser)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-11 08:11:43
 */
@Repository
public interface TbuserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    Tbuser queryById(Object uid);
    Tbuser login(@Param("uname") String uname, @Param("upwd") String upwd);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Tbuser> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbuser 实例对象
     * @return 对象列表
     */
    List<Tbuser> queryAll(Tbuser tbuser);

    /**
     * 新增数据
     *
     * @param tbuser 实例对象
     * @return 影响行数
     */
    int insert(Tbuser tbuser);

    /**
     * 修改数据
     *
     * @param tbuser 实例对象
     * @return 影响行数
     */
    int update(Tbuser tbuser);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 影响行数
     */
    int deleteById(Object uid);

}