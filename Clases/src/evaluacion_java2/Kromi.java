package evaluacion_java2;


/**
 *  @author Hugo Perez
 * 	@version 1.0
 */



public class Kromi extends Carro {

	public String yearFab;
	public String marca;
	
	public Kromi(int ocupantes, String fechaIngreso, int x, int y, String yearFab, String marca) {
		super(ocupantes, fechaIngreso, x, y);
		this.yearFab = yearFab;
		this.marca = marca;
	} 

	public Kromi(int ocupantes, String fechaIngreso, int x, int y) {
		super(ocupantes, fechaIngreso, x, y);
	} 

	public Kromi(int x, int y) {
		super(x, y);
	}
	
	public String getyearFab() {
		return yearFab;
	} 

	public void setAnioFabricacion(String yearFab) {
		this.yearFab = yearFab;
	} 

	public String getMarca() {
		return marca;
	} 

	public void setMarca(String marca) {
		this.marca = marca;
	} 

	@Override
	public String toString() {
		return "Kromi [anioFabricacion=" + yearFab + ", marca=" + marca + "]";
	} 


	public void imprimir() {
		System.out.println("Anio Fabricacion: " + getyearFab() + "\n Marca: " + getMarca());
	} 


} 