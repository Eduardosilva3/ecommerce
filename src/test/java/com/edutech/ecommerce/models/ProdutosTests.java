package com.edutech.ecommerce.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProdutosTests {

	@Test
	void validarPropriedades() {

		var produto = new Produto();
		produto.setNome("Mouse colorido");
		produto.setDescricao("Um produto feito no teste");
		produto.setValor(5.80);
		produto.setQuantidade(100);

		assertEquals("Mouse colorido", produto.getNome());
		assertEquals("Um produto feito no teste", produto.getDescricao());
		assertEquals(5.80, produto.getValor());
		assertEquals(100, produto.getQuantidade());

	}

}
