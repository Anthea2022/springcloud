package com.atguigu.springcloud.service.impl;

import anthea.camellia.Payment;
import com.atguigu.springcloud.mapper.PaymentDao;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;


    @Override
    public Payment getById(Integer id) {
        return paymentDao.getById(id);
    }
}