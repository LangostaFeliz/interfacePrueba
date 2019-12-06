package Lugar;

import java.io.Serializable;

public class Objeto implements Serializable {

	private Posicion myPosicion;
	private String Nombre;

	public Objeto(Posicion posicion, String Nombre)
	{
		this.myPosicion=posicion;

		this.Nombre=Nombre;
	}



	public Posicion getMyPosicion() {
		return this.myPosicion;
	}


	public void setMyPosicion(Posicion myPosicion) {
		this.myPosicion = myPosicion;
	}

	public String getNombre() {
		// TODO - implement Objeto.getNombre
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Nombre
	 */
	public void setNombre(String Nombre) {
		// TODO - implement Objeto.setNombre
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return "Objeto{" +
				"myPosicion Y =" + myPosicion.getPosicionY() +"myPosicion X ="+myPosicion.getPosicionX()+
				", Nombre='" + Nombre + '\'' +
				'}';
	}
}