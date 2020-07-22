package com.springjdbc02.ejemplo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springjdbc02.ejemplo.dao.ProductoDAO;
import com.springjdbc02.ejemplo.modelo.Producto;

@Service
public class ProductoServicioImpl implements ProductoServicio {

	@Autowired
	ProductoDAO productoDAO;
	
	@Override
	public void listaDeProductos() {
		List<Producto> productos=productoDAO.getAllProductos();
		for(Producto producto:productos) {
			System.out.println(producto);
		}
		
	}

	@Override
	public void numeroDeProductosInsertados() {
		Producto producto=new Producto();
		producto.setNombre_producto("LECHE GLORIA");
		producto.setPrecio_producto(4.00);
		Integer i=productoDAO.insertProducto(producto);
		System.out.println(i);
	}

	@Override
	public void buscarProductoPorId() {
		Integer id=2;
		Producto producto=productoDAO.findProductoById(id);
		System.out.println(producto);
	}

	@Override
	public void numeroDeProductosActualizados() {
		Producto producto=new Producto();
		producto.setId_producto(6);
		producto.setNombre_producto("LECHE IDEAL");
		producto.setPrecio_producto(5.00);
		Integer i=productoDAO.updateProducto(producto);
		System.out.println(i);		
	}

	@Override
	public void numeroDeproductosEliminados() {
		Integer id=6;
		Integer i=productoDAO.deleteProducto(id);
		System.out.println(i);
	}

}
