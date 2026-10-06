package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Tarefa;

@Service
public class TarefaService {

	
	private List<Tarefa> lista = new ArrayList<>();
	private Long contadorId = 1L;

	// Acionado por controller @GetMapping
	public List<Tarefa> listar() {
		return lista;
	}

	// Acionado por controller @GetMapping
	public Tarefa buscarPorId(Long id) {
		for (Tarefa tarefa : lista) {
			if (tarefa.getId().equals(id)) {
				return tarefa;
			}
		}
		return null;
	}

	// Acionado por controller @PostMapping
	public Tarefa criar(Tarefa tarefa) {
		tarefa.setId(contadorId++);
		lista.add(tarefa);
		return tarefa;
	}

	// Acionado por controller @PutMapping
	public Tarefa atualizar(Long id, Tarefa tarefaAtualizada) {
		for (Tarefa tarefa : lista) {
			if (tarefa.getId().equals(id)) {
				tarefa.setTitulo(tarefaAtualizada.getTitulo());
				tarefa.setDescricao(tarefaAtualizada.getDescricao());
				tarefa.setConcluida(tarefaAtualizada.isConcluida());
				return tarefa;
			}
		}
		return null;
	}

	// Acionado por controller @DeleteMapping
	public void deletar(Long id) {
		lista.removeIf(tarefa -> tarefa.getId().equals(id));
	}
}
