package implementacion;

import java.util.Scanner;

import clases.Alumno;

public class Principal {

	public static void main(String[] args) {
//		int numeros[] = new int[4];
		Scanner entrada = new Scanner(System.in);
		Alumno alumnos[];
		int cantidadAlumnos;
		
		System.out.println("¿Cuantos alumnos desea registrar?");
		cantidadAlumnos = entrada.nextInt();
		alumnos = new Alumno[cantidadAlumnos];
		
		for (int i = 0; i<alumnos.length; i++) {
			Alumno a = new Alumno();
			System.out.print("Cuenta: ");
			a.setCuenta(entrada.next());
			System.out.print("Nombre: ");
			a.setNombre(entrada.next());
			System.out.print("Apellido: ");
			a.setApellido(entrada.next());
			System.out.print("Edad: ");
			a.setEdad(entrada.nextInt());
			System.out.print("Carrera: ");
			a.setCarrera(entrada.next());
			alumnos[i] = a;	
		}
		
		System.out.println("--------Listado de alumnos registrados--------");
		for (int i = 0; i<alumnos.length; i++) {
			System.out.println(alumnos[i]);
		}
		
	}

}
