package com.springjdbc02.ejemplo.dao;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.springjdbc02.ejemplo.modelo.Producto;

@Repository
public class ProductoDAOImpl extends JdbcDaoSupport implements ProductoDAO{

	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	public void initialize() {
		setDataSource(dataSource);
	}
	
	@Override
	public List<Producto> getAllProductos() {
		String sql="SELECT * FROM producto";
		ProductoToRowMapper productoToRowMapper= new ProductoToRowMapper();
		List<Producto> productos=getJdbcTemplate().query(sql, productoToRowMapper);
		return productos;
	}

	@Override
	public Integer insertProducto(Producto producto) {
		String sql="INSERT INTO producto(nombre_producto,precio_producto) VALUES (?,?)";
		Integer i=getJdbcTemplate().update(sql,new Object[] { producto.getNombre_producto(),producto.getPrecio_producto() });
		return i;
	}

	@Override
	public Producto findProductoById(Integer id) {
		String sql="SELECT * FROM producto WHERE id_producto=?";
		ProductoToRowMapper productoToRowMapper= new ProductoToRowMapper();
		Producto producto=getJdbcTemplate().queryForObject(sql, new Object[] {id}, productoToRowMapper);
		return producto;
	}

	@Override
	public Integer updateProducto(Producto producto) {
		String sql="UPDATE producto SET nombre_producto=?,precio_producto=? WHERE id_producto=?  ";
		Integer i=getJdbcTemplate().update(sql,new Object[] {
													producto.getNombre_producto(),
													producto.getPrecio_producto(),
													producto.getId_producto()
														});
		return i;
	}

	@Override
	public Integer deleteProducto(Integer id) {
		String sql="DELETE FROM producto WHERE id_producto=?";
		Integer i=getJdbcTemplate().update(sql,new Object[] {id});
		return i;
	}	

}
