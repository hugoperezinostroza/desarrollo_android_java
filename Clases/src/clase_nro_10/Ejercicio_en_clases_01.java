package clase_nro_10;
import java.util.ArrayList; 
public class Ejercicio_en_clases_01 {

	public static void main(String arg[]) {
		
       ArrayList listaNums = new ArrayList();
       listaNums.add(8);
       listaNums.add(3);
       listaNums.add(5); 
       
       
       System.out.println("Lista de numeros : " + listaNums);  
       System.out.println("Número posición 3: " + listaNums.get(2)); 
       listaNums.set(2, 15);
       System.out.println("Lista de numeros: " + listaNums);
   }
} 