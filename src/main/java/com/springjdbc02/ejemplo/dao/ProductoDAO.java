package com.springjdbc02.ejemplo.dao;

import java.util.List;

import com.springjdbc02.ejemplo.modelo.Producto;

public interface ProductoDAO {

	List<Producto> getAllProductos();
	Integer insertProducto(Producto producto);
	Producto findProductoById(Integer id);
	Integer updateProducto(Producto producto);
	Integer deleteProducto(Integer id);
	
}
