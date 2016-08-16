package com.atikasoft.workshop.services;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

	public Integer suma(Integer operador1 , Integer operador2) {
		return operador1+operador2;
	}
	
	public Integer resta(Integer operador1 , Integer operador2) {
		return operador1-operador2;
	}
}
