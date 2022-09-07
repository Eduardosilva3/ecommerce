package com.edutech.ecommerce.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClientesTests {

	@Test
	void validarPropriedades() {
		
		var cliente = new Cliente();
		
		cliente.setNome("Eduardo");
		cliente.setEmail("eduardo@email");
		cliente.setSenha("123456");
		cliente.setEndereco("Rua 15");
		cliente.setNumero("35");
		cliente.setCep("50 000-000");
		cliente.setCidade("Recife");
		cliente.setBairro("bairro");
		cliente.setEstado("PE");
		cliente.setComplemento("Casa 2");

		assertEquals("Eduardo", cliente.getNome());
		assertEquals("eduardo@email", cliente.getEmail());
		assertEquals("123456", cliente.getSenha());
		assertEquals("Rua 15", cliente.getEndereco());
		assertEquals("35", cliente.getNumero());
		assertEquals("50 000-000", cliente.getCep());
		assertEquals("Recife", cliente.getCidade());
		assertEquals("bairro", cliente.getBairro());
		assertEquals("PE", cliente.getEstado());
		assertEquals("Casa 2", cliente.getComplemento());
		

	}

}
