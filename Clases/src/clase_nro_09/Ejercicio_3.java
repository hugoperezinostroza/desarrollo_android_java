/*	Ejercicio:	3 Individual
 *  Clase:		9
 *  Alumno:		Hugo Pérez
 * 
 *Lee un número por teclado y comprueba que este número es mayor o igual que cero, si no lo es lo volverá a pedir (do while), 
 *después muestra ese número por consola. */

package clase_nro_09;

import java.util.Scanner;


public class Ejercicio_3 {


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int resul;
		do{
			System.out.println("Ingrese número mayor a 0");
			System.out.print("");
			resul=sc.nextInt();
		}
		
		while(resul<=0); 
		System.out.println("Felicitaciones! el número: " +resul+ " es mayor a 0");
		
	}

}
