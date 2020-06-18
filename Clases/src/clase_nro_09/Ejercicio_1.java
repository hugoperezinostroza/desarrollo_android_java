/*	Ejercicio:	1 Individual
 *  Clase:		9
 *  Alumno:		Hugo Pérez
 * 
 *Lee un número por teclado que pida el precio de un producto (este puede incluir decimales) y calcule el 
 *precio final con IVA. El IVA será una constante que será del 19%. */


package clase_nro_09;

import java.util.Scanner;


public class Ejercicio_1 {


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese Valor neto de producto");
		System.out.print("$");
		int precio =sc.nextInt();
		
		double iva = precio*0.19;
		int total =precio+(int)iva;

				
		System.out.println("El IVA del producto es $" +iva);
		System.out.println("El precio final del producto es $" +total);
			

		
	}

}
