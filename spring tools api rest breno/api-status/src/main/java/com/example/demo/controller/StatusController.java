package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SistemaStatus;

@RestController
@RequestMapping("/status")
public class StatusController {

	@GetMapping
public String mensagemStatus() {
	return "sistema online" ;
}

	@GetMapping ("/detalhado")
public SistemaStatus statusDetalhado() {
	SistemaStatus ss = new SistemaStatus ("Sistema Distruibuido SDM", "1.0", true);
	return ss;
}
	
}
