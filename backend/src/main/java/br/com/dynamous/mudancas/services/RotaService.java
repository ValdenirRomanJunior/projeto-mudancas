package br.com.dynamous.mudancas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.dynamous.mudancas.entities.Rota;
import br.com.dynamous.mudancas.entities.RotaDTO;
import br.com.dynamous.mudancas.repositories.RotaRepository;

@Service
public class RotaService {

	@Autowired
	private RotaRepository repository;
	
	public Page<RotaDTO> findAll(Pageable pageable){
		Page<Rota> result=repository.findAll(pageable);
		return result.map(x -> new RotaDTO(x));
	}
}
