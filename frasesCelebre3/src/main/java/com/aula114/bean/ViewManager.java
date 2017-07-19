package com.aula114.bean;

import java.util.List;
import java.util.Set;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.event.AjaxBehaviorEvent;

import com.aula114.model.Autor;
import com.aula114.model.FraseCelebre;

@ManagedBean
@RequestScoped

public class ViewManager implements Serializable {

	public Autor getA() {
		return a;
	}

	public void setA(Autor a) {
		this.a = a;
	}

	private Set <String> listaCategorias;
	private List <FraseCelebre> listaFrasesCategoria;
	private String categoriaSeleccionada = null;
	private FraseCelebre fselect= new FraseCelebre();
	private Autor a =new Autor();
	


	@ManagedProperty("#{fraseService}")
	private ServiceFrase service;

	@PostConstruct
	public void init() {
		listaCategorias = service.mostrarCategorias();
	}
	
	
	public FraseCelebre getFselect() {
                return fselect;
        }
	public void setFselect(FraseCelebre fselect) {
                this.fselect = fselect;
        }
	public void setCategoriaSeleccionada(String categS) {
                categoriaSeleccionada = categS;
		listaFrasesCategoria = service.mostrarFrasesPorCategoria(categoriaSeleccionada);
        }
	public String getCategoriaSeleccionada() {
            return categoriaSeleccionada;
        }
        // Ahora el siguiente método 'add' no es necesario.
        // Servía cuando teníamos button submit en la vista
	/*public String add(){
		listaFrasesCategoria = service.mostrarFrasesPorCategoria(categoriaSeleccionada);
		return null;
	}*/


	public ServiceFrase getService() {
		return service;
	}

	public void setService(ServiceFrase service) {
		this.service = service;
	}

	public Set<String> getListaCategorias() {
		return listaCategorias;
	}

	public void setListaCategorias(Set<String> listaCategorias) {
		this.listaCategorias = listaCategorias;
	}

	public List<FraseCelebre> getListaFrasesCategoria() {
		return listaFrasesCategoria;
	}

	public void setListaFrasesCategoria(List<FraseCelebre> listaFrasesCategoria) {
		this.listaFrasesCategoria = listaFrasesCategoria;
	}
        public void cateChange(final AjaxBehaviorEvent event)  {
        }
        
        public String add() {
        	service.insertar(a,fselect);
			return "vista1";
		
			
        	
        }
}
