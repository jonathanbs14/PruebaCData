package com.cdata.service;

import com.cdata.dao.TipoCambioDao;

import reactor.core.publisher.Mono;

public interface TipoCambioService {
	
	
	Mono<Boolean> RegistrarTipoCambio(TipoCambioDao cambio);


	Mono<Boolean>  ActualizarTipoCambio(TipoCambioDao cambio);
	
	
	Mono<Float> ObtenerTipoCambioPorMonedaEntradaSalida(String entrada, String salida);
}
