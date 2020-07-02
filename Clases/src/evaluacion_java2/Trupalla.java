package evaluacion_java2;

/**
 *  @author Hugo Perez
 * 	@version 1.0
 */



public class Trupalla extends Carro { 

	private int levelArmadura;

	/**
	 *
	 * Constructor de la clase, usa los mismos parámetros que su clase padre
	 * @param nivelArmadura Nivel de la armadura
	 * @param ocupantes Ocupantes del kromi
	 * @param fechaIngreso Fecha de ingreso del kromi
	 * @param x Posicion fila de carros
	 * @param y Posicion columna de carros
	 */

	public Trupalla(int ocupantes, String fechaIngreso, int x, int y, int nivelArmadura) { 
		super(ocupantes, fechaIngreso, x, y);
		levelArmadura = nivelArmadura;
	}

	public Trupalla(int ocupantes, String fechaIngreso, int x, int y) { 
		super(ocupantes, fechaIngreso, x, y);
		// TODO Auto-generated constructor stub
	} 

	public Trupalla(int x, int y) { 
		super(x, y);
	}

	public int getlevelArmadura() { 
		return levelArmadura;
	} 

	public void setlevelArmadura(int nivelArmadura) {
		levelArmadura = nivelArmadura;
	}
}