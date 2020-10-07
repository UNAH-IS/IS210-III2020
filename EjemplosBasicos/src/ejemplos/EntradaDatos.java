package ejemplos;

import java.util.Scanner;

public class EntradaDatos {
	public static void main(String[] args){
		String nombre;
		String apellido;
		int a;
		int b;
		int suma;
		Scanner entrada; 
		
		entrada = new Scanner(System.in);
		System.out.print("Nombre: ");
		nombre = entrada.next();
		entrada.nextLine();
		System.out.print("Apellido: ");
		apellido = entrada.nextLine();
		System.out.print("Ingrese un numero: ");
		a = entrada.nextInt();
		System.out.print("Ingrese otro numero: ");
		b = entrada.nextInt();
		suma = a + b;
		System.out.print("Hola " + nombre + ", la suma de los numeros que ingreso es: " + suma);

		entrada.close();
	}
}