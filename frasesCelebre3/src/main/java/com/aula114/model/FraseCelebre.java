package com.aula114.model;
import java.io.Serializable;
import com.aula114.model.Autor;

public class FraseCelebre implements Serializable {
	private String frase;
	private String categoria;
	private Autor autor=new Autor();

	public FraseCelebre() {
		super();
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
}
