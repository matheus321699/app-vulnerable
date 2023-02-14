package com.github.matheus321699.fornecedor.services;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.stereotype.Service;

import com.github.matheus321699.fornecedor.domain.TrianguloEquilatero;

@Service
public class PitagorasService {
	
	public double calculoTeoremaDePitagoras(TrianguloEquilatero triangulo) {
		
		if(triangulo.getCatetoAdjacente() == 0) {
			double calculo;
			calculo = (Math.pow(triangulo.getHipotenusa(), 2)) - (Math.pow(triangulo.getCatetoOposto(), 2));
			BigDecimal bd = new BigDecimal(calculo).setScale(3, RoundingMode.HALF_EVEN);
			return bd.doubleValue();
		}
		
		if(triangulo.getCatetoOposto() == 0) {
			double calculo;
			calculo = (Math.pow(triangulo.getHipotenusa(), 2)) - (Math.pow(triangulo.getCatetoAdjacente(), 2));
			BigDecimal bd = new BigDecimal(calculo).setScale(3, RoundingMode.HALF_EVEN);
			return bd.doubleValue();
		}
		
		if(triangulo.getHipotenusa() == 0) {
			double calculo;
			calculo = (Math.pow(triangulo.getCatetoAdjacente(), 2)) + (Math.pow(triangulo.getCatetoOposto(), 2));
			BigDecimal bd = new BigDecimal(calculo).setScale(3, RoundingMode.HALF_EVEN);
			return bd.doubleValue();
		}
	
		return 0;
				
	}

}
