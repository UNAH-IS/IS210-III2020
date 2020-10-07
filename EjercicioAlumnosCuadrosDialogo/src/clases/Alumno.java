package clases;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import implementacion.Principal;

public class Alumno {
	private String cuenta;
	private String nombre;
	private String apellido;
	private int edad;
	private Carrera carrera;
	private ArrayList<Asignatura> asignaturas;
	
	public Alumno(String cuenta, String nombre, String apellido, int edad, Carrera carrera) {
		this.cuenta = cuenta;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.carrera = carrera;
		this.asignaturas = new ArrayList<Asignatura>();
	}
	
	public Alumno() {
		this.asignaturas = new ArrayList<Asignatura>();
	}
	
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

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "Alumno [cuenta=" + cuenta + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", carrera=" + carrera + "], \n => Asignaturas = " + asignaturas;
	}
	
	public void ingresarInformacion() {
		int indiceCarreraSeleccionada;
		this.cuenta = JOptionPane.showInputDialog("Cuenta: ", this.cuenta);
		this.nombre = JOptionPane.showInputDialog("Nombre:", this.nombre);
		this.apellido = JOptionPane.showInputDialog("Apellido", this.apellido);
		this.edad = Integer.parseInt(JOptionPane.showInputDialog("Edad:", this.edad));
		indiceCarreraSeleccionada = Integer.parseInt(JOptionPane.showInputDialog("¿Que carrera desea seleccionar? 0-" + (Principal.carreras.size()-1)));
		this.carrera = Principal.carreras.get(indiceCarreraSeleccionada);
	}
	
	public void agregarAsignatura(Asignatura asignatura) {
		asignaturas.add(asignatura);
	}
}
