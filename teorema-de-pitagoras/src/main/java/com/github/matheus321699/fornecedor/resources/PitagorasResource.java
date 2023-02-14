package com.github.matheus321699.fornecedor.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.matheus321699.fornecedor.domain.TrianguloEquilatero;
import com.github.matheus321699.fornecedor.services.PitagorasService;

@RestController
@RequestMapping(value = "/pitagoras")
public class PitagorasResource {

	@Autowired
	PitagorasService service;
	
	@RequestMapping(method = RequestMethod.POST)
	public double calculoPitagoras(@RequestBody TrianguloEquilatero obj) {
		return service.calculoTeoremaDePitagoras(obj);
	}
	
}
