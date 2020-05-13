package com.sanvalero.tiendawarhammer.model;

public class Mesa {
	
	private int numeroMesa;
	private boolean mesaOcupada;
	
	public Mesa(int numeroMesa, boolean mesaOcupada) {
		this.numeroMesa = numeroMesa;
		this.mesaOcupada = mesaOcupada;
	}

	public Mesa(){
		
	}
	
	public int getNumeroMesa() {
		return numeroMesa;
	}

	public void setNumeroMesa(int numeroMesa) {
		this.numeroMesa = numeroMesa;
	}

	public boolean isMesaOcupada() {
		return mesaOcupada;
	}

	public void setMesaOcupada(boolean mesaOcupada) {
		this.mesaOcupada = mesaOcupada;
	}
	
}
