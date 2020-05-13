package com.sanvalero.tiendawarhammer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sanvalero.tiendawarhammer.model.Mesa;
import com.sanvalero.tiendawarhammer.model.Socio;

public class Main {
	
	private static int clave;
	private static Scanner teclado;
	private static Operations Operaciones= new Operations();
	private static List<Mesa> Listamesas=new ArrayList<>();
	
	public static void main(String args[]) {
		System.out.println("Tienda De Warhammer");
		System.out.println("¿Que operacion desea realizar?");
		System.out.println("[1] Registrar cliente, [2] Reservar Mesa, [3] Comprar producto, [0] Cerrar sesion");
		teclado=new Scanner(System.in);
		Mesa mesa1= new Mesa();
		Mesa mesa2= new Mesa();
		Operaciones.CrearMesas(mesa1, mesa2);
		Listamesas.add(mesa1);
		Listamesas.add(mesa2);		
		Socio nuevoSocio=new Socio();
		do 
		{
 			System.out.println("Bienvenido a la terminal");
			clave=teclado.nextInt();
			switch(clave) 
			{							
				case 1:
					Operaciones.Operacion1(nuevoSocio);
					break;
					
				case 2:
					System.out.println("Eligar el número de la mesa que desea");
					int numeroMesa=teclado.nextInt();
					if(numeroMesa==1)
					{
						Operaciones.reservarMesa(mesa1, nuevoSocio);
						
					}else{
						Operaciones.reservarMesa(mesa2, nuevoSocio);
					}
					
					String freno=teclado.next();
					
					break;
			}			
		}while(clave == 0);
		
			
	}
	
	
	
}
