package evaluacion_java;

public class Ejecutable {
	 
    public static void main(String[] args) {
        double sumaElectrodomesticos=0;
        double sumaTelevisiones=0;
        double sumaLavadoras=0;
   
    	//Array
        Electrodomestico listaElectrodomesticos[]=new Electrodomestico[10];
        
        //Datos nuestros en el Array
        listaElectrodomesticos[0]=new Electrodomestico(200, 60, 'E', "rojo");
        listaElectrodomesticos[1]=new Lavadora(180, 70);
        listaElectrodomesticos[2]=new Television(400, 30, 'A', "blanco", 40, false);
        listaElectrodomesticos[3]=new Television(300, 60);
        listaElectrodomesticos[4]=new Electrodomestico(600, 20, 'D', "gris");
        listaElectrodomesticos[5]=new Lavadora(300, 40, 'G', "blanco", 40);
        listaElectrodomesticos[6]=new Television(250, 70);
        listaElectrodomesticos[7]=new Electrodomestico(300, 40, 'C', "negro");
        listaElectrodomesticos[8]=new Television(200, 60, 'F', "naranja", 30, true);
        listaElectrodomesticos[9]=new Electrodomestico(80, 30);
   


        for(int i=0;i<listaElectrodomesticos.length;i++){

            if(listaElectrodomesticos[i] instanceof Electrodomestico){
                sumaElectrodomesticos+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Lavadora){
                sumaLavadoras+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Television){
                sumaTelevisiones+=listaElectrodomesticos[i].precioFinal();
            }
        }   
          
        // impresión de resultados
        System.out.println("La suma del precio de los electrodomesticos es de $" +sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de $"+sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de $"+sumaTelevisiones);
   
    }
   
}