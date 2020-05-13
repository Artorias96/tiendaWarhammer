package com.sanvalero.tiendawarhammer.model;

import java.util.ArrayList;
import java.util.List;

public class Socio {
	
	private String nombre;
	private String contraseña;
	private String email;
	private String dni;
	
	private List<Productos> producto;
	
	public Socio() {}
	public Socio(String nombre, String contraseña, String email, String dni) {
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.email = email;
		this.dni = dni;
		this.producto = new ArrayList<>();
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombreSocio) {
		this.nombre = nombreSocio;
	}


	public String getContraseña() {
		return contraseña;
	}


	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}

	public List<Productos> getProducto() {
		return producto;
	}
	
	public void setProducto(List<Productos> producto) {
		this.producto = producto;
	}
	public void reservarMesa(Mesa mesaSolicitante) {
		
		if( mesaSolicitante.isMesaOcupada()) {
			System.out.println("La mesa esta ocupada");
		}
		else 
		{
			System.out.println("La mesa esta libre");
		}
	}
	
	public void añadirProducto(Productos producto1, int cantidad) {
		
		Productos detalle = new Productos(producto1.getPrecio(), producto1.getNombreProducto(), producto1.getDescripcion(), producto1.getFoto(), cantidad);
		
		producto.add(detalle);
	}
	
	    public void eliminarProducto(Productos producto) {
	    	((List<Productos>) producto).remove(producto);
	    	
	    }
}
