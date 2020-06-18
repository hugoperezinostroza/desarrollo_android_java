/*	Ejercicio:	2 Individual
 *  Clase:		12
 *  Alumno:		Hugo Pérez
 * 
 *Dada una cadena invertir la misma y mostrar por pantalla. Ejemplo: Entrada: "casa blanca" Salida: "acnalb asac"aaaaaaa */

package clase_nro_12;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String cadena;
		char letras;
		System.out.println("Ingrese Texto a invertir");
		cadena=sc.nextLine();
				
		for (int i=cadena.length()-1; i>=0; i--) {
			letras=cadena.charAt(i);
			System.out.print(letras);

		
		}
	}

}
