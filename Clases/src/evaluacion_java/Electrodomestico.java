/*	Ejercicio:	Evaluación Nro 2 - POO Java
 * 	Curso:		Desarrollo de Apps Android
 *  Alumno:		Hugo Pérez
 */

package evaluacion_java;

public class Electrodomestico {

	// Constantes
	protected final static String COLOR_DEF = "blanco";
	protected final static char CONSUMO_ENERGETICO_DEF = 'F';
	protected final static double PRECIO_BASE_DEF = 100000;
	protected final static double PESO_DEF = 5;

	// Los Atributos
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;

	private void comprobarColor(String color) {

		// Colores
		String colores[] = { "blanco", "negro", "rojo", "azul", "gris" };
		boolean encontrado = false;

		for (int i = 0; i < colores.length && !encontrado; i++) {

			if (colores[i].equals(color)) {
				encontrado = true;
			}

		}

		if (encontrado) {
			this.color = color;
		} else {
			this.color = COLOR_DEF;
		}

	}

	public void comprobarConsumoEnergetico(char consumoEnergetico) {

		if (consumoEnergetico >= 65 && consumoEnergetico <= 70) {
			this.consumoEnergetico = consumoEnergetico;
		} else {
			this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
		}

	}

	// Métodos Públicos

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public double precioFinal() {
		double plus = 0;
		switch (consumoEnergetico) {
		case 'A':
			plus += 100000;
			break;
		case 'B':
			plus += 80000;
			break;
		case 'C':
			plus += 60000;
			break;
		case 'D':
			plus += 50000;
			break;
		case 'E':
			plus += 30000;
			break;
		case 'F':
			plus += 10000;
			break;
		}

		if (peso >= 0 && peso < 19) {
			plus += 10000;
		} else if (peso >= 20 && peso < 49) {
			plus += 50000;
		} else if (peso >= 50 && peso <= 79) {
			plus += 80000;
		} else if (peso >= 80) {
			plus += 100000;
		}

		return precioBase + plus;
	}

	// Contructores
	public Electrodomestico() {
		this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF);
	}

	public Electrodomestico(double precioBase, double peso) {
		this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF);
	}

	public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color) {
		this.precioBase = precioBase;
		this.peso = peso;
		comprobarConsumoEnergetico(consumoEnergetico);
		comprobarColor(color);
	}

}
