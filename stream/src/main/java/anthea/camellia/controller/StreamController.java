package anthea.camellia.controller;

import anthea.camellia.service.Sender;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author anthea
 * @date 2023/10/9 20:48
 */
@RestController
@RequestMapping("/stream")
public class StreamController {
    @Resource
    private Sender sender;

    @GetMapping("/send")
    public String send() {
        return sender.send();
    }
}
