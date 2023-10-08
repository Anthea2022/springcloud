package com.atguigu.springcloud.service;


import anthea.camellia.Payment;

import java.util.List;

/**
 * (Payment)表服务接口
 *
 * @author lixiaolong
 * @date 2022/01/13 16:05
 */
public interface PaymentService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Payment queryById(Integer id);

}