/*	Ejercicio:	3 (1 Grupal)
 *  Clase:		10
 *  Alumno:		Hugo Pérez
 * 
 *Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las mayúsculas). Después, ve pidiendo posiciones del array 
 *por teclado y si la posición es correcta, se añadirá a una cadena que se mostrara al final, se dejará de insertar cuando se 
 *introduzca un -1. Por ejemplo, si escribo los siguientes números 0 //Añadirá la ‘A’ 5 //Añadirá la ‘F’ 25 //Añadirá la ‘Z’ 50  //
 *Error, inserte otro número -1 //fin Cadena resultante: AFZ.*/

package clase_nro_10;
import java.util.Scanner;
public class Ejercicio_3_grupal {

	public static void main(String[] args) {
		 
        Scanner sc = new Scanner(System.in);
 
        char mayusculas[] = new char[26];
        for (int i = 65, j = 0; i <= 90; i++, j++) {
            mayusculas[j] = (char) i;
        }
 
        String cadena = "";
        int eleccion = -1;
 
        do {
            System.out.println("Elija un indice entre 0 y " + (mayusculas.length - 1)+" o ingrese -1 para salir");
            eleccion = sc.nextInt();
 
            if (!(eleccion >= 0 && eleccion <= mayusculas.length - 1)) {
                System.out.println("Error, inserte otro numero");
            } else {
                if (eleccion != -1) {
                    cadena += mayusculas[eleccion];
                }
            }
 
        } while (eleccion != -1);
 
        System.out.println("La palabra creada es: "+cadena);
 
    }
 
}