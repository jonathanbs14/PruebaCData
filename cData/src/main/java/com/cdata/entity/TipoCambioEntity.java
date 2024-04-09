package com.cdata.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class TipoCambioEntity {

	
	  	@Id
	    @GeneratedValue
	    private int id;
	    
	    private String monedaEntrada;
	    
	    private String monedaSalida;
	    
	    private float cambio;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getMonedaEntrada() {
			return monedaEntrada;
		}

		public void setMonedaEntrada(String monedaEntrada) {
			this.monedaEntrada = monedaEntrada;
		}

		public String getMonedaSalida() {
			return monedaSalida;
		}

		public void setMonedaSalida(String monedaSalida) {
			this.monedaSalida = monedaSalida;
		}

		public float getCambio() {
			return cambio;
		}

		public void setCambio(float cambio) {
			this.cambio = cambio;
		}
	    
	    
	    
	    
	    
	    
	    
	    
}
