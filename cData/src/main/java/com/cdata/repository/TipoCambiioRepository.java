package com.cdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdata.entity.TipoCambioEntity;

import jakarta.persistence.Entity;

@Repository
public interface TipoCambiioRepository extends JpaRepository<TipoCambioEntity, Integer>{
	
	
	TipoCambioEntity findByCambios(String monedaEntrada , String monedaSalida);
	
}
