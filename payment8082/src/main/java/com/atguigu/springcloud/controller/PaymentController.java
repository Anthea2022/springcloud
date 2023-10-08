package com.atguigu.springcloud.controller;

import anthea.camellia.BaseResponse;
import anthea.camellia.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/getById")
    public BaseResponse<Payment> getById(@RequestParam("id") Integer id) {
        System.out.println(port);
        return BaseResponse.success(paymentService.queryById(id));
    }
}