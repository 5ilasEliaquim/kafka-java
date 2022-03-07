package com.teste.kafka.consumer.listener;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Listener {
	private static final Logger logger = LoggerFactory.getLogger(Listener.class);
	
	@KafkaListener(topics = "topic_bora_praticar_kafka", groupId ="my_group_id")
	public void consume(String message) throws IOException{
		logger.info(String.format("###-> Consumed Message -> %s", message));
	}
}
