package com.atikasoft.workshop;

import static org.junit.Assert.*;

import org.junit.Test;

import com.atikasoft.workshop.services.CalculadoraService;

public class CalculadoraServiceTest {

	@Test
	public void testSuma() {
		CalculadoraService d = new CalculadoraService();
		assertEquals("La suma de 1+2=3", Integer.valueOf(3),d.suma(1, 2));
	}

}
