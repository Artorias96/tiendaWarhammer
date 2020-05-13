package com.sanvalero.tiendawarhammer;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.sanvalero.tiendawarhammer.model.Mesa;
import com.sanvalero.tiendawarhammer.model.Socio;

public class Operations {

	private static Scanner teclado = new Scanner(System.in);
	
	public void Operacion1(Socio nuevoSocio) 
	{
		System.out.println("Nombre");
			String nombre=teclado.next();
			nuevoSocio.setNombre(nombre);
		System.out.println("Contraseña");
		    String contraseña=teclado.next();
			nuevoSocio.setContraseña(contraseña);
		System.out.println("Email");
			String email=teclado.next();
			nuevoSocio.setEmail(email);
		System.out.println("Dni");
			String dni=teclado.next();
			nuevoSocio.setDni(dni);
			
		System.out.println("Hemos Registrado el usuario " + nuevoSocio.getNombre());
		String freno=teclado.next();
	}
	
	public void CrearMesas(Mesa mesa1, Mesa mesa2) 
	{
		mesa1.setNumeroMesa(1);
		mesa2.setNumeroMesa(2);
		mesa2.setMesaOcupada(true);		
	}
	
	public void reservarMesa(Mesa mesa, Socio socio) 
	{
		socio.reservarMesa(mesa);
		if (mesa.isMesaOcupada()==false) {
			mesa.setMesaOcupada(true);
			System.out.println("Mesa reservada con exito");
		}
	}
}
