package clase_nro_13;
import clase_nro_13.Password;
public class Pasword2 {

		public static void main(String[] args) {
			Password miPassword3;
			Password miPassword = new Password("Audi", "A3");
			// Password miSegundoPassword = new Password("Mazda", "CX5", 2016);
			Password miSegundoPassword = new Password();
			miSegundoPassword.setLongitud("Mazda");
			miSegundoPassword.setConstrasena("CX5");
			System.out.println("Modelo de mi Password: " + miPassword.toString());
			System.out.println("Modelo de mi 2do Password: "+ miSegundoPassword.toString());
			miPassword.setLongitud("FORD");
			System.out.println("Modelo de mi Password: " + miPassword.toString());
			System.out.println("Modelo de mi 2do Password: "+ miSegundoPassword.toString());
		}
	}
