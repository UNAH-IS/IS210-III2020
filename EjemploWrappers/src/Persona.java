import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Persona {
	private String identificacion;
	private String nombre;
	private String apellido;
	private String correo;
	public Persona(String identificacion, String nombre, String apellido, String correo) {
		super();
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
	}
	public Persona() {}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	@Override
	public String toString() {
		return "Persona [identificacion=" + identificacion + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	public void ingresarIformacion() {
		do {
			this.identificacion = JOptionPane.showInputDialog("Identificación: ");
		} while (!verificarIdentificacion());
		
		do {
			this.correo = JOptionPane.showInputDialog("Correo: ");
		} while (!verificarCorreo());
		this.nombre = JOptionPane.showInputDialog("Nombre: ");
		this.apellido= JOptionPane.showInputDialog("Apellido: ");
	}
	
	public boolean verificarIdentificacion() {
		String patron = "[0-9]{4}-[0-9]{4}-[0-9]{5}";
		return Pattern.matches(patron, this.identificacion);
	}
	
	public boolean verificarCorreo() {
		String patron = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";
		return Pattern.matches(patron, this.correo);
	}
}
