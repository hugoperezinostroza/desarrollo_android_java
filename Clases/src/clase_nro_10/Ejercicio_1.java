/*	Ejercicio:	1 Individual
 *  Clase:		10
 *  Alumno:		Hugo Pérez
 * 
 *Programe un Array de 14 posiciones de números con valores pedidos por teclado. Muestra por consola el índice 
 *y el valor al que corresponde. Haz dos métodos, uno para rellenar valores y otro para mostrar. */


package clase_nro_10;

import javax.swing.JOptionPane; //Forma para pedir datos con una ventana flotante


public class Ejercicio_1 {


    public static void main(String[] args) {
    	 
        //Esto es opcional
        final int posiciones=14;
 
        int num[]=new int[posiciones];
 
        //Invocamos las funciones
        rellenarArray(num);
         mostrarArray(num);
    }
 
    public static void rellenarArray(int lista[]){
        for(int i=0; i<lista.length; i++){
            String texto=JOptionPane.showInputDialog("Introduce un número " +(i+1)+ " de " +lista.length);
            lista[i]=Integer.parseInt(texto);
        }
    }
 
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" se encuentra el valor "+lista[i]);
        }
    }
}