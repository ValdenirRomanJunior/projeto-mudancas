package br.com.dynamous.mudancas;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.dynamous.mudancas.entities.Empresa;
import br.com.dynamous.mudancas.entities.Rota;
import br.com.dynamous.mudancas.repositories.EmpresaRepository;
import br.com.dynamous.mudancas.repositories.RotaRepository;

@SpringBootApplication
public class MudancasApplication implements CommandLineRunner {
	
	@Autowired
	private RotaRepository rotaRepository;
	@Autowired
	private EmpresaRepository EmpresaRepository;

	public static void main(String[] args) {
		SpringApplication.run(MudancasApplication.class, args);
	}

	

	@Override
	public void run(String... args) throws Exception {
	
		
		Empresa emp1= new Empresa(null, "Central Shop");	
		
		Rota rota1 = new Rota(null,LocalDate.now(),emp1);
		Rota rota2 = new Rota(null,LocalDate.now(),emp1);
		
		emp1.getRotas().addAll(Arrays.asList(rota1,rota2));
	
		
		EmpresaRepository.saveAll(Arrays.asList(emp1));
		rotaRepository.saveAll(Arrays.asList(rota1,rota2));
		
		
		
}

}
