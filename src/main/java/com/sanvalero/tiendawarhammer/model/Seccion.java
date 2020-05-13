package com.sanvalero.tiendawarhammer.model;

import java.util.ArrayList;
import java.util.List;

public class Seccion {
	
	private String nombre;
	private String categoria;
	
	private List<Productos> producto;

	public Seccion(String nombre, String categoria) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.producto = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public List<Productos> getProducto() {
		return producto;
	}

	public void setProducto(List<Productos> producto) {
		this.producto = producto;
	}
	
	
	
}
