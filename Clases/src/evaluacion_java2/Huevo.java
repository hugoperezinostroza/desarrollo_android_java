package evaluacion_java2;


/**
 *  @author Hugo Perez
 * 	@version 1.0
 */

import java.util.ArrayList;


public class Huevo {

	private int pscFil;
	private int pscCol;
	private int puntaje;
	
	
	
	@Override
	public String toString() {
		return "Huevo [posicionFila=" + pscFil + ", posicionColumna=" + pscCol + ", puntaje=" + puntaje
				+ "]";
	} 


	public int getPosicionFila() {
		return pscFil;
	} 


	public void setPosicionFila(int posicionFila) {
		this.pscFil = posicionFila;
	} 


	public int getPosicionColumna() {
		return pscCol;
	} 


	public void setPosicionColumna(int posicionColumna) {
		this.pscCol = posicionColumna;
	} 

	public int getPuntaje() {
		return puntaje;
	} 

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	} 


	public Huevo() {
		super();

	}

	/**
	 *
	 * Constructor de la clase, usa los mismos parámetros que su clase padre
	 * @param posicionFila Posicion fila del huevo
	 * @param posicionColumna Posicion columna del huevo
	 * @param puntaje Puntaje de destruccion
	 * @param huevos Lista de huevos
	 */
	
	public Huevo(int posicionFila, int posicionColumna, int puntaje, ArrayList<Huevo> huevos) {
		super();
		this.pscFil = posicionFila;
		this.pscCol = posicionColumna;
		this.puntaje = puntaje;
	}

	
	static void mostrarColumna() {
			
	} 
	
	
	static void mostrarPuntaje() {
		
	} 
	
	
	
}
