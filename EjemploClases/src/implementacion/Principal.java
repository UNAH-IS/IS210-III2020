package implementacion;

import clases.Circulo;

public class Principal {

	public static void main(String[] args) {
		//int a = 10;
		Circulo c1 = new Circulo(20, 30, 15, "Black");
		Circulo c2 = new Circulo();
		c2.setX(10);
		c2.setY(20);
		c2.setColor("Yellow");
		c2.setDiametro(20);
//		System.out.println("Area c1: " + c1.calcularArea());
//		System.out.println("Area c2: " + c2.calcularArea());
//		System.out.println(c1);
		
		Circulo.diametroPromedio = 50;
		System.out.println(Circulo.diametroPromedio);
		System.out.println(Circulo.COLOR_BASE);
		
	}
}
