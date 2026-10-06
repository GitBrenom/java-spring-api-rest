package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Tarefa;
import com.example.demo.service.TarefaService;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {
	
    @Autowired
    private TarefaService service;
	
    
    // GET - Listar todas
    @GetMapping
    public List<Tarefa> listar() {
        return service.listar();
    }
    
    // GET - Buscar por ID
    @GetMapping("/{id}")
    public Tarefa buscarPorId(@PathVariable Long id) {
    	return service.buscarPorId(id);
    }
    
    // POST - Criar nova tarefa
    @PostMapping
    public Tarefa criar(@RequestBody Tarefa tarefa) {
    	return service.criar(tarefa);
    }
    
    // PUT - Atualizar tarefa existente
    @PutMapping("/{id}")
    public Tarefa atualizar(@PathVariable Long id,
                            @RequestBody Tarefa tarefaAtualizada) {
    	return service.atualizar(id, tarefaAtualizada);
    }
    
    // DELETE - Remover tarefa
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
    	service.deletar(id);
    }

}
