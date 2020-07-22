package com.springjdbc02.ejemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springjdbc02.ejemplo.servicio.ProductoServicio;

@SpringBootApplication
public class SpringJdbc02Application {

	@Autowired
	ProductoServicio productoServicio;
	
	public static void main(String[] args) {
		ApplicationContext app=SpringApplication.run(SpringJdbc02Application.class, args);
		
		ProductoServicio productoServicio=app.getBean(ProductoServicio.class);
	
		productoServicio.listaDeProductos();
		
		//productoServicio.numeroDeProductosInsertados();

		//productoServicio.buscarProductoPorId();
		
		//productoServicio.numeroDeProductosActualizados();
		
		//productoServicio.numeroDeproductosEliminados();
	}

}
