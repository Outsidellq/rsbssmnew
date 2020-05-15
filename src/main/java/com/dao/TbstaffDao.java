package com.dao;

import com.entity.Tbstaff;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Tbstaff)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-11 08:11:43
 */
@Repository
public interface TbstaffDao {

    /**
     * 通过ID查询单条数据
     *
     * @param staid 主键
     * @return 实例对象
     */
    Tbstaff queryById(Integer staid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Tbstaff> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbstaff 实例对象
     * @return 对象列表
     */
    List<Tbstaff> queryAll(Tbstaff tbstaff);

    /**
     * 新增数据
     *
     * @param tbstaff 实例对象
     * @return 影响行数
     */
    int insert(Tbstaff tbstaff);

    /**
     * 修改数据
     *
     * @param tbstaff 实例对象
     * @return 影响行数
     */
    int update(Tbstaff tbstaff);

    /**
     * 通过主键删除数据
     *
     * @param staid 主键
     * @return 影响行数
     */
    int deleteById(Integer staid);

    List<Tbstaff> selectmanyemps();

}