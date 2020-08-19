package com.hg.crud.models;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

<<<<<<< HEAD
@Document(collection = "productos")
=======
@Document(collection = "Productos")
>>>>>>> 3c979586bbaeeb0949ba7786a51f4265afda74bb
public class ProductoDTO {
	
	@Id
	private String _id;
<<<<<<< HEAD
	
	private String name;
	
	private Double price;
	
	private LocalDate expiry_date;

	public String get_id() {
		return _id;
=======
	private String nombre;
	private String descripcion;
	private int cantidad;
	private double precio;

	public String get_id() {
		return this._id;
>>>>>>> 3c979586bbaeeb0949ba7786a51f4265afda74bb
	}

	public void set_id(String _id) {
		this._id = _id;
	}

<<<<<<< HEAD
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDate getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(LocalDate expiry_date) {
		this.expiry_date = expiry_date;
	}

=======
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	



>>>>>>> 3c979586bbaeeb0949ba7786a51f4265afda74bb
	
}
