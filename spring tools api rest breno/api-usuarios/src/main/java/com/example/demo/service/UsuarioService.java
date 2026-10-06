//package com.example.demo.service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.stereotype.Service;
//
//import com.example.demo.model.Usuario;
//
//@Service
//public class UsuarioService {
//
//private List<Usuario> usuarios = new ArrayList<>();
//	
//
//
//public String cadastrar(String nome, int idade) {
//	usuarios.add(new Usuario(nome, idade));
//	return "Usuário cadastrado com sucesso!";
//}
//
//
//	public List<Usuario> listar(){
//		return usuarios;
//	}
//public Usuario buscarPorNome(String nome) {
//	return usuarios.stream()
//			.filter(u-> u.getNome().equalsIgnoreCase(nome))
//			.findFirst().
//			orElse(null);
//}
//
//}
