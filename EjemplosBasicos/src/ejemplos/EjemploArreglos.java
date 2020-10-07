package ejemplos;

public class EjemploArreglos {
	public static void main(String args[]){
		int[] numeros = new int[10];
		//Almacenar valores
		for (int i=0; i < numeros.length;i++)
			numeros[i] = (i+1) * 10;

		//Mostrar valores
		for (int i=0; i < numeros.length;i++)
		   System.out.println("Elemento["+i+"]= "+numeros[i]);

	}
}
