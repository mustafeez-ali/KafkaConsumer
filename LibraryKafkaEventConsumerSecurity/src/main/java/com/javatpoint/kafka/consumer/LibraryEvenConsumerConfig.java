package com.javatpoint.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;


@Configuration
public class LibraryEvenConsumerConfig {

	@KafkaListener(topics= {"library-events"})
	public void onMessage(ConsumerRecord<Integer, String> consumerRecord) {
		
		System.out.println("Consumer Records"+consumerRecord);

	}

}
