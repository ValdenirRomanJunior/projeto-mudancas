package br.com.dynamous.mudancas.entities;

import java.io.Serializable;
import java.time.LocalDate;

public class RotaDTO implements Serializable {	
	private static final long serialVersionUID = 1L;
	
	
	private Long id;
	private LocalDate data;
	private EmpresaDTO empresa;

	public RotaDTO() {
		// TODO Auto-generated constructor stub
	}

	public RotaDTO(Long id, LocalDate data, EmpresaDTO nomeEmpresa) {
		this.id = id;
		this.data = data;		
		this.empresa = nomeEmpresa;
	}

	public RotaDTO(Rota entity) {
		this.id = entity.getId();
		this.data = entity.getDate();
		this.empresa = new EmpresaDTO(entity.getEmpresa());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public EmpresaDTO getEmpresa() {
		return empresa;
	}

	public void setEmpresa(EmpresaDTO empresa) {
		this.empresa = empresa;
	}

	

	
	
}
