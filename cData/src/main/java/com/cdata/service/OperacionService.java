package com.cdata.service;

import com.cdata.dao.In;
import com.cdata.dao.Out;
import com.cdata.dao.TipoCambioDao;

import reactor.core.publisher.Mono;

public interface OperacionService {

	
	
	Mono<Out> RegistrarOperacion(In in, float cambio);
	
}
