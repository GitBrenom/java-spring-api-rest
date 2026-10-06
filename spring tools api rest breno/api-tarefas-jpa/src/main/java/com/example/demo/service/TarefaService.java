package com.example.demo.service;

import java.util.Optional;
import java.util.List;
import com.example.demo.exception.RecursoNaoEncontradoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Tarefa;
import com.example.demo.repository.TarefaRepository;


@Service
public class TarefaService {

	@Autowired
	private TarefaRepository repository;

// Acionado pelo controller atualizar()
	public Tarefa salvar(Tarefa tarefa) {
		return repository.save(tarefa);
	}

// Acionado pelo controller listar()
	public List<Tarefa> listar() {
		return repository.findAll();
	}

	//Acionado pelo controller buscarPorId()
		public Tarefa buscarPorId(Long id) {
			Optional<Tarefa> tarefa = repository.findById(id);
			if (tarefa.isPresent()) {
				return tarefa.get();
			}
			throw new RecursoNaoEncontradoException("Tarefa não encontrada");
		}


// Acionado pelo controller deletar()
	public void deletar(Long id) {
		repository.deleteById(id);
	}





}