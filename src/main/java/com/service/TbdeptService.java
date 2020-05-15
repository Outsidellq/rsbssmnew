package com.service;

import com.entity.Tbdept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbdeptService {
    /**
     * 通过ID查询单条数据
     *
     * @param deptid 主键
     * @return 实例对象
     */
    Tbdept queryById(Integer deptid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Tbdept> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 新增数据
     *
     * @param tbdept 实例对象
     * @return 影响行数
     */
    int insert(Tbdept tbdept);

    /**
     * 修改数据
     *
     * @param tbdept 实例对象
     * @return 影响行数
     */
    int update(Tbdept tbdept);

    /**
     * 通过主键删除数据
     *
     * @param deptid 主键
     * @return 影响行数
     */
    int deleteById(Integer deptid);
    List<Tbdept> queryAll();
    int insertmore(List<Tbdept> list);
    int deleteByIdmore(List<Integer> list);
}
