package com.cdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdata.dao.In;
import com.cdata.dao.TipoCambioDao;
import com.cdata.service.OperacionService;
import com.cdata.service.TipoCambioService;

@RestController
public class OperacionController {
	@Autowired
	private OperacionService operacionService;
	
	@Autowired
	private TipoCambioService tipoCambioService;
	
	@GetMapping("/saveOperacion")
	public String saveOperacion(@RequestBody In in) {
		Float cambio = tipoCambioService.ObtenerTipoCambioPorMonedaEntradaSalida(in.getMonedaEntrada(), in.getMonedaSalida()).block();
		operacionService.RegistrarOperacion(in, cambio);
		return "Operacion Guardado";
	}

}
