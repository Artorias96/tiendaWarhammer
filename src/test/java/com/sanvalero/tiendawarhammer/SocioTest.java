package com.sanvalero.tiendawarhammer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.sanvalero.tiendawarhammer.model.Productos;
import com.sanvalero.tiendawarhammer.model.Socio;

public class SocioTest {
	
	private static Socio socio;
	
	@BeforeAll
	public static void  setupAll() {
		socio = new Socio("Paco","1234","Pacojones@gmail.com","45896325D");
	}
	

	@Test
	public void añadirProducto() {
		Productos producto = new Productos(8, "Azucar", "Azucar natural de china", null, 3);
		socio.añadirProducto(producto, 2);
		
		assertEquals(1, socio.getProducto().size());
		assertEquals(3, producto.getStock());
	}
}
