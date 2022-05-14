package com.pair.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "detalleVentas")
@AllArgsConstructor
@NoArgsConstructor
public class DetalleVentas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "nro_factura")
    private Venta nroFactura;

    @ManyToOne
    @JoinColumn(name = "id_productos")
    private Producto idProducto;

    private long cantidad;

	public Venta getNroFactura() {
		return nroFactura;
	}

	public void setNroFactura(Venta nroFactura) {
		this.nroFactura = nroFactura;
	}

	public long getCantidad() {
		return cantidad;
	}

	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Producto idProducto) {
		this.idProducto = idProducto;
	}

	
    
    
}
