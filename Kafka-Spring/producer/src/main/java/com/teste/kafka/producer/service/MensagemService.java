package com.teste.kafka.producer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MensagemService {
	
	private static final Logger logger = LoggerFactory.getLogger(MensagemService.class);
		
	//@Value("${topic.bora-praticar}")
	private static String topicTesteMensagem = "topic_bora_praticar_kafka" ;
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public void enviarMensagem(String message) {
		logger.info("Mensagen -> {}", message);
		this.kafkaTemplate.send(topicTesteMensagem, message);
	}
}
