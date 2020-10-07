package implementacion;

import java.util.ArrayList;
import java.util.Scanner;

import clases.Alumno;

public class Principal {
	private Scanner entrada;
	private ArrayList<Alumno> alumnos;
	private int opcion;
	
	public Principal() {
		entrada = new Scanner(System.in);
		alumnos = new ArrayList<Alumno>(); //RawType
		
		do {
			System.out.println(
					"Seleccione una opción\n"
					+ "1. Agregar Alumno\n"
					+ "2. Modificar Alumno\n"
					+ "3. Eliminar un Alumno\n"
					+ "4. Mostrar información\n"
					+ "0. Salir"
			);
			opcion = entrada.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("Agregar un nuevo alumno");
				agregarAlumno();
				break;
			case 2:
				modificarAlumno();
				break;
			case 3:
				eliminarAlumno();
				break;
			case 4:
				mostrarAlumnos();
				break;
			case 0:
				System.out.println("Adios");
				break;
			default:
				System.out.println("Opción inválida");
				break;
			}
		} while (opcion != 0);
		
		entrada.close();
	}

	public void agregarAlumno() {
		Alumno a = new Alumno();
		a.ingresarInformacion(entrada);
		alumnos.add(a);
	}
	
	public void mostrarAlumnos() {
		System.out.println("---Alumnos registrados-----");
		for(int i=0; i<alumnos.size(); i++) {
			System.out.println(alumnos.get(i));
		}
	}

	public void eliminarAlumno() {
		int indiceSeleccionado;
		System.out.println("¿Que alumno desea eliminar? (0-"+(alumnos.size() - 1)+")");
		indiceSeleccionado = entrada.nextInt();
		alumnos.remove(indiceSeleccionado);
		System.out.println("Usuario eliminado");
	}
	
	public void modificarAlumno() {
		int indiceSeleccionado;
		System.out.println("¿Que alumno desea modificar? (0-"+(alumnos.size() - 1)+")");
		indiceSeleccionado = entrada.nextInt();
		alumnos.get(indiceSeleccionado).ingresarInformacion(entrada);
	}

	public static void main(String[] args) {
		new Principal();
	}

}
