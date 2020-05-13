package com.sanvalero.tiendawarhammer.model;

import java.time.LocalDate;

public class Foro {
	
	private String tema;
	private String descripcion;
	private String comentarios;
	private LocalDate fecha;
	private Socio nombreSocio;
	
	public Foro(String tema, String descripcion, String comentarios, LocalDate fecha, Socio nombreSocio) {
		super();
		this.tema = tema;
		this.descripcion = descripcion;
		this.comentarios = comentarios;
		this.fecha = fecha;
		this.nombreSocio = nombreSocio;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Socio getNombreSocio() {
		return nombreSocio;
	}

	public void setNombreSocio(Socio nombreSocio) {
		this.nombreSocio = nombreSocio;
	}
			
}
