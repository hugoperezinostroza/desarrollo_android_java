/*	Ejercicio:	2 Individual
 *  Clase:		9
 *  Alumno:		Hugo Pérez
 * 
 * Haz una aplicación que calcule el área de un círculo (pi*R2). El radio se pedirá por teclado 
 * (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método 
 * pow de Math. */

package clase_nro_09;

import java.util.Scanner;


public class Ejercicio_2 {


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		double pi=Math.PI;
		double radio;
						
		System.out.println("Ingrese valor del radio del círculo");
		System.out.print("");
		radio =sc.nextDouble();
		
		double area = pi*Math.pow(radio, 2);

				
		System.out.println("El área total del círculo es de: " +(int)area);
		
	}

}
