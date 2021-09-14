package br.com.dynamous.mudancas.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_empresas")
public class Empresa {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	
	@OneToMany(mappedBy = "empresa")
	private List<Rota> rotas= new ArrayList<>();
	
	
	public Empresa() {
	
	}

	public Empresa(Long id, String name) {
		this.id = id;
		this.nome = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.nome = name;
	}

	public List<Rota> getRotas() {
		return rotas;
	}
	
	
}
