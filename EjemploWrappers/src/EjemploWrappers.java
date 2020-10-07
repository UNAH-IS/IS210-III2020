import java.util.ArrayList;

import javax.swing.JOptionPane;


public class EjemploWrappers {
	public static void main(String args[]) {
		Persona p = new Persona();
		p.ingresarIformacion();
		System.out.println(p);
		
		
//		boolean valido = false;
//		
//		do {
//			try {
//				int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
//				valido = true;
//				JOptionPane.showMessageDialog(null, edad);
//			} catch (NumberFormatException e) {
//				valido = false;
//				JOptionPane.showMessageDialog(null, "Edad no válida, debe ingresar un entero");
//			}
//		} while (!valido);
	}
}
