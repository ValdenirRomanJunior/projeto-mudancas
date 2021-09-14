package br.com.dynamous.mudancas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dynamous.mudancas.entities.RotaDTO;
import br.com.dynamous.mudancas.services.RotaService;

@RestController
@RequestMapping(value="/rotas")
public class RotaController {
	
	@Autowired
	private RotaService service;
	
	@GetMapping
	public ResponseEntity <Page<RotaDTO>> findAll(Pageable pageable){	
		Page<RotaDTO> list=service.findAll(pageable);	
		return ResponseEntity.ok(list);
	}
	
	

}
