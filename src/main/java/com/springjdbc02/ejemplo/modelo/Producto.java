package com.springjdbc02.ejemplo.modelo;

public class Producto {
	
	private Integer id_producto;
	private String nombre_producto;
	private Double precio_producto;
	public Integer getId_producto() {
		return id_producto;
	}
	public void setId_producto(Integer id_producto) {
		this.id_producto = id_producto;
	}
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
	public Double getPrecio_producto() {
		return precio_producto;
	}
	public void setPrecio_producto(Double precio_producto) {
		this.precio_producto = precio_producto;
	}
	@Override
	public String toString() {
		return "Producto [id_producto=" + id_producto + ", nombre_producto=" + nombre_producto + ", precio_producto="
				+ precio_producto + "]";
	}
	
	

}
