package anthea.camellia.controller;

import anthea.camellia.BaseResponse;
import anthea.camellia.Payment;
import anthea.camellia.ResponseCodes;
import anthea.camellia.service.OrderService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author anthea
 * @date 2023/10/7 20:58
 */
@RestController
@RequestMapping("/order")
@DefaultProperties(defaultFallback = "systemError")
public class Order80Controller {
    @Resource
    private OrderService orderService;

    @GetMapping("/getById")
    @HystrixCommand(commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
    })
    public BaseResponse<Payment> selectOne(@RequestParam("id") Integer id) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return orderService.selectOne(id);
    }

    public BaseResponse<Payment> systemError() {
        return BaseResponse.fail(ResponseCodes.FAIL, "system error");
    }
}
