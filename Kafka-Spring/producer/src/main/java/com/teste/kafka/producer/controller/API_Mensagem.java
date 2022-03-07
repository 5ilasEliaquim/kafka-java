package com.teste.kafka.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.kafka.producer.service.MensagemService;

@RestController
@RequestMapping("/mensagem")
public class API_Mensagem {
	
	@Autowired
	MensagemService mensagemService;
	
	@PostMapping
	public ResponseEntity<String> enviarMensagem(@RequestBody String msg){
		mensagemService.enviarMensagem(msg);
		return ResponseEntity.ok().body("mensagem enviada com sucesso" + msg);
	}
}
