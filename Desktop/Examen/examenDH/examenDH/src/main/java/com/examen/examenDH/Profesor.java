package com.examen.examenDH;

public abstract class Profesor {
	
	private Integer codProfesor;
	private String nombre;
	private String apellido;
	public Integer getCodProfesor() {
		return codProfesor;
	}
	public void setCodProfesor(Integer codProfesor) {
		this.codProfesor = codProfesor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
