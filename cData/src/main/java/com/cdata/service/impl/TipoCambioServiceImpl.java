package com.cdata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdata.dao.TipoCambioDao;
import com.cdata.entity.TipoCambioEntity;
import com.cdata.repository.TipoCambiioRepository;
import com.cdata.service.TipoCambioService;

import reactor.core.publisher.Mono;
@Service
public class TipoCambioServiceImpl implements TipoCambioService{
	
	@Autowired
	private TipoCambiioRepository repository;

	@Override
	public 	Mono<Boolean> RegistrarTipoCambio(TipoCambioDao cambio) {
		
		TipoCambioEntity entity = new  TipoCambioEntity();
		entity.setMonedaEntrada(cambio.getMonedaEntrada());
		entity.setMonedaSalida(cambio.getMonedaSalida());
		entity.setCambio(cambio.getCambio());
		repository.save(entity);
		
		return Mono.empty();
	}

	@Override
	public 	Mono<Boolean> ActualizarTipoCambio(TipoCambioDao cambio) {
		
		TipoCambioEntity entity = new  TipoCambioEntity();
		entity.setMonedaEntrada(cambio.getMonedaEntrada());
		entity.setMonedaSalida(cambio.getMonedaSalida());
		entity.setCambio(cambio.getCambio());
		repository.save(entity);
		
		
		return Mono.empty();
	}

	@Override
	public Mono<Float> ObtenerTipoCambioPorMonedaEntradaSalida(String entrada, String salida) {
		
	TipoCambioEntity entity = 	repository.findByCambios(entrada, salida);
		Float numero = entity.getCambio();
		
		return Mono.just(numero);
	}

}
