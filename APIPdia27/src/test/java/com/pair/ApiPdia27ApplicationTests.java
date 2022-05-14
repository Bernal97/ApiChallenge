package com.pair;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.pair.models.Producto;
import com.pair.repositories.IProductoRepository;
import com.pair.services.ProductoService;


@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
class ApiPdia27ApplicationTests {
	
	
	
	@Mock
	private ProductoService servicio;
	
	private Producto prod1 = new Producto(1, "jabon", 3);
	private Producto prod2 = new Producto(2, "Aceite", 5);
	
	@Test
	void testearConstruccion() {
		when(servicio.findById(1)).thenReturn(prod1);
		if(servicio.save(prod1)) {
			System.out.println("Carga Exitosa");
		}else {
			System.out.println("Carga Fallida");
		}
		
	}
	
	
	@Test
	void testearUpdate() {
		when(servicio.findById(1)).thenReturn(prod1);
		if(servicio.updateProducto(prod1)) {
			System.out.println("Updateo Exitoso");
		}else {
			System.out.println("Updateo Fallido");
		}
	}
	
	@Test
	void contextLoads() {
		System.out.println("Soy un mensaje");
	}
	
}
