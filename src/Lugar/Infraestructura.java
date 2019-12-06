package Lugar;

import java.io.Serializable;
import java.util.ArrayList;

public class Infraestructura implements Serializable {

	private String Nombre;
	private Sistema mySistema;
	private ArrayList<Objeto> ListaObjeto= new ArrayList<Objeto>();


	public ArrayList<Objeto> getListaObjeto() {
		return ListaObjeto;
	}

	public void setListaObjeto(ArrayList<Objeto> listaObjeto) {
		ListaObjeto = listaObjeto;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre=Nombre;
	}

	public Sistema getMySistema() {
		return this.mySistema;
	}
	public void setMySistema(Sistema mySistema) {
		this.mySistema = mySistema;
	}


}