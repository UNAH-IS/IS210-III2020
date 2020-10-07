package ejemplos;

public class SobrecargaMetodos {
	public static int sumar(int a, int b){
		return a + b;		
	}
	
	public static double sumar(double a, double b){
		return a + b; 
	}
	
	public static float sumar(float a, float b){
		return a + b; 
	}
	
	public static int sumar(int a, int b, int c){
		return a + b + c;
	}

	public static void main(String[] args) {
		System.out.println("Suma: " + sumar(10.3, 11.3));
	}

}
