package evaluacion_java2;

/**
 *  @author Hugo Perez
 * 	@version 1.0
 */



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Tablero {


	public static int numerosFila = 15;
	public static int numerosColumnas = 15;
	
	public static int puntaje = 0;
	public static char [][] tablero = new char[numerosFila][numerosColumnas];

	private static Carro carros[] = new Carro[18]; 
	public ArrayList<Huevo> Huevos = new ArrayList <Huevo>();
	private static Scanner lector = new Scanner(System.in);

	

	public static int getNumerosFila() {
		return numerosFila;
	} 


	public static void setNumerosFila(int numerosFila) {
		Tablero.numerosFila = numerosFila;
	} 


	public static int getNumerosColumnas() {
		return numerosColumnas;
	} 

	
	public static void setNumerosColumnas(int numerosColumnas) {
		Tablero.numerosColumnas = numerosColumnas;
	} 


	public static char[][] getTablero() {
		return tablero;
	} 


	public static void setTablero(char[][] tablero) {
		Tablero.tablero = tablero;
	} 


	public Carro[] getCarros() {
		return carros;
	} 


	public void setCarros(Carro[] carros) {
		this.carros = carros;
	} 


	public List<Huevo> getHuevos() {
		return Huevos;
	} 

	
	public void setHuevos(ArrayList<Huevo> huevos) {
		Huevos = huevos;
	} 


	public Tablero() {	
	} 

	
	/**
	 * Método para lanzar huevo y calcular puntaje
	 */
	
	public static void LanzarHuevo() {
		String opcionFila;
		String opcionColumna;
		String opFallaste;
		
		JOptionPane.showMessageDialog(null, "Lanza tu huevo");
		opcionFila = JOptionPane.showInputDialog("Ingresa fila: ");
		
		opcionColumna = JOptionPane.showInputDialog("Ingresa Columna: ");
		
		
		
		int fila;
		int columna;
		
		int intentar;
		
		fila = Integer.parseInt(opcionFila);
		columna = Integer.parseInt(opcionColumna);
	
		
		if (tablero[fila][columna] == 'K') {
			tablero[fila][columna] = 'H';
			puntaje = puntaje + 3;
			JOptionPane.showMessageDialog(null, "Boom!! en el blanco");
		} 
		
		else if (tablero[fila][columna] == 'C') {
			tablero[fila][columna] = 'H';
			puntaje = puntaje + 2;
			JOptionPane.showMessageDialog(null, "Boom!! en el blanco");
		} 
		
		else if (tablero[fila][columna] == 'T') {
			tablero[fila][columna] = 'H';
			puntaje = puntaje + 1;
			JOptionPane.showMessageDialog(null, "Boom!! en el blanco");
		} 
		
		else if (tablero[fila][columna] == 'H') {
			tablero [fila][columna] = 'H';
			JOptionPane.showMessageDialog(null, "Ya golpeaste a un Carro en esta posicion");
		} 
		
		else if (tablero[fila][columna] == 'X')
			JOptionPane.showMessageDialog(null, "Ya ocupaste esta coordenadas");
		else{
			tablero[fila][columna] = 'X';
			JOptionPane.showMessageDialog(null, "Fallaste");
		} 
		
		
		for (int i=0; i<3;i++) {
			Carro kro = carros[i];
			int x = kro.getX();
			int y = kro.getY();
			if (tablero[x][y] == 'H' && tablero[x+1][y] == 'H' && tablero[x+2][y] == 'H') {
				puntaje += 10;
			}
		}
		
		for (int i=3; i<8;i++) {
			Carro cag = carros[i];
			int x = cag.getX();
			int y = cag.getY();
			if (tablero[x][y] == 'H' && tablero[x][y+1] == 'H') {
				puntaje += 7;
			}
		} 
		
	} 

	public static void CalcularPuntaje(){
		JOptionPane.showMessageDialog(null, "Tu puntaje es: " + puntaje);
	} 

	
	public static int getPuntaje() {
		return puntaje;
	} 


	public static void setPuntaje(int puntaje) {
		Tablero.puntaje = puntaje;
	} 


	public void crearCarro() {
		
		carros[0] = CrearKromi();
		carros[1] = CrearKromi();
		carros[2] = CrearKromi();
		carros[3] = crearCaguano();
		carros[4] = crearCaguano();
		carros[5] = crearCaguano();
		carros[6] = crearCaguano();
		carros[7] = crearCaguano();
		carros[8] = crearTrupalla();
		carros[9] = crearTrupalla();
		carros[10] = crearTrupalla();
		carros[11] = crearTrupalla();
		carros[12] = crearTrupalla();
		carros[13] = crearTrupalla();
		carros[14] = crearTrupalla();
		carros[15] = crearTrupalla();
		carros[16] = crearTrupalla();
		carros[17] = crearTrupalla();				
	} 
	
	
	
	/**
	 * @return CrearKromi para crear Kromi
	 */
	
	public Kromi CrearKromi() {
		
		int x;
		int y;
		String fechaIng;
		String marca;
		String yearFabri;
		
		boolean  posicionVacia= false;
		
		
		String numOcupantes = JOptionPane.showInputDialog("Ingrese numero de ocupantes: ");
		
		int ocupante=Integer.parseInt(numOcupantes);
				
		fechaIng = JOptionPane.showInputDialog("Fecha ingreso Kromis: ");
				
		marca = JOptionPane.showInputDialog("Ingrese marca de la Kromi: ");
					
		yearFabri = JOptionPane.showInputDialog("Ingrese anio fabricacion: ");
					
			do {
								
			x=(int)(Math.random()*13);
			y=(int)(Math.random()*15);
		
			if (tablero[x][y]!='T' && tablero[x][y]!='C' && tablero[x][y]!='K') {
			
				if (tablero[x+1][y]!='T' && tablero[x+1][y]!='C' && tablero[x+1][y]!='K') {
					if (tablero[x+2][y]!='T' && tablero[x+2][y]!='C' && tablero[x+2][y]!='K') {
						posicionVacia = true ;
						tablero[x][y]='K';
						tablero[x+1][y]='K';
						tablero[x+2][y]='K';
						
					}
				}
			}  
		
		}while(!posicionVacia); 
		
		
		Kromi Kro = new Kromi(ocupante, fechaIng, x, y, yearFabri, marca);
			
		return Kro;
				
	}
	
	
	/**
	 * @return crearCaguano para crear Caguanos
	 */
	
	public Caguano crearCaguano() {

		int x;
		int y;
		String fechaing;
		String tiro;
		String colorConfeti;
		
		boolean posicionVacio= false;
		
		JOptionPane.showMessageDialog(null, "Creando Caguanos");
				
		String numOcupantes = JOptionPane.showInputDialog("Ingrese numero de ocupantes: ");
		
		int ocupantes =Integer.parseInt(numOcupantes);
		
		
		fechaing = JOptionPane.showInputDialog("Ingrese fecha ingreso: ");
		
		tiro = JOptionPane.showInputDialog("Ingrese largo de tiro: ");
				
		colorConfeti = JOptionPane.showInputDialog("Ingrese color confeti: ");
		
		do {
			x=(int)(Math.random()*15);
			y=(int)(Math.random()*14);
		
			if (tablero[x][y]!='T' && tablero[x][y]!='C' && tablero[x][y]!='K') {
			
				if (tablero[x][y+1]!='T' && tablero[x][y+1]!='C' && tablero[x][y+1]!='K') {
					
						posicionVacio = true ;
						tablero[x][y]='C';
						tablero[x][y+1]='C';
				}
			}
			
		}while(!posicionVacio);
		
		Caguano cagua = new Caguano (ocupantes,fechaing,x,y,tiro,colorConfeti);
		
		return cagua;
				
	}

	
	/**
	 * @return crearTrupalla para crear Kromi	 */
	
	
	public Trupalla crearTrupalla() {
		int x;
		int y;
		String fechaing;
		String nivelArm;
		
		
		boolean vacio= false;
		
		String numOcupantes = JOptionPane.showInputDialog("Ingrese numero de ocupantes: ");
		
		int ocupantes =Integer.parseInt(numOcupantes);
		
		fechaing = JOptionPane.showInputDialog("Ingrese fecha ingreso: ");
		
		nivelArm = JOptionPane.showInputDialog("Ingresa armadura de Trupalla: ");
		
		int nivelArmadura = Integer.parseInt(nivelArm);
		
		
		do {
			x=(int)(Math.random()*15);
			y=(int)(Math.random()*15);
		
			if (tablero[x][y]!='T' && tablero[x][y]!='C' && tablero[x][y]!='K') {
	
						vacio = true ;
						tablero[x][y]='T';
			} 

		}while(!vacio);
		
		Trupalla trupa = new Trupalla (ocupantes,fechaing,x,y,nivelArmadura);
		
		return trupa;
	} 


	
	public static void MostarMatriz() {
		
		System.out.println("El tablero es el siguiente \n");
		for (int i = 0; i < 15; i++) {
			System.out.print("|");
			for (int j = 0; j <15; j++) {
				System.out.print(tablero[i][j]+"|");
			} 
			System.out.println("");
		}
	}
	
	
}