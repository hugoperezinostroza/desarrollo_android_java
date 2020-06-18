package clase_nro_10;

public class Ejercicio_en_clases_02_Corregido {

		public static void main(String arg[]) {
			int numeros[], resultado[];
			// Inicializamos los Arrays
			numeros = new int[100];
			resultado = new int[3];
			// Inicializamos el Array
			for (int i = 0; i < 100; i++) {
				numeros[i] = i + 1;
			}
			// Sumamos el array
			for (int i = 0; i < 100;i++) {
				resultado[0] = resultado[0] + numeros[i];
			}
			// Obtenemos el promedio el array
			resultado[1] = resultado[0] / 100;		
			// Cantidad de numeros multiplos de 3
			for (int i = 0; i < 100; i = i + 3) {
				resultado[2] = resultado[2] + 1;
			}
			for (int i = 0; i < 3; i++) {
				System.out.println("El resultado es " +resultado[i]);
			}
		}
	}