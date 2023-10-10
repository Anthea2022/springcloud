package anthea.camellia.controller;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @author anthea
 * @date 2023/10/10 19:26
 */
@Component
@EnableBinding(Sink.class)
public class Receiver {
    @StreamListener(Sink.INPUT)
    public void receive(Message<String> message) {
        System.out.println(message.getPayload());
    }
}
