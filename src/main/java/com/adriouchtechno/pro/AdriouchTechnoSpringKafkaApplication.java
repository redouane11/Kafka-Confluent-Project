package com.adriouchtechno.pro;

import com.github.javafaker.Faker;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.util.function.Tuple2;

import java.time.Duration;
import java.util.function.Function;
import java.util.stream.Stream;

@SpringBootApplication(scanBasePackageClasses = {consumer.Consumer.class, producer.Producer.class})
public class AdriouchTechnoSpringKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdriouchTechnoSpringKafkaApplication.class, args);
	}

}




