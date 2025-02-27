package com.desafio.clienteApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desafio.clienteApi.Service.ClienteService;

@SpringBootApplication
public class ClienteApiApplication implements CommandLineRunner {
	@Autowired
	private ClienteService clienteService;

	public static void main(String[] args) {
		SpringApplication.run(ClienteApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Api Corriendo: http://localhost:8080/cliente");
		Cliente cliente = new Cliente("Giovanni", "Garcia", "09/05/2002");
		Cliente cliente1 = new Cliente("Irina", "Contreras", "05/03/2004");

		clienteService.save(cliente);
		clienteService.save(cliente1);

	}

}
