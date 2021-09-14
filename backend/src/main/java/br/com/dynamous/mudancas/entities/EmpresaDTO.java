package br.com.dynamous.mudancas.entities;

import java.io.Serializable;

public class EmpresaDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	
	public EmpresaDTO() {
		// TODO Auto-generated constructor stub
	}
	
	

	public EmpresaDTO(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public EmpresaDTO(Empresa empresa) {	
		this.id = empresa.getId();
		this.nome = empresa.getName();
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
