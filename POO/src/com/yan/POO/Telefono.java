package com.yan.POO;

public class Telefono {
	
	private int id;
	private String marca;
	private String modelo;
	private double precio;
	
	//constructor por defecto, en caso de que no se especifiquen estos datos al crear un nuevo objeto Telefono
	public Telefono() {
		this.id = 0;
		this.marca = "Motorola";
		this.modelo = "A";
		this.precio = 1.5;
	}
	
	//Constructor Sobreescrito, en caso de que se especificquen estos datos 
	public Telefono(int id, String marca, double precio) {
		this.id = id;
		this.marca = marca;
		this.precio = precio;
	}
	
		
	//Getters Setters, sirven para asignar valores y obtenerlos
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void mostrarDatos() {
		System.out.println("id = " + id);
		System.out.println("marca = " + marca);
		System.out.println("modelo = " + modelo);
		System.out.println("precio = " + precio);
	}

}
