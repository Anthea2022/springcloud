package com.atguigu.springcloud.dao;

import anthea.camellia.Payment;
import org.apache.ibatis.annotations.Mapper;
/**
 * (Payment)表数据库访问层
 *
 * @author lixiaolong
 * @date 2022/01/13 16:05
 */
@Mapper
public interface PaymentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Payment queryById(Integer id);
}