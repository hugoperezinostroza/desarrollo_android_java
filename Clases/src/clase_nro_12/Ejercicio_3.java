/*	Ejercicio:	3 Individual
 *  Clase:		12
 *  Alumno:		Hugo P�rez
 * 
 *Dada una palabra (cad=cadena) y un vocal (car�cter= car), verificar cu�ntas veces se repite el car�cter car en la cadena cad. 
 *Ejemplo: Entrada: cad = "casa blanca", car = 'a' Salida: El car�cter 'a' se repite 4 veces */

package clase_nro_12;
import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String arg[]) {
		
      	Scanner sc = new Scanner(System.in);
		System.out.println("ingrese la cadena");
		String cadena = sc.nextLine();
		System.out.println("ingrese la letra a buscar");
		String caracter=sc.next();
		char car= caracter.charAt(0);
				
		int cantidadRepeticiones =0;
		
		for (int i = 0 ; i < cadena.length() ; i++) {
			char aux=cadena.charAt(i);
			
			if(aux == car) {
				cantidadRepeticiones++;
			}
		}
		
		System.out.println("la cantidad de repeticiones es: " + cantidadRepeticiones);
		}
		
		}