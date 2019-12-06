package Lugar;

import java.io.Serializable;

public class Posicion implements Serializable {

	private int posicionX;
	private int posicionY;

	public Posicion(int y, int x) {
		this.posicionX = x;
		this.posicionY = y;

	}

	public int getPosicionX() {
		return this.posicionX;
	}

	/**
	 * 
	 * @param posicionX
	 */
	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	public int getPosicionY() {
		return this.posicionY;
	}

	/**
	 * 
	 * @param posicionY
	 */
	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}

}