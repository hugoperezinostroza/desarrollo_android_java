/*	Ejercicio:	3 Individual
 *  Clase:		9
 *  Alumno:		Hugo P�rez
 * 
 *Lee un n�mero por teclado y comprueba que este n�mero es mayor o igual que cero, si no lo es lo volver� a pedir (do while), 
 *despu�s muestra ese n�mero por consola. */

package clase_nro_09;

import java.util.Scanner;


public class Ejercicio_3 {


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int resul;
		do{
			System.out.println("Ingrese n�mero mayor a 0");
			System.out.print("");
			resul=sc.nextInt();
		}
		
		while(resul<=0); 
		System.out.println("Felicitaciones! el n�mero: " +resul+ " es mayor a 0");
		
	}

}
