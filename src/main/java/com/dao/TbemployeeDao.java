package com.dao;

import com.entity.Tbemployee;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Tbemployee)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-11 08:11:43
 */
@Repository
public interface TbemployeeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param empid 主键
     * @return 实例对象
     */
    Tbemployee queryById(Integer empid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Tbemployee> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbemployee 实例对象
     * @return 对象列表
     */
    List<Tbemployee> queryAll(Tbemployee tbemployee);

    /**
     * 新增数据
     *
     * @param tbemployee 实例对象
     * @return 影响行数
     */
    int insert(Tbemployee tbemployee);

    /**
     * 修改数据
     *
     * @param tbemployee 实例对象
     * @return 影响行数
     */
    int update(Tbemployee tbemployee);

    /**
     * 通过主键删除数据
     *
     * @param empid 主键
     * @return 影响行数
     */
    int deleteById(Integer empid);

    List<Tbemployee> queryAll();

    List<Tbemployee> selctdept();

}