/*	Ejercicio:	4 Individual
 *  Clase:		12
 *  Alumno:		Hugo P�rez
 * 
 *Codifica un m�todo, que dado un objeto de la clase String cuente diferentes tipos de caracteres. En particular, el m�todo deber� 
 *imprimir el n�mero de letras, d�gitos y espacios en blanco de la cadena. Intenta hacer un programa que escriba el conteo (por ejemplo) 
 *de la cadena. �Hola, soy Sebasti�n P��era,y soy programador de la generaci�n 2500, de Awakelab� */

package clase_nro_12;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numeros=0, letras=0, espacios=0; 
		
		System.out.println("\n Introduce el texto");
		String texto=sc.nextLine();
		
		for(int i=0; i< texto.length(); i++) {	//Contar N�meros
			if(Character.isDigit(texto.charAt(i))) {
				numeros++;
			}
			else if(Character.isLetter(texto.charAt(i))) { //Contar Texto
					letras++;
				}
			else if(Character.isWhitespace(texto.charAt(i))) { //Contar Espacios
					espacios++;
			}
				
			}
			System.out.println("\n Texto contiene "+texto.length()+" caracteres con un total de:");
			System.out.println("\n "+letras+" letras");
			System.out.println("\n "+numeros+" n�meros");
			System.out.println("\n "+espacios+" espacios");
			}

}
