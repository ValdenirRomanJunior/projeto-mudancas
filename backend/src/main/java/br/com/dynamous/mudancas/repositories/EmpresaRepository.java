package br.com.dynamous.mudancas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dynamous.mudancas.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}
