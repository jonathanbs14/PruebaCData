package com.cdata.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class OperacionEntity {
	
	
  	@Id
    @GeneratedValue
    private int id;
  	
  	private String usuario;
  	
    private String monedaEntrada;
    
    private String monedaSalida;
    
          
    private float montoInicial;
   
    private float tipoCambio; 
    
    private float montoFinal;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
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


	public float getTipoCambio() {
		return tipoCambio;
	}


	public void setTipoCambio(float tipoCambio) {
		this.tipoCambio = tipoCambio;
	}


	public float getMontoInicial() {
		return montoInicial;
	}


	public void setMontoInicial(float montoInicial) {
		this.montoInicial = montoInicial;
	}


	public float getMontoFinal() {
		return montoFinal;
	}


	public void setMontoFinal(float montoFinal) {
		this.montoFinal = montoFinal;
	}

    
    
}
