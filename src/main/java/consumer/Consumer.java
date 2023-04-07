package consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.json.JSONObject;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer{
    JSONObject jo = new JSONObject();
    @KafkaListener(topics = {"Topic2"}, groupId = "spring-boot-kafka")
    public void consumer(ConsumerRecord<Integer,String> record){
        jo.put("value", record.value());
        jo.put("key", record.key());
        System.out.println("Received  ------> : " + jo);



    }
}

