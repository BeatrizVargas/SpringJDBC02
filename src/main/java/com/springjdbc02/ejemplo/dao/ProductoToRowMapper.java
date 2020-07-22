package com.springjdbc02.ejemplo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc02.ejemplo.modelo.Producto;

public class ProductoToRowMapper implements RowMapper<Producto>{

	@Override
	public Producto mapRow(ResultSet rs, int rowNum) throws SQLException {
		Producto producto=new Producto();
		producto.setId_producto(rs.getInt("id_producto"));
		producto.setNombre_producto(rs.getString("nombre_producto"));
		producto.setPrecio_producto(rs.getDouble("precio_producto"));
		return producto;
	}

}
