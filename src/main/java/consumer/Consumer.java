package consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer{
    @KafkaListener(topics = {"hobbit"}, groupId = "spring-boot-kafka")
    public void consumer(String quote){
        System.out.println("Received ------> : " + quote);
    }
}

