package com.pair.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pair.models.Producto;
import com.pair.repositories.IProductoRepository;

@Service
public class ProductoService {
	@Autowired
	private IProductoRepository pRepository;
	
	public List<Producto> findAll(){
		return pRepository.findAll();
	}
	
	public Producto findById(int i) {
		if(pRepository.existsById((long) i)) {
			return pRepository.findById(i);
		}
		return null;
	}
	
	public boolean save(Producto producto) {
		if(pRepository.existsById(producto.getCodigoProducto())) {
			return false;
		}
		pRepository.save(producto);
		return true;
	}
	
	public boolean updateProducto(Producto producto) {
		if(!pRepository.existsById(producto.getCodigoProducto())) {
			return false;
		}
		pRepository.save(producto);
		return true;
	}
	
	public boolean deleteById(Long id) {
		if(pRepository.existsById(id)) {
			pRepository.deleteById(id);
			return true;
		}
		return false;
	}
	

}
