package anthea.camellia.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author anthea
 * @date 2023/10/9 20:35
 */
@EnableBinding(Source.class)
public class Sender {
    @Resource
    private MessageChannel output;

    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        return "OK";
    }
}
