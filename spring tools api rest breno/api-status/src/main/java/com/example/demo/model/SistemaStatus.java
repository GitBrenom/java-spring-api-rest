package com.example.demo.model;

public class SistemaStatus {

	private String nome;
	private String versao;
	private boolean online;
	public SistemaStatus() {
		super();
	}
	public SistemaStatus(String nome, String versao, boolean online) {
		super();
		this.nome = nome;
		this.versao = versao;
		this.online = online;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getVersao() {
		return versao;
	}
	public void setVersao(String versao) {
		this.versao = versao;
	}
	public boolean isOnline() {
		return online;
	}
	public void setOnline(boolean online) {
		this.online = online;
	}
	
	
	
}
