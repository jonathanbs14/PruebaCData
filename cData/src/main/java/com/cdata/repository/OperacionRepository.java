package com.cdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdata.entity.OperacionEntity;
import com.cdata.entity.TipoCambioEntity;
@Repository
public interface OperacionRepository  extends JpaRepository <OperacionEntity, Integer>  {
	
	
	

}
