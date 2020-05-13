package com.sanvalero.tiendawarhammer.model;

public class Productos {
	
	private float precio;
	private String nombreProducto;
	private String descripcion;
	private String foto;
	private int Stock;
	
	
	public Productos(float precio, String nombreProducto, String descripcion, String foto, int stock) {
		super();
		this.precio = precio;
		this.nombreProducto = nombreProducto;
		this.descripcion = descripcion;
		this.foto = foto;
		Stock = stock;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	public String getNombreProducto() {
		return nombreProducto;
	}


	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}


	public int getStock() {
		return Stock;
	}


	public void setStock(int stock) {
		Stock = stock;
	}
	
	

}
