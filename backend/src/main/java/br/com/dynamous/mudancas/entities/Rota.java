package br.com.dynamous.mudancas.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "tb_rotas")
public class Rota {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate data;
	
	@ManyToOne
	@JoinColumn(name="empresa_id")
	private Empresa empresa;
	
	public Rota() {
		
	}

	public Rota(Long id, LocalDate data,Empresa empresa) {
		this.id = id;
		this.data = data;
		this.empresa=empresa;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return data;
	}

	public void setDate(LocalDate date) {
		this.data = date;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	

}
