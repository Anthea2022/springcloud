package com.atguigu.springcloud.mapper;

import anthea.camellia.Payment;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface PaymentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Payment getById(Integer id);
}