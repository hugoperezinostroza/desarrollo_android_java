package clase_nro_13;

public class Password {
	Integer longitud;
	String contrasena;
	
	public Password() {
	}
	
	public Password(Integer longitud, String contrasena) {
		this.longitud = longitud;
		this.contrasena = contrasena;

	}
	public Integer getLongitud() {
		return this.longitud;
	}
	public String getContrasena() {
		return this.contrasena;
	}

	public void setLongitud(Integer longitud) {
		this.longitud = longitud;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
}


