/*	Ejercicio:	Evaluación Nro 2 - POO Java
 * 	Curso:		Desarrollo de Apps Android
 *  Alumno:		Hugo Pérez
 */

package evaluacion_java;

public class Television extends Electrodomestico {

	// Constante
	private final static int RESOLUCION_DEF = 20;
	
	//Atributos
	private int resolucion;
	private boolean sintonizadorTDT;
	
    //Métodos públicos
	public double precioFinal() {
		double plus = super.precioFinal();

		if (resolucion > 40) {
			plus += precioBase * 0.3;
		}
		if (sintonizadorTDT) {
			plus += 50000;
		}

		return plus;
	}
	//Constructores
	public Television() {
		this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, RESOLUCION_DEF, false);
	}

	public Television(double precioBase, double peso) {
		this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF, RESOLUCION_DEF, false);
	}

	public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion,
			boolean sintonizadorTDT) {
		super(precioBase, peso, consumoEnergetico, color);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}
}