package com.atguigu.springcloud.service.impl;

import anthea.camellia.Payment;
import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Payment)表服务实现类
 *
 * @author lixiaolong
 * @date 2022/01/13 16:05
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;


    @Override
    public Payment queryById(Integer id) {
        return paymentDao.queryById(id);
    }
}