package clases;

public class Alumno {
	private String cuenta;
	private String nombre;
	private String apellido;
	private int edad;
	private String carrera;
	
	public Alumno(String cuenta, String nombre, String apellido, int edad, String carrera) {
		this.cuenta = cuenta;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.carrera = carrera;
	}
	
	public Alumno() {}
	
	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "Alumno [cuenta=" + cuenta + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", carrera=" + carrera + "]";
	}
}
