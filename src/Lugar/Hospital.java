package Lugar;

import java.io.Serializable;

public class Hospital extends Establecimiento {

	private Posicion myPosicion;
	private Especialidad myEspecialidad;

	public Posicion getMyPosicion() {
		return this.myPosicion;
	}

	/**
	 * 
	 * @param myPosicion
	 */
	public void setMyPosicion(Posicion myPosicion) {
		this.myPosicion = myPosicion;
	}

	public Especialidad getMyEspecialidad() {
		return this.myEspecialidad;
	}

	/**
	 * 
	 * @param myEspecialidad
	 */
	public void setMyEspecialidad(Especialidad myEspecialidad) {
		this.myEspecialidad = myEspecialidad;
	}

}