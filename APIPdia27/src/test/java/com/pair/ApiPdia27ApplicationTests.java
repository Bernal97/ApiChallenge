package com.pair;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

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
	
	@InjectMocks
	private ProductoService service;
	
	@Mock
	private IProductoRepository mock;
	
	private Producto prod1 = new Producto(1, "jabon", 3);
	private Producto prod2 = new Producto(2, "Aceite", 5);
	
	@Test
	void testearSeleccion() {
		when(mock.findAll()).thenReturn(new ArrayList<Producto>());
		List<Producto> producto = service.findAll();
		assertNotNull(producto);
	}
	
	@Test
	void testearGuardado() {
		when(mock.existsById(prod1.getCodigoProducto())).thenReturn(false);
		when(mock.save(prod1)).thenReturn(prod1);
		boolean resultado = service.save(prod1);
		assertTrue(resultado);
	}
	
	
	
	@Test
	void testearDeleteo() {
		when(mock.existsById(prod1.getCodigoProducto())).thenReturn(true);
		boolean resultado = service.deleteById(prod1.getCodigoProducto());
		assertTrue(resultado);
	}
	
	@Test
	void contextLoads() {
		System.out.println("Soy un mensaje");
	}
	
}
