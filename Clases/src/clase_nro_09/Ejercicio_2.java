/*	Ejercicio:	2 Individual
 *  Clase:		9
 *  Alumno:		Hugo P�rez
 * 
 * Haz una aplicaci�n que calcule el �rea de un c�rculo (pi*R2). El radio se pedir� por teclado 
 * (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el m�todo 
 * pow de Math. */

package clase_nro_09;

import java.util.Scanner;


public class Ejercicio_2 {


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		double pi=Math.PI;
		double radio;
						
		System.out.println("Ingrese valor del radio del c�rculo");
		System.out.print("");
		radio =sc.nextDouble();
		
		double area = pi*Math.pow(radio, 2);

				
		System.out.println("El �rea total del c�rculo es de: " +(int)area);
		
	}

}
