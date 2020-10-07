package ejemplos;

public class OperadoresUnarios {
	public static void main(String[] args){
		final int ALTURA_MAXIMA;
		int a = 2;
		int b = 2;
		System.out.println(a++); //Imprime 2
		System.out.println(++b); //Imprime 3
		System.out.print("Estado Final (a) :");
		System.out.println(a); //Imprime 3
		System.out.print("Estado Final (b) :");
		System.out.println(b); //Imprime 3
		
		ALTURA_MAXIMA = 100;
	}
}