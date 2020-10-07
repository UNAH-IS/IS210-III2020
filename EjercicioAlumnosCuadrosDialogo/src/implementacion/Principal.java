package implementacion;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import clases.Alumno;
import clases.Asignatura;
import clases.Carrera;

public class Principal {
	private ArrayList<Alumno> alumnos;
	public static ArrayList<Carrera> carreras;
	private ArrayList<Asignatura> asignaturas;
	private int opcion;
	
	public Principal() {
		alumnos = new ArrayList<Alumno>(); //RawType
		carreras = new ArrayList<Carrera>();
		asignaturas = new ArrayList<Asignatura>();
		
		//Agregar carreras
		carreras.add(new Carrera(1 , "Ing en Sistemas", 50));
		carreras.add(new Carrera(2 , "Ing en Quimica", 40));
		carreras.add(new Carrera(3 , "Ing en Industrial", 45));
		
		//Agregar Asignaturas
		asignaturas.add(new Asignatura(1, "Matematica I", 5));
		asignaturas.add(new Asignatura(2, "Algebra y Trigonometría", 5));
		asignaturas.add(new Asignatura(3, "Calculo I", 5));
		asignaturas.add(new Asignatura(4, "Calculo II", 5));
		asignaturas.add(new Asignatura(5, "Ecuaciones diferenciales", 5));
		asignaturas.add(new Asignatura(6, "Vectores y matrices", 5));
		
		
		do {
			opcion = Integer.parseInt(
						JOptionPane.showInputDialog(
							"Seleccione una opción\n"
							+ "1. Agregar Alumno\n"
							+ "2. Modificar Alumno\n"
							+ "3. Eliminar un Alumno\n"
							+ "4. Mostrar información\n"
							+ "5. Matricular asignatura\n"
							+ "6. Agregar Carrera\n"
							+ "0. Salir"
						)
					);
			
			switch(opcion) {
			case 1:
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
			case 5:
				matricularAsignatura();
				break;
			case 0:
				System.out.println("Adios");
				break;
			default:
				System.out.println("Opción inválida");
				break;
			}
		} while (opcion != 0);
	}

	public void agregarAlumno() {
		Alumno a = new Alumno();
		a.ingresarInformacion();
		alumnos.add(a);
	}
	
	public void mostrarAlumnos() {
		System.out.println("---Alumnos registrados-----");
		String cadenaAlumnos = "";
		for(int i=0; i<alumnos.size(); i++) {
			cadenaAlumnos += alumnos.get(i) + "\n";
		}
		JOptionPane.showMessageDialog(null, cadenaAlumnos);
	}

	public void eliminarAlumno() {
		int indiceSeleccionado;
		indiceSeleccionado = Integer.parseInt(JOptionPane.showInputDialog("¿Que alumno desea eliminar? (0-"+(alumnos.size() - 1)+")"));
		alumnos.remove(indiceSeleccionado);
		JOptionPane.showMessageDialog(null, "Usuario eliminado");
	}
	
	public void modificarAlumno() {
		int indiceSeleccionado;
		indiceSeleccionado = Integer.parseInt(JOptionPane.showInputDialog("¿Que alumno desea modificar? (0-"+(alumnos.size() - 1)+")"));
		alumnos.get(indiceSeleccionado).ingresarInformacion();
	}
	
	public void matricularAsignatura() {
		int indiceAlumnoSeleccionado;
		int indiceAsignaturaSeleccionada;
		//Solicitar el alumno
		indiceAlumnoSeleccionado = Integer.parseInt(JOptionPane.showInputDialog("¿A qué alumno desea matricular la asignatura? (0-"+(alumnos.size() - 1)+")"));
		//Solicitar la clase
		indiceAsignaturaSeleccionada = Integer.parseInt(JOptionPane.showInputDialog("¿Que asignatura desea matricular? (0-"+(asignaturas.size() - 1)+")"));
		//Agregar la clase indicada al alumno indicado
		//Alumno al = alumnos.get(indiceAlumnoSeleccionado);
		//Asignatura as = asignaturas.get(indiceAsignaturaSeleccionada);
		alumnos.get(indiceAlumnoSeleccionado).agregarAsignatura(
			asignaturas.get(indiceAsignaturaSeleccionada)
		);
	}

	public static void main(String[] args) {
		new Principal();
	}

}
