package com.dao;
import com.entity.Tbnotice;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Tbnotice)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-11 08:11:43
 */
@Repository
public interface TbnoticeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param notid 主键
     * @return 实例对象
     */
    Tbnotice queryById(Integer notid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Tbnotice> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbnotice 实例对象
     * @return 对象列表
     */
    List<Tbnotice> queryAll(Tbnotice tbnotice);

    /**
     * 新增数据
     *
     * @param tbnotice 实例对象
     * @return 影响行数
     */
    int insert(Tbnotice tbnotice);

    /**
     * 修改数据
     *
     * @param tbnotice 实例对象
     * @return 影响行数
     */
    int update(Tbnotice tbnotice);

    /**
     * 通过主键删除数据
     *
     * @param notid 主键
     * @return 影响行数
     */
    int deleteById(Integer notid);



}