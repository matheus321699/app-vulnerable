package com.github.matheus321699.fornecedor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.github.matheus321699.fornecedor.domain.TrianguloEquilatero;
import com.github.matheus321699.fornecedor.services.PitagorasService;

@SpringBootTest
class TeoremaDePitagorasApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void deveriaCalcularTeoremaDePitagoras() {
		TrianguloEquilatero triangulo = new TrianguloEquilatero(7.0, 5.0, 0);
		PitagorasService service = new PitagorasService();
		double calculo = service.calculoTeoremaDePitagoras(triangulo);
		assertEquals(32, calculo);
	}

}
