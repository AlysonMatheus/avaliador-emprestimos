package com.example.avaliador_emprestimos;

import org.springframework.boot.SpringApplication;

public class TestAvaliadorEmprestimosApplication {

	public static void main(String[] args) {
		SpringApplication.from(AvaliadorEmprestimosApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
