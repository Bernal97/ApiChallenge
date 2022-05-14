package com.pair.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "productos")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigoProducto;
	
	private String nombre;
	
	private int cant_stock;

	
	public Producto(int i, String name, int cant) {
		this.codigoProducto = (long) i;
		this.nombre = name;
		this.cant_stock = cant;
	}
	
	public Long getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(Long codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCant_stock() {
		return cant_stock;
	}

	public void setCant_stock(int cant_stock) {
		this.cant_stock = cant_stock;
	}

	
}
