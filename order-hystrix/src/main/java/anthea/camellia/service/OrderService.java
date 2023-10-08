package anthea.camellia.service;

import anthea.camellia.BaseResponse;
import anthea.camellia.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author anthea
 * @date 2023/10/7 20:59
 */
@Service
@FeignClient(value = "PAYMENT")
public interface OrderService {
    @GetMapping("/payment/getById")
    public BaseResponse<Payment> selectOne(@RequestParam("id") Integer id);
}
