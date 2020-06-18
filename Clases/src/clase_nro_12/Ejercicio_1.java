/*	Ejercicio:	1 Individual
 *  Clase:		12
 *  Alumno:		Hugo Pérez
 * 
 *Dada una cadena. Ej. : “Mi Talento digital” mostrar por pantalla la cantidad de vocales que tiene. Ejemplo: Entrada: 
 *“Talento digital" Salida: La cantidad de vocales es 6 */

package clase_nro_12;

import java.util.Scanner;

public class Ejercicio_1 {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(final String[] args) throws Exception {
		int contar = 0, contarCon = 0;
		System.out.print("escriba un texto: \n");
		String txt = teclado.nextLine();
		for (int i = 0; i < txt.length(); i++) {
			if ((txt.charAt(i) == 'a') || (txt.charAt(i) == 'e') || (txt.charAt(i) == 'i') || (txt.charAt(i) == 'o')
					|| (txt.charAt(i) == 'u') || ((txt.charAt(i) == 'A') || (txt.charAt(i) == 'E') || (txt.charAt(i) == 'I')
							|| (txt.charAt(i) == 'O')) || (txt.charAt(i) == 'U')){
				contar++;
			} else
				contarCon++;
		}
		System.out.println(txt + " tiene " + contar + " vocales  ");
		teclado.close();
	}
}