package evaluacion_java2;

/**
 *  @author Hugo Perez
 * 	@version 1.0
 */

public class Carro {

	private int ocu;
	protected String fechaIng;
	private int x;
	private int y;


	public Carro(int ocupantes, String fechaIngreso, int x, int y) {
		this.ocu = ocupantes;
		this.fechaIng = fechaIngreso;
		this.x = x;
		this.y = y;
	} 
	
	
	public Carro(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	} 

	
	public int getOcupantes() {
		return ocu;
	}

	public void setOcupantes(int ocupantes) {
		this.ocu = ocupantes;
	} 


	public String getFechaIngreso() {
		return fechaIng;
	} 


	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIng = fechaIngreso;
	}
	

	@Override
	public String toString() {
		return "Carro [ocupantes=" + ocu + ", fechaIngreso=" + fechaIng + "]" ;
	} 


	
	public void imprimir() {
		System.out.println("Ocupantes: " + getOcupantes());
	} 

	public int getX() {
		return x;
	} 
	
	public void setX(int x) {
		this.x = x;
	} 

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	} 


}
