package com.sanvalero.tiendawarhammer.model;

public class Administrador extends Socio{
	
	private String perfil;
	private String cargo;
	
	public Administrador(String nombre, String contraseña, String email, String dni, String perfil, String cargo) {
		super(nombre, contraseña, email, dni);
		this.perfil = perfil;
		this.cargo = cargo;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	

}
