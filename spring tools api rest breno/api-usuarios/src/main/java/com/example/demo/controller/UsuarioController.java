//package com.example.demo.controller;
//
//import java.util.List;
//
////import org.springframework.web.bind.annotation.GetMapping;
////import org.springframework.web.bind.annotation.PathVariable;
////import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.model.Usuario;
//import com.example.demo.service.UsuarioService;
//
//@RestController
//@RequestMapping("/usuarios")
//public class UsuarioController {
//
//	private final UsuarioService service;
//
//	public UsuarioController(UsuarioService service) {
//		this.service = service;
//	}
//
//	@PostMapping
//	public String cadastrar(@RequestParam String nome, @RequestParam int idade) {
//		return service.cadastrar(nome, idade);
//	}
//
//	@GetMapping
//	public List<Usuario> listar() {
//		return service.listar();
//	}
//
//	@GetMapping("/{nome}")
//	public Usuario buscar(@PathVariable String nome) {
//		return service.buscarPorNome(nome);
//	}
//}
