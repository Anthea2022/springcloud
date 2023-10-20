package anthea.camellia.controller;

import anthea.camellia.BaseResponse;
import anthea.camellia.Payment;
import anthea.camellia.service.OrderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author anthea
 * @date 2023/10/7 20:58
 */
@RestController
@RequestMapping("/order")
public class Order80Controller {
    @Resource
    private OrderService orderService;

    @GetMapping("/getById")
    public BaseResponse<Payment> selectOne(@RequestParam("id") Integer id) {
        return orderService.selectOne(id);
    }

    @GetMapping("/ziplin")
    public BaseResponse<Object> ziplin() {
        return null;
    }
}
