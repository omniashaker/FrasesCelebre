package com.aula114.model;
import java.io.Serializable;
import java.util.Date;

public class Autor implements Serializable {
	private String nombre;
	private String fechaNac;
	private int id_autor;

	public int getId_autor() {
		return id_autor;
	}

	public void setId_autor(int id_autor) {
		this.id_autor = id_autor;
	}

	public Autor() {
		super();
	}

	

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
