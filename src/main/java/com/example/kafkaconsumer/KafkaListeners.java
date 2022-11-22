package com.example.kafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
	
	@KafkaListener(topics = KafkaVariables.TOPIC, groupId = KafkaVariables.GROUPID)
	public String listener(String data) {
		System.out.println("###"+data+"###");
		return data;
	}
}
