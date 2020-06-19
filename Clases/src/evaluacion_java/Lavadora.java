/*	Ejercicio:	Evaluación Nro 2 - POO Java
 * 	Curso:		Desarrollo de Apps Android
 *  Alumno:		Hugo Pérez
 */

package evaluacion_java;

public class Lavadora extends Electrodomestico {
	
	//Valor asignado por defecto
	private final static int CARGA_DEF = 5;

	//Atributos
	private int carga;
	
	//Métodos
	public int getCarga() {
		return carga;
	}

	public double precioFinal() {

		double plus = super.precioFinal();

		if (carga > 30) {
			plus += 50000;
		}

		return plus;
	}
	
	//Constructores
	public Lavadora() {
		this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
	}

	public Lavadora(double precioBase, double peso) {
		this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
	}

	public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga) {
		super(precioBase, peso, consumoEnergetico, color);
		this.carga = carga;
	}
}