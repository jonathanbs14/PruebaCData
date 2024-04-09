package com.cdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdata.dao.TipoCambioDao;
import com.cdata.service.TipoCambioService;

@RestController
public class TipoCambioController {

	
	@Autowired
	private TipoCambioService service;

	@GetMapping("/saveTipoCamio")
	public String saveTipoCamio(@RequestBody TipoCambioDao tipoCambio) {
		service.RegistrarTipoCambio(tipoCambio);
		return "Tipo Cambio Guardado";
	}

	@GetMapping("/actualizarTipoCamio")
	public String updateTipoCambio(@RequestBody TipoCambioDao tipoCambio) {
		service.ActualizarTipoCambio(tipoCambio);
		return "Tipo Cambio actualizado";
	}

	@GetMapping("/getTipoCambio")
	public Float getTipoCambio(@RequestBody String entrada, @RequestBody String salida) {
		return service.ObtenerTipoCambioPorMonedaEntradaSalida(entrada,salida).block();
	}
	
}
