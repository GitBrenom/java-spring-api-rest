package com.example.demo.model;

public class Tarefa {
	
	//atributos
	private Long id;
    private String titulo;
    private String descricao;
    private boolean concluida;
    
    //método construtor
	public Tarefa() {
		super();
	}
	//método construtor completo
	public Tarefa(Long id, String titulo, String descricao, boolean concluida) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.concluida = concluida;
	}
	
	//método gets e sets
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isConcluida() {
		return concluida;
	}

	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}

}
