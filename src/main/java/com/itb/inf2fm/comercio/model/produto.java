package com.itb.inf2fm.comercio.model;

public class Produto {

	
	private long id;
	private String nome;
	private String descricao;
	private String codigobarras;
	private double preço;
	
	// public: Acesso liberado para todas as classes
	
	// private: Acesso permitido apenas pelos membros  
	// da própria classe.
	// Entende-se por membros(atributos e ou métodos)
	
	
	// Metodos Setter's e Getter's : Atribuir e recuperar dados do atributo "RESPECTIVAMENTE"
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getId() {
		return id;
	}
	public void setNome(){
		this.nome = nome;	
	}	
	public long setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setCodigoBarras
}
