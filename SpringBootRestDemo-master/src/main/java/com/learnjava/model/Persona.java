package com.learnjava.model;

public class Persona {
	
	
	private String nombre;
	private int edad;
	
	
	public Persona(){
		
	}
	
	public Persona(String nombre, int edad) {
		super();
		
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setName(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

}