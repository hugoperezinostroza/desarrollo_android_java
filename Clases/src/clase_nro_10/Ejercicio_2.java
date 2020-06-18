/*	Ejercicio:	2 Individual
 *  Clase:		10
 *  Alumno:		Hugo Pérez
 * 
 *Estructure un Array de números donde le indicamos por teclado el tamaño del Array, rellenaremos el Array con números 
 *aleatorios entre 0 y 9, al final muestra por pantalla el valor de cada posición y la suma de todos los valores. 
 *Haz un método para rellenar el Array (que tenga como parámetros los números entre los que tenga que generar), para 
 *mostrar el contenido y la suma del Array y un método privado para generar número aleatorio (lo puedes usar para otros 
 *ejercicios).*/



package clase_nro_10;

import javax.swing.JOptionPane; //Forma para pedir datos con una ventana flotante

public class Ejercicio_2 {

	   public static void main(String[] args) {
		   
	        //Indicamos el tamaño
	        String texto=JOptionPane.showInputDialog("Define tamaño del Array");
	        int num[]=new int[Integer.parseInt(texto)];
	 
	        //Invocamos las funciones
	        rellenarNumAleatorioArray(num, 0, 9);
	        mostrarArray(num);
	    }
	 
	    private static void rellenarNumAleatorioArray(int lista[], int a, int b){
	        for(int i=0;i<lista.length;i++){
	            //Generamos un número entre los parametros pasados
	            lista[i]=((int)Math.floor(Math.random()*(a-b)+b));
	        }
	    }
	 
	    public static void mostrarArray(int lista[]){
	        for(int i=0;i<lista.length;i++){
	            System.out.println("Indice "+i+" se encuentra el valor "+lista[i]);
	        }
	    }
	}