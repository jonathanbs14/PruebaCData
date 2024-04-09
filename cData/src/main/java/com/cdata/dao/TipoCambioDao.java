package com.cdata.dao;

public class TipoCambioDao {
    private String monedaEntrada;
    
    private String monedaSalida;
    
    private float cambio;

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
