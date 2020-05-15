package com.dao;

import com.entity.Tbdocument;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Tbdocument)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-11 08:11:42
 */
@Repository
public interface TbdocumentDao {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     */
    Tbdocument queryById(Integer did);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Tbdocument> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    List<Tbdocument> queryAll();

    /**
     * 新增数据
     *
     * @param tbdocument 实例对象
     * @return 影响行数
     */
    int insert(Tbdocument tbdocument);

    /**
     * 修改数据
     *
     * @param tbdocument 实例对象
     * @return 影响行数
     */
    int update(Tbdocument tbdocument);

    /**
     * 通过主键删除数据
     *
     * @return 影响行数
     */
    int deleteById(Integer did);
   int insertmore(List<Tbdocument> list);

}