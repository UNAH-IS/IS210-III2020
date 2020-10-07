package ejemplos;

public class EjemploArreglosMulti {

	public static void main(String[] args) {
		int matriz[][] = new int[14][24]; 
		
		//Asignar valores
		for (int i = 0;i<matriz.length;i++){ //0
			for (int j = 0;j<matriz[i].length;j++){
				matriz[i][j] = (i+1) * (j+1);
			}
		}

		//Imprimir valores
		for (int i = 0;i<matriz.length;i++){
			for (int j = 0;j<matriz[i].length;j++){
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

}
