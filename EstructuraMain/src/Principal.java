import java.util.Scanner;

public class Principal {
	Scanner entrada;
	public Principal() {
		//Toda la logica del programa
		entrada = new Scanner(System.in);
		System.out.println("Suma: " + suma(5,4));
	}
	
	public int suma(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		new Principal(); //Instancia u objeto anonimo
	}
}
