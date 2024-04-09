package com.cdata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.cdata.dao.In;
import com.cdata.dao.Out;
import com.cdata.entity.OperacionEntity;
import com.cdata.repository.OperacionRepository;
import com.cdata.service.OperacionService;

import reactor.core.publisher.Mono;

public class OperacionServiceImpl implements OperacionService{

	
	@Autowired
	OperacionRepository repository;
	
	@Override
	public Mono<Out> RegistrarOperacion(In in, float cambio) {
		Out out = new Out();
		
		OperacionEntity entity = new OperacionEntity();
		entity.setMonedaEntrada(in.getMonedaEntrada());
		entity.setMonedaSalida(in.getMonedaSalida());
		entity.setMontoInicial(in.getMontoInicial());
		entity.setMontoFinal(in.getMontoInicial() * cambio);
		
		repository.save(entity);
		return Mono.just(out);
	}

}
